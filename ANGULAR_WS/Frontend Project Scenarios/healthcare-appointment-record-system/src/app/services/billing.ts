// src/app/services/billing.ts
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Bill } from '../shared/models/bill.models';

@Injectable({ providedIn: 'root' })
export class BillingService {
  private baseUrl = 'http://localhost:6065/api/bills';
  constructor(private http: HttpClient) {}
  getAll(): Observable<Bill[]> { return this.http.get<Bill[]>(this.baseUrl); }
  getById(id: number): Observable<Bill> { return this.http.get<Bill>(`${this.baseUrl}/${id}`); }
  create(bill: Bill): Observable<Bill> { return this.http.post<Bill>(this.baseUrl, bill); }
}
