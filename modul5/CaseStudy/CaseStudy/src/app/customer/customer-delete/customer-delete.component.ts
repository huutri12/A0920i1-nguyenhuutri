import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA} from '@angular/material/dialog';
import {Router} from '@angular/router';
import {CustomerService} from '../../../../service/customer/customer.service';
import {MatSnackBar} from '@angular/material/snack-bar';

@Component({
  selector: 'app-customer-delete',
  templateUrl: './customer-delete.component.html',
  styleUrls: ['./customer-delete.component.css']
})
export class CustomerDeleteComponent implements OnInit {
  id: number;
  name: string;
  constructor( private customerService: CustomerService, private router: Router,
               @Inject(MAT_DIALOG_DATA) public data: any) {
    this.id = data.id;
    this.name = data.name;
  }
  ngOnInit(): void {
  }
  onSubmit(id: number) {
    console.log(id);
    this.customerService.deleteCustomer(id).subscribe(
      (data) => {
        this.router.navigate(['list']);
        alert("Done!");
      }, error => console.log(error)

    );
  }
}
