import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EmployeeFormComponent } from './components/employee-form/employee-form.component';
import { EmployeeListComponent } from './components/employee-list/employee-list.component';
import { ItemComponent } from './item/item.component';

const routes: Routes = [
  { path: 'employees', component: EmployeeListComponent },
  { path: 'add', component: EmployeeFormComponent },
  { path: 'item', component: ItemComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
