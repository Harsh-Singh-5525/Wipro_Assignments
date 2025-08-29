import { Routes } from '@angular/router';
import { PatientListComponent } from './patient/patient-list/patient-list';
import { PatientForm } from './patient/patient-form/patient-form';
// ...import other feature components as needed

export const routes: Routes = [
  { path: 'patients', component: PatientListComponent },
  { path: 'patients/new', component: PatientForm },
  // ...repeat for doctor, appointment, etc.
  { path: '', redirectTo: '/patients', pathMatch: 'full' }
];
