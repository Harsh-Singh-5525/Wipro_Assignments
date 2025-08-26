import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AssessmentService } from './assessment-service';

describe('AssessmentService', () => {
  let component: AssessmentService;
  let fixture: ComponentFixture<AssessmentService>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [AssessmentService]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AssessmentService);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
