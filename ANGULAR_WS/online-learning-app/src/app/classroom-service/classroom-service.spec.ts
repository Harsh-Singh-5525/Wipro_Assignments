import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ClassroomService } from './classroom-service';

describe('ClassroomService', () => {
  let component: ClassroomService;
  let fixture: ComponentFixture<ClassroomService>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ClassroomService]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ClassroomService);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
