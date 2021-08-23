import {MaEmployee} from "./ma-employee";

export class Employee {
  id: number;
  MaEmployee: MaEmployee;
  ten: string;
  ngay_nhapvien:string;
  ngay_ravien:string;
  lydo_nhapvien:string;
  pp_dieutri:string;
  bacsi_dieutri:string;

  constructor(id: number, MaEmployee: MaEmployee, ten: string, ngay_nhapvien:string,
              ngay_ravien:string, lydo_nhapvien:string, pp_dieutri:string, bacsi_dieutri:string,) {
    this.id = id;
    this.MaEmployee = MaEmployee;
    this.ten = ten;
    this.ngay_nhapvien=ngay_nhapvien;
    this.ngay_ravien=ngay_ravien;
    this.lydo_nhapvien = lydo_nhapvien;
    this.pp_dieutri=pp_dieutri;
    this.bacsi_dieutri=bacsi_dieutri;
  }
}
