import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EmployeeComponent } from './components/employee/employee.component';
import { EmployeeListComponent } from './components/employee-list/employee-list.component';
import { HttpClientModule } from '@angular/common/http';
import { EmployeeServiceService } from './services/employee-service.service';
import { EmployeeFormComponent } from './components/employee-form/employee-form.component';
import { FormsModule } from '@angular/forms';
import { ItemComponent } from './item/item.component';

@NgModule({
  declarations: [
    AppComponent,
    EmployeeComponent,
    EmployeeListComponent,
    EmployeeFormComponent,
    ItemComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [EmployeeServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
