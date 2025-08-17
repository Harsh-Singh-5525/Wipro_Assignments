package com.practice.assessmentservice.web;
import org.springframework.web.bind.annotation.*; import org.springframework.http.*; import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated; import org.springframework.web.client.RestTemplate; import java.util.*; import java.time.*;
import com.practice.assessmentservice.repo.*; import com.practice.assessmentservice.model.*;
@RestController @RequestMapping("/assessments")
public class AssessmentController {
  private final AssignmentRepository assignmentRepo; private final SubmissionRepository submissionRepo; private final RestTemplate rest;
  public AssessmentController(AssignmentRepository a, SubmissionRepository s, RestTemplate r){this.assignmentRepo=a; this.submissionRepo=s; this.rest=r;}
  @Value("${services.notification}") private String notificationService;
  @PostMapping("/assignments")
  public Assignment createAssignment(@RequestBody @Validated Assignment a){
    Assignment saved=assignmentRepo.save(a);
    Map<String,Object> payload=new HashMap<>(); payload.put("type","ASSIGNMENT_DUE"); payload.put("refId",saved.getId());
    payload.put("message","Assignment due: "+saved.getTitle()); payload.put("sendOn", a.getDueDate()!=null? a.getDueDate().toString(): LocalDate.now().toString());
    try{ rest.postForEntity(notificationService + "/notifications", payload, Map.class);}catch(Exception e){}
    return saved;
  }
  @PostMapping("/assignments/{assignmentId}/submit/{studentId}")
  public ResponseEntity<?> submit(@PathVariable Long assignmentId, @PathVariable Long studentId, @RequestBody(required=false) Map<String,String> body){
    if(!assignmentRepo.existsById(assignmentId)) return ResponseEntity.badRequest().body("Assignment not found");
    Submission s=new Submission(); s.setAssignmentId(assignmentId); s.setStudentId(studentId); s.setContent(body!=null? body.getOrDefault("content",""):"");
    return ResponseEntity.ok(submissionRepo.save(s));
  }
  @GetMapping("/assignments") public List<Assignment> assignments(){return assignmentRepo.findAll();}
}
