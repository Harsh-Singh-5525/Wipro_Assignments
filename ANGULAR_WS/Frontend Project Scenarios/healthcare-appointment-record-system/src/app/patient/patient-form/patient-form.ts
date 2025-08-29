// src/app/patient/patient-form/patient-form.component.ts
import { Component } from '@angular/core';
import { PatientService } from '../../services/patient';
import { Patient } from '../../shared/models/patient.model';

@Component({
  selector: 'app-patient-form',
  template: `
  <h2>Add Patient</h2>
  <form (ngSubmit)="onSave()" #f="ngForm">
    <input name="name" [(ngModel)]="patient.name" placeholder="Name" required/>
    <input name="insuranceId" [(ngModel)]="patient.insuranceId" placeholder="Insurance ID"/>
    <input name="contactNumber" [(ngModel)]="patient.contactNumber" placeholder="Contact"/>
    <input name="email" type="email" [(ngModel)]="patient.email" placeholder="Email"/>
    <button type="submit">Save</button>
  </form>
  <p *ngIf="saved">Saved!</p>
  `
})
export class PatientForm {
  patient: Patient = { name: '', insuranceId: '', contactNumber: '', email: '' };
  saved = false;
  constructor(private patientService: PatientService) {}
  onSave() {
    this.patientService.create(this.patient).subscribe(() => this.saved = true);
  }
}
