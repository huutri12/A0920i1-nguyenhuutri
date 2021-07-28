import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ArtcleComponent } from './artcle.component';

describe('ArtcleComponent', () => {
  let component: ArtcleComponent;
  let fixture: ComponentFixture<ArtcleComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ArtcleComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ArtcleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
