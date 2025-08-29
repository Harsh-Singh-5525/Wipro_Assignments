// src/app/services/doctor.ts
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Doctor } from '../shared/models/doctor.models';

@Injectable({ providedIn: 'root' })
export class DoctorService {
  private baseUrl = 'http://localhost:6062/api/doctors';
  constructor(private http: HttpClient) {}
  getAll(): Observable<Doctor[]> { return this.http.get<Doctor[]>(this.baseUrl); }
  getById(id: number): Observable<Doctor> { return this.http.get<Doctor>(`${this.baseUrl}/${id}`); }
  create(doctor: Doctor): Observable<Doctor> { return this.http.post<Doctor>(this.baseUrl, doctor); }
}
