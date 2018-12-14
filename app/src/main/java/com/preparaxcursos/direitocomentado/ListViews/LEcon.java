package com.preparaxcursos.direitocomentado.ListViews;

import com.preparaxcursos.direitocomentado.Models.Question;
import com.preparaxcursos.direitocomentado.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Moises on 11/03/17.
 */

public class LEcon {

    private static List<Question> lquestion = new ArrayList<>();

    public static List<Question> getLquestion() {
        if (lquestion.isEmpty()) {
            Question question = new Question();
            question.setId(1L);
            question.setTema("Direito Econômico");
            question.setEnunciado("Dos diversos postulados da ordem econômica expressos na CF não deriva a adoção do sistema econômico capitalista.");
            question.setComentario("Errado\nA Ordem Econômica, de acordo com a Constituição, é fundada na livre iniciativa e na livre concorrência (art. 170, da CF) e tem dentre os seus princípios a propriedade privada. Mesmo não sendo uma Ordem Econômica absolutamente capitalista, ela o é em essência.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(2L);
            question.setTema("Direito Econômico");
            question.setEnunciado("A CF defende a livre concorrência de mercado e não reconhece a simples existência de abuso de poder econômico.");
            question.setComentario("Errado\nNão se reconhece o exercício do poder econômico como violação da ordem econômica, mas seu abuso sim (art. 173, § 4º, da CF).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(3L);
            question.setTema("Direito Econômico");
            question.setEnunciado("Entre os princípios expressamente consignados na CF está o tratamento favorecido para as microempresas constituídas sob as leis brasileiras e que tenham sua sede e administração no país.");
            question.setComentario("Errado\nÉ um princípio da ordem econômica o tratamento favorecido para as empresas de pequeno porte constituídas sob as leis brasileiras e que tenham sua sede e administração no País.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(4L);
            question.setTema("Direito Econômico");
            question.setEnunciado("Segundo interpretação sistemática que se dá ao capitulo da ordem econômica na CF, a desigualdade dos agentes econômicos é a característica inerente de uma ordem econômica fundada na livre iniciativa e que se processa por meio da livre concorrência.");
            question.setComentario("Correto\nO poder econômico e o aumento dos lucros não são ilícitos, o que por decorrência implica aceitar a desigualdade entre os agentes econômicos.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(5L);
            question.setTema("Direito Econômico");
            question.setEnunciado("Constitui monopólio da União a refinação do petróleo nacional ou estrangeiro.");
            question.setComentario("Correto\nA refinação do petróleo bruto, de qualquer procedência, é monopólio da União (art. 177, II, da CF).");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(6L);
            question.setTema("Direito Econômico");
            question.setEnunciado("Compete à justiça estadual julgar as demandas judiciais em que empresa pública ou sociedade de economia mista da União figurem como autoras ou rés.");
            question.setComentario("Errado\nCompete à justiça federal julgar as demandas em que empresa pública federal figure como autora ou ré (art. 109, I, da CF). No entanto, cabe à justiça estadual julgar as demandas de sociedade de economia mista da União.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(7L);
            question.setTema("Direito Econômico");
            question.setEnunciado("O Estado intervencionista socialista atua com o fito de garantir o exercício racional das liberdades individuais, e sua política intervencionista não ferir os postulados liberais, mas, apenas, coibir o exercício abusivo e pernicioso do liberalismo.");
            question.setComentario("Errado\nO Estado socialista busca romper com o liberalismo. A descrição da questão refere-se ao Estado socialdemocrata.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(8L);
            question.setTema("Direito Econômico");
            question.setEnunciado("No que tangue à atuação do Estado no domínio econômico, a intervenção regulatória ocorre quando o Estado, nos casos expressos e devidamente autorizados no ordenamento jurídico, atua, em regime de igualdade com o particular, na exploração da atividade econômica.");
            question.setComentario("Errado\nA questão conceitua a intervenção direta do Estado no domínio econômico. O Estado regulador, normalmente, não é agente e não está em igualdade com o particular.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(9L);
            question.setTema("Direito Econômico");
            question.setEnunciado("Não viola a ordem econômica lei estadual que autorize a apreensão, pelo fisco, de mercadorias com a finalidade de forçar o pagamento de imposto atrasado.");
            question.setComentario("Errado\nPara o STF, a apreensão de mercadorias para forçar o pagamento de tributos viola a Constituição Federal (AI 677.242-AgR, Relatora Ministra Cármen Lúcia).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(10L);
            question.setTema("Direito Econômico");
            question.setEnunciado("A proteção ao meio ambiente é um princípio da ordem econômica, o que limita as atividades da iniciativa privada.");
            question.setComentario("Correto\nTodos os princípios da ordem econômica (CF, art. 170) limitam as atividades da iniciativa privada e um deles é a defesa do meio ambiente, inclusive mediante tratamento diferenciado conforme o impacto ambiental dos produtos e serviços e de seus processos de elaboração e prestação, de acordo com o art. 170, VI, da CF.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(11L);
            question.setTema("Direito Econômico");
            question.setEnunciado("A União, os estados, o DF e os municípios devem dispensar às microempresas, e às empresas de pequeno porte, assim definidas em lei, tratamento jurídico diferenciado, com vistas a incentivá - las pela simplificação de suas obrigações administrativas, tributárias, previdenciárias e creditícias, ou pela eliminação ou redução destas por meio de lei.");
            question.setComentario("Correto\nÉ exatamente o que prevê o art. 179, caput, da CF. Deve-se atentar, no entanto, que o princípio da ordem econômica (art. 170, IX) refere-se apenas às empresas de pequeno porte.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(12L);
            question.setTema("Direito Econômico");
            question.setEnunciado("A exploração direta de atividade econômica pelo Estado somente será permitida quando necessária aos imperativos da segurança nacional ou a relevante interesse coletivo, conforme definidos em lei.");
            question.setComentario("Errado\nAlém dos casos previstos na Constituição, o Estado somente poderá explorar atividade econômica quando necessária aos imperativos da segurança nacional ou a relevante interesse coletivo (art. 173, caput, da CF), conforme definidos em lei.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(13L);
            question.setTema("Direito Econômico");
            question.setEnunciado("Entre os princípios gerais da ordem econômica brasileira, inclui - se a concessão de tratamento favorecido para as empresas de pequeno porte constituídas sob as leis brasileiras e que tenham sua sede e administração no país.");
            question.setComentario("Correto\nTrata-se do art. 170, IX, da CF. Não confundir com dispositivo semelhante, mas que inclui as  microempresas (art. 179, da CF).");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(14L);
            question.setTema("Direito Econômico");
            question.setEnunciado("O Direito Econômico, como plasmado na Constituição Federal, é identificado a partir da noção de estado do bem - estar social(welfare state) superando a dicotomia entre o liberalismo clássico do laissez - faire e o dirigismo estatal do socialismo. ");
            question.setComentario("Correto\nA maior parte da doutrina entende que a ideologia constitucional está no meio termo entre o socialismo ou o dirigismo estatal e o estado liberal (laissez-faire).");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(15L);
            question.setTema("Direito Econômico");
            question.setEnunciado("Com relação ao art. 173 da Constituição da República de 1988, foi rompida a tendência intervencionista das constituições de 1967 e 1969. ");
            question.setComentario("Correto\nA Constituição Federal de 1988 institui a regra de que a exploração direta da atividade econômica pelo Estado se dará de forma subsidiária, legitimando-se apenas por razões de segurança nacional e relevante interesse coletivo.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(16L);
            question.setTema("Direito Econômico");
            question.setEnunciado("A regra é a de que o Estado só pode atuar em atividade econômica excepcionalmente, privatizando, por isso, os serviços públicos.");
            question.setComentario("Errado\nNos termos do art. 175 da CF, incumbe ao Poder Público, na forma da lei, diretamente ou sob regime de concessão ou permissão, sempre através de licitação, a prestação de serviços públicos.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(17L);
            question.setTema("Direito Econômico");
            question.setEnunciado("Mesmo quando se tratar de atividade necessária à segurança nacional, deve o Estado dar preferência à iniciativa privada e regular a atividade por ela exercida.");
            question.setComentario("Errado\nA segurança nacional, nos termos da lei, é fundamento autorizar da intervenção direta do Estado no domínio econômico (art. 173, caput, da CF).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(18L);
            question.setTema("Direito Econômico");
            question.setEnunciado("As atividades econômicas desenvolvidas pelo Estado em razão de relevante interesse coletivo devem submeter - se ao regime da concorrência.");
            question.setComentario("Correto\nO Estado como agente explorador da atividade econômica submete-se ao regime próprio das empresas privadas (art. 173, § 1 º,II, da CF) e, portanto, sujeita-se ao princípio da livre concorrência (art.170, IV, da CF).");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(19L);
            question.setTema("Direito Econômico");
            question.setEnunciado("A lei poderá autorizar a criação de empresa de economia mista para exercer atividade econômica de relevante interesse coletivo, adquirindo parte dos ativos de uma empresa privada que já atue no mercado.");
            question.setComentario("Correto\nNão há qualquer óbice para o Estado adquirir empresa privada que já atue no mercado, desde que essa intervenção direta se fundamente em lei, legitimada pela existência de relevante interesse coletivo e imperativo da segurança nacional(art. 173, caput, da CF).");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(20L);
            question.setTema("Direito Econômico");
            question.setEnunciado("Em razão do princípio da função social da propriedade consagrado na Constituição da República, a propriedade produtiva só será suscetível de desapropriação quando desobedecidas disposições que regulam as relações de trabalho.");
            question.setComentario("Errado\nA desapropriação poderá se dar por diversos interesses e não apenas disposições que regulam as relações de trabalho.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(21L);
            question.setTema("Direito Econômico");
            question.setEnunciado("A ordem jurídicoeconômica engloba um conjunto de normas que visam à organização da atividade econômica no ambiente social.");
            question.setComentario("Correto\nA ordem jurídico-econômica engloba um conjunto de princípios  e normas que visam à organização e desenvolvimento da atividade econômica.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(22L);
            question.setTema("Direito Econômico");
            question.setEnunciado("A ordem econômica constitucional é estruturada sobre fundamentos e princípios que traduzem diferentes posturas ideológicas, porém coerentes, que acabam por fixar a ideologia constitucional.");
            question.setComentario("Correto\nA Constituição de 1988 mescla diferentes correntes ideológicas em matéria econômica e, por este motivo, não se pode dizer que se trata de uma Constituição neoliberal ou socialista.Ela possui diversos elementos, aplicados de forma coerente e que determinam a sua própria ideologia constitucional.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(23L);
            question.setTema("Direito Econômico");
            question.setEnunciado("O Estado, em regra, não tem autorização constitucional para atuar normativamente sobre a atividade econômica com o fim de concretizar os valores, princípios, preceitos e objetivos que conformam a ordem econômica constitucional.");
            question.setComentario("Errado\nO Estado não tem em regra autorização para atuar como agente econômico, porém é sua função atuar normativamente, de acordo com o caput do art. 174, da CF.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(24L);
            question.setTema("Direito Econômico");
            question.setEnunciado("O exercício das três funções estatais previstas no caput do art. 174 da Constituição da República – fiscalização, incentivo e planejamento – submete-se, de modo inafastável, aos estritos limites e parâmetros previstos em lei.");
            question.setComentario("Correto\nO Estado nas suas funções de fiscalização, incentivo e planejamento da ordem econômica está também adstrito ao princípio da legalidade.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(25L);
            question.setTema("Direito Econômico");
            question.setEnunciado("A ordem econômica e financeira rege - se, entre outros, pelo princípio da função econômica da propriedade.");
            question.setComentario("Errado\nTrata-se do princípio da função social da propriedade (art. 170, III, da CF).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(26L);
            question.setTema("Direito Econômico");
            question.setEnunciado("A lei disciplinará, com base no interesse social, os investimentos de capital estrangeiro, incentivando os reinvestimentos.");
            question.setComentario("Errado\nA lei disciplinará, com base no interesse nacional, os investimentos de capital estrangeiro, incentivará os reinvestimentos e regulará a remessa de lucros (art. 172, caput, da CF).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(27L);
            question.setTema("Direito Econômico");
            question.setEnunciado("O Sistema Financeiro Nacional abrange as cooperativas de crédito.");
            question.setComentario("Correto\nO sistema financeiro nacional, estruturado de forma a promover o desenvolvimento equilibrado do País e a servir aos interesses da coletividade, em todas as partes que o compõem, abrangendo as cooperativas de crédito (art. 192, da CF).");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(28L);
            question.setTema("Direito Econômico");
            question.setEnunciado("A União poderá contratar somente com empresas estatais a refinação do petróleo nacional.");
            question.setComentario("Errado\nA União poderá contratar com empresas estatais ou privadas a realização das atividades a pesquisa e a lavra das jazidas de petróleo e gás natural e outros hidrocarbonetos fluidos (art. 177, § 1º, da CF).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(29L);
            question.setTema("Direito Econômico");
            question.setEnunciado("A seguridade social será financiada pela União e pelo plano gestor dos Estados e Municípios.");
            question.setComentario("Errado\nA seguridade social será financiada por toda a sociedade, de forma direta e indireta, nos termos da lei, mediante recursos provenientes dos orçamentos da União, dos Estados, do Distrito Federal e dos Municípios (art. 195, caput, da CF).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(30L);
            question.setTema("Direito Econômico");
            question.setEnunciado("É vedada a concessão às sociedades de economia mista e empresas públicas de privilégios fiscais que não sejam extensivos às empresas do setor privado.");
            question.setComentario("Correto\nAs empresas públicas e as sociedades de economia mista não poderão gozar de privilégios fiscais não extensivos às do setor privado (art.173, § 2º, da CF).");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(31L);
            question.setTema("Direito Econômico");
            question.setEnunciado("Como agente normativo e regulador da atividade econômica, o Estado exercerá, na forma da lei, as funções de fiscalização, incentivo e planejamento.");
            question.setComentario("Correto\nComo agente normativo e regulador da atividade econômica, o Estado exercerá, na forma da lei, as funções de fiscalização, incentivo e planejamento, sendo este determinante para o setor público e indicativo para o setor privado(art. 174, caput, da CF).");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(32L);
            question.setTema("Direito Econômico");
            question.setEnunciado("Como agente normativo e regulador da atividade econômica, o Estado exercerá, na forma da lei, as funções de fiscalização, incentivo e planejamento, sendo este determinante para os setores público e privado.");
            question.setComentario("Errado\nComo agente normativo e regulador da atividade econômica, o Estado exercerá, na forma da lei, as funções de fiscalização, incentivo e planejamento, sendo este determinante para o setor público e indicativo para o setor privado (art. 174, caput, da CF).");
            question.setGabarito(R.id.e);
            lquestion.add(question);
        }
        return lquestion;
    }
}

