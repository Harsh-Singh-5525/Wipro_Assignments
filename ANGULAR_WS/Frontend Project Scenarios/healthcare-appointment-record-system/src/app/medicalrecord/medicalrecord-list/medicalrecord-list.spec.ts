import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MedicalrecordList } from './medicalrecord-list';

describe('MedicalrecordList', () => {
  let component: MedicalrecordList;
  let fixture: ComponentFixture<MedicalrecordList>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [MedicalrecordList]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MedicalrecordList);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
