import { TestBed } from '@angular/core/testing';

import { Medicalrecords } from './medicalrecords';

describe('Medicalrecords', () => {
  let service: Medicalrecords;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(Medicalrecords);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
