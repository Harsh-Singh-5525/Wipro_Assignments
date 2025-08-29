import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BillingForm } from './billing-form';

describe('BillingForm', () => {
  let component: BillingForm;
  let fixture: ComponentFixture<BillingForm>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [BillingForm]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BillingForm);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
