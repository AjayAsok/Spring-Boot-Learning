import { Component, OnInit } from '@angular/core';
import { Employee } from 'src/app/datamodels/Employee';
import { EmployeeServiceService } from 'src/app/services/employee-service.service';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {
  employees: Employee[] = [];
  constructor(private employeeService: EmployeeServiceService) { }

  ngOnInit(): void {
    this.employeeService.getEmployees().subscribe(data => {
      console.log(data);
      this.employees = data
    });
  }

}
