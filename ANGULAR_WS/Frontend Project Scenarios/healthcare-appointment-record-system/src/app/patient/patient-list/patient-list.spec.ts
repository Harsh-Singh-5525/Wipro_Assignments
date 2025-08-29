import { Component } from '@angular/core';
import { PatientService } from '../../services/patient';
import { Patient } from '../../shared/models/patient.model';

@Component({
  selector: 'app-patient-form',
  templateUrl: './patient-form.component.html'
})
export class PatientFormComponent {
  patient: Patient = { name: '', insuranceId: '', contactNumber: '', email: '' };
  saved = false;
  constructor(private patientService: PatientService) {}
  onSave() {
    this.patientService.create(this.patient).subscribe(() => this.saved = true);
  }
}
