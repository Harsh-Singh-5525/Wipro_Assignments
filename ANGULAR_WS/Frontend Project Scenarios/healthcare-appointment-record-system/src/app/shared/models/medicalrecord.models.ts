// src/app/shared/models/medicalrecord.model.ts
export interface MedicalRecord {
  id?: number;
  patientId: number;
  doctorId: number;
  diagnosis: string;
  prescription: string;
  testResults: string;
  visitDate: string; // YYYY-MM-DD
}
