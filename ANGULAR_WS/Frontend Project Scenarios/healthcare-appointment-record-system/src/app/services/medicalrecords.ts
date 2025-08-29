// src/app/services/medicalrecords.ts
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { MedicalRecord } from '../shared/models/medicalrecord.models';

@Injectable({ providedIn: 'root' })
export class MedicalRecordsService {
  private baseUrl = 'http://localhost:6064/api/medical-records';
  constructor(private http: HttpClient) {}
  getAll(): Observable<MedicalRecord[]> { return this.http.get<MedicalRecord[]>(this.baseUrl); }
  getById(id: number): Observable<MedicalRecord> { return this.http.get<MedicalRecord>(`${this.baseUrl}/${id}`); }
  create(record: MedicalRecord): Observable<MedicalRecord> { return this.http.post<MedicalRecord>(this.baseUrl, record); }
}
