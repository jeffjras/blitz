import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';

import { BlitzOrgaoModule } from './orgao/orgao.module';
import { BlitzFuncionarioModule } from './funcionario/funcionario.module';
import { BlitzCargoModule } from './cargo/cargo.module';
import { BlitzDepartamentoModule } from './departamento/departamento.module';
import { BlitzEquipamentoModule } from './equipamento/equipamento.module';
import { BlitzOperacaoModule } from './operacao/operacao.module';
import { BlitzFiscalizacaoModule } from './fiscalizacao/fiscalizacao.module';
import { BlitzMunicipioModule } from './municipio/municipio.module';
import { BlitzLocalizacaoModule } from './localizacao/localizacao.module';
import { BlitzDocumentacaoModule } from './documentacao/documentacao.module';
import { BlitzCondutorModule } from './condutor/condutor.module';
import { BlitzVeiculoModule } from './veiculo/veiculo.module';
/* jhipster-needle-add-entity-module-import - JHipster will add entity modules imports here */

@NgModule({
    // prettier-ignore
    imports: [
        BlitzOrgaoModule,
        BlitzFuncionarioModule,
        BlitzCargoModule,
        BlitzDepartamentoModule,
        BlitzEquipamentoModule,
        BlitzOperacaoModule,
        BlitzFiscalizacaoModule,
        BlitzMunicipioModule,
        BlitzLocalizacaoModule,
        BlitzDocumentacaoModule,
        BlitzCondutorModule,
        BlitzVeiculoModule,
        /* jhipster-needle-add-entity-module - JHipster will add entity modules here */
    ],
    declarations: [],
    entryComponents: [],
    providers: [],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class BlitzEntityModule {}
