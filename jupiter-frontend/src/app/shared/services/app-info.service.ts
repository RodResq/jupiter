import { Injectable } from '@angular/core';

@Injectable()
export class AppInfoService {
  constructor() {}

  public get title() {
    return 'Palafita Bar & Restaurante';
  }

  public get currentYear() {
    return new Date().getFullYear();
  }
}
