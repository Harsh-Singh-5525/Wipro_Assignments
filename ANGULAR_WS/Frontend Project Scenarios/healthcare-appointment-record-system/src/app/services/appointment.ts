// src/app/services/appointment.ts
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Appointment } from '../shared/models/appointment.models';

@Injectable({ providedIn: 'root' })
export class AppointmentService {
  private baseUrl = 'http://localhost:6063/api/appointments';
  constructor(private http: HttpClient) {}
  getAll(): Observable<Appointment[]> { return this.http.get<Appointment[]>(this.baseUrl); }
  getById(id: number): Observable<Appointment> { return this.http.get<Appointment>(`${this.baseUrl}/${id}`); }
  create(appointment: Appointment): Observable<Appointment> { return this.http.post<Appointment>(this.baseUrl, appointment); }
}
