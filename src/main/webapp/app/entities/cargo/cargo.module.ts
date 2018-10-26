import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';

import { BlitzSharedModule } from 'app/shared';
import {
    CargoComponent,
    CargoDetailComponent,
    CargoUpdateComponent,
    CargoDeletePopupComponent,
    CargoDeleteDialogComponent,
    cargoRoute,
    cargoPopupRoute
} from './';

const ENTITY_STATES = [...cargoRoute, ...cargoPopupRoute];

@NgModule({
    imports: [BlitzSharedModule, RouterModule.forChild(ENTITY_STATES)],
    declarations: [CargoComponent, CargoDetailComponent, CargoUpdateComponent, CargoDeleteDialogComponent, CargoDeletePopupComponent],
    entryComponents: [CargoComponent, CargoUpdateComponent, CargoDeleteDialogComponent, CargoDeletePopupComponent],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class BlitzCargoModule {}
