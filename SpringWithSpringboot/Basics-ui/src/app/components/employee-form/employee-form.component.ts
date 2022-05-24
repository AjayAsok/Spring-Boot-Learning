import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Employee } from 'src/app/datamodels/Employee';
import { EmployeeServiceService } from 'src/app/services/employee-service.service';

@Component({
  selector: 'app-employee-form',
  templateUrl: './employee-form.component.html',
  styleUrls: ['./employee-form.component.css']
})
export class EmployeeFormComponent implements OnInit {
  employee: Employee;
  constructor(private employeeService: EmployeeServiceService, private route: ActivatedRoute, private router: Router) {
    this.employee = new Employee();
  }

  ngOnInit(): void {
  }
  onSubmit() {
    this.employeeService.saveDetails(this.employee).subscribe(data => this.updateList());
  }
  updateList() {
    this.router.navigate(["/employees"])
  }
}
