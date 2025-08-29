import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MedicalrecordForm } from './medicalrecord-form';

describe('MedicalrecordForm', () => {
  let component: MedicalrecordForm;
  let fixture: ComponentFixture<MedicalrecordForm>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [MedicalrecordForm]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MedicalrecordForm);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
