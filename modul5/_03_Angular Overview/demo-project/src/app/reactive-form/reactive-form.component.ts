import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormControl, FormGroup, Validators} from "@angular/forms";
import {StudentService} from "../student.service";
import {Route, Router} from "@angular/router";
@Component({
  selector: 'app-reactive-form',
  templateUrl: './reactive-form.component.html',
  styleUrls: ['./reactive-form.component.css']
})
export class ReactiveFormComponent implements OnInit {

  constructor( private fb: FormBuilder, private studentService: StudentService, private router:Router) {
  }
    createForm = this.fb.group({
    id: [(''), Validators.required],
    name: [(''), Validators.required],
    age:[('')],
    mark:[('5')],
    avatar:[('')]
  })
  ngOnInit(): void {

  }

  onSubmit(){
    this.router.navigate(['/']);

  }
}
