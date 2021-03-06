import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';

import { BlitzSharedModule } from 'app/shared';
import {
    CondutorComponent,
    CondutorDetailComponent,
    CondutorUpdateComponent,
    CondutorDeletePopupComponent,
    CondutorDeleteDialogComponent,
    condutorRoute,
    condutorPopupRoute
} from './';

const ENTITY_STATES = [...condutorRoute, ...condutorPopupRoute];

@NgModule({
    imports: [BlitzSharedModule, RouterModule.forChild(ENTITY_STATES)],
    declarations: [
        CondutorComponent,
        CondutorDetailComponent,
        CondutorUpdateComponent,
        CondutorDeleteDialogComponent,
        CondutorDeletePopupComponent
    ],
    entryComponents: [CondutorComponent, CondutorUpdateComponent, CondutorDeleteDialogComponent, CondutorDeletePopupComponent],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class BlitzCondutorModule {}
