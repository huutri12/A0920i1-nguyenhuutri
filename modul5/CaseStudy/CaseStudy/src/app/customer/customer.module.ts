import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CustomerListComponent } from './customer-list/customer-list.component';
import { CustomerUpdateComponent } from './customer-update/customer-update.component';
import { CustomerDeleteComponent } from './customer-delete/customer-delete.component';
import { CustomerCreateComponent } from './customer-create/customer-create.component';
import {RouterModule} from '@angular/router';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatInputModule} from '@angular/material/input';
import {CustomRadioButtonModule} from 'custom-radio-button';
import {MatRadioModule} from '@angular/material/radio';
import {MatDialogModule} from '@angular/material/dialog';
import {MatButtonModule} from '@angular/material/button';
import {MatPaginatorModule} from '@angular/material/paginator';
import {NgxPaginationModule} from 'ngx-pagination';
import {Ng2OrderModule} from 'ng2-order-pipe';
import {MatSnackBarModule} from '@angular/material/snack-bar';



@NgModule({
  declarations: [CustomerListComponent, CustomerUpdateComponent, CustomerDeleteComponent, CustomerCreateComponent],
  exports: [
    CustomerListComponent,
    CustomerCreateComponent,
    CustomerUpdateComponent
  ],
  imports: [
    CommonModule,
    RouterModule,
    ReactiveFormsModule,
    MatDatepickerModule,
    MatFormFieldModule,
    MatInputModule,
    CustomRadioButtonModule,
    FormsModule,
    MatRadioModule,
    MatDialogModule,
    MatButtonModule,
    MatPaginatorModule,
    NgxPaginationModule,
    Ng2OrderModule,
    MatSnackBarModule
  ]
})
export class CustomerModule { }
