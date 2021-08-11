import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {CustomerService} from '../../../../service/customer/customer.service';
import {ActivatedRoute, Router} from '@angular/router';
import {CustomerType} from '../../model/customer-type';


@Component({
  selector: 'app-customer-update',
  templateUrl: './customer-update.component.html',
  styleUrls: ['./customer-update.component.css']
})
export class CustomerUpdateComponent implements OnInit {
  customerTypeList: CustomerType[];

  customers:any[];

  alert:boolean = false;

  public maxDate = new Date();
  public minDate = new Date(1900, 1,1)
  editCustomer = new FormGroup({
    id: new FormControl('',[Validators.required]),
    customerType:new FormControl('',[Validators.required]),
    name:new FormControl('',[Validators.required]),
    birthDate:new FormControl('',[Validators.required]),
    gender:new FormControl('',[Validators.required]),
    idCard:new FormControl('',[Validators.required]),
    phone:new FormControl('',[Validators.required]),
    email:new FormControl('',[Validators.required]),
    address:new FormControl('',[Validators.required]),
  })
  constructor(
    private customer: CustomerService,
    private router: ActivatedRoute,
    private route: Router
  ) { }

  ngOnInit(): void {
    this.getAllCustomerType();

    console.log(this.router.snapshot.params.id);
    this.customer.findCustomerById(this.router.snapshot.params.id).subscribe((result) => {
      console.log(result);
      this.editCustomer.setValue(result);
      console.log(this.editCustomer);
    })
  }

  updateCustomer(){
    this.customer.updateCustomer(this.router.snapshot.params.id).subscribe((result) => {
      console.log(result, 'data update success');
      this.alert = true;
      this.route.navigateByUrl('list')
    })
  }

  getAllCustomerType(){
    this.customer.getCustomerType().subscribe((data) => {
      this.customerTypeList = data;
    },error => console.log(error));
  }

  onSubmit(updateForm: FormGroup) {
    this.customer.updateCustomer(updateForm.value).subscribe(
      (data) => {
        this.route.navigateByUrl('list');
        alert("Done!");
      }, error => console.log(error)
    );
  }
}
