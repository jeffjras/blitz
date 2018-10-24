import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';

import { BlitzSharedModule } from 'app/shared';
import {
    OrgaoComponent,
    OrgaoDetailComponent,
    OrgaoUpdateComponent,
    OrgaoDeletePopupComponent,
    OrgaoDeleteDialogComponent,
    orgaoRoute,
    orgaoPopupRoute
} from './';

const ENTITY_STATES = [...orgaoRoute, ...orgaoPopupRoute];

@NgModule({
    imports: [BlitzSharedModule, RouterModule.forChild(ENTITY_STATES)],
    declarations: [OrgaoComponent, OrgaoDetailComponent, OrgaoUpdateComponent, OrgaoDeleteDialogComponent, OrgaoDeletePopupComponent],
    entryComponents: [OrgaoComponent, OrgaoUpdateComponent, OrgaoDeleteDialogComponent, OrgaoDeletePopupComponent],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class BlitzOrgaoModule {}
