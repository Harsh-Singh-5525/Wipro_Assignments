// src/app/shared/models/appointment.model.ts
export interface Appointment {
  id?: number;
  patientId: number;
  doctorId: number;
  apptTime: string; // ISO datetime string
  status?: string;
}
