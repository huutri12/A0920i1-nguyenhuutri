import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormControl, FormGroup, Validators} from "@angular/forms";
import {studentDao} from "../repository/studentDao";

@Component({
  selector: 'app-reactive-form',
  templateUrl: './reactive-form.component.html',
  styleUrls: ['./reactive-form.component.css']
})
export class ReactiveFormComponent implements OnInit {

  createForm = FormGroup;
  constructor( private fb: FormBuilder) {
  }

  ngOnInit(): void {
    // @ts-ignore
    this.createForm = this.fb.group({
      id: [(''), Validators.required],
      name: [(''), Validators.required],
      age:[('')],
      mark:[('5')],
      avatar:[('')]
    })
  }

  onSubmit(){
    studentDao.unshift(this.createForm.value);
  }
}
