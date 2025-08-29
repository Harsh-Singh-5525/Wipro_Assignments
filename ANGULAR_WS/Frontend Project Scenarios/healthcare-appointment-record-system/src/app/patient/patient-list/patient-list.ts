import { Component, OnInit } from '@angular/core';
import { PatientService } from '../../services/patient';
import { Patient } from '../../shared/models/patient.model';

@Component({
  selector: 'app-patient-list',
  templateUrl: './patient-list.component.html'
})
export class PatientListComponent implements OnInit {
  patients: Patient[] = [];
  constructor(private patientService: PatientService) {}
  ngOnInit() { this.load(); }
  load() {
    this.patientService.getAll().subscribe(data => this.patients = data);
  }
}
