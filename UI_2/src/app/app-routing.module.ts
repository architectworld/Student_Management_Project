import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddUserComponent } from './add-user/add-user.component';
import { AllUserComponent } from './all-user/all-user.component';

const routes: Routes = [
  {path:"add" , component:AddUserComponent},
  {path:"all", component:AllUserComponent},
  {path:"" , redirectTo:"all", pathMatch:"full"}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
