// src/app/shared/models/bill.model.ts
export interface Bill {
  id?: number;
  appointmentId: number;
  amount: number;
  paid?: boolean;
  paymentMethod?: string;
  insuranceClaimNumber?: string;
  invoiceDate?: string;
}
