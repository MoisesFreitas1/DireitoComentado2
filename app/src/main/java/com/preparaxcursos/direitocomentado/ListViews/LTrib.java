package com.preparaxcursos.direitocomentado.ListViews;

import com.preparaxcursos.direitocomentado.Models.Question;
import com.preparaxcursos.direitocomentado.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Moises on 05/03/17.
 */

public class LTrib {
    private static List<Question> lquestion = new ArrayList<>();

    public static List<Question> getLquestion() {
        if (lquestion.isEmpty()) {
            Question question = new Question();
            question.setId(1L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A Constituição não prevê as normas de " +
                    "direito tributário como pertencendo ao âmbito da legislação " +
                    "concorrente.");
            question.setComentario(" Errado.\nO direito tributário é um direito público de legislação " +
                    "concorrente, assim como o financeiro, o penitenciário, o " +
                    "econômico e o urbanístico, conforme dispõe o art. 24, I, CF/88");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Legislar sobre direito tributário é " +
                    "de competência concorrente da União, dos Estados, do Distrito " +
                    "Federal e dos Municípios.");
            question.setComentario(" Errado.\nA legislação concorrente, segundo o art. 30, II, CF/88, " +
                    "só engloba a União, Estados e o Distrito Federal, não " +
                    "compreendendo os Municípios. A estes cabe legislar de forma " +
                    "suplementar à legislação federal e estadual no que lhes couber.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(3L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A legislação tributária dos " +
                    "Estados é aplicada nos respectivos Municípios, em virtude de " +
                    "estes não terem competência para legislar sobre Direito " +
                    "Tributário.");
            question.setComentario(" Errado.\nOs Municípios são entes autônomos e possuem " +
                    "legislação própria. Embora não estejam incluídos no rol de " +
                    "pessoas que podem legislar concorrentemente sobre direito " +
                    "tributário pelo art. 24, CF/88, o art. 30, II, estabelece que " +
                    "compete aos Municípios suplementar a legislação federal e " +
                    "estadual no que couber. É no âmbito desta competência " +
                    "suplementar que os Municípios estabelecerão suas leis " +
                    "tributárias e são estas as leis que se aplicarão em seu " +
                    "território, sempre observando as normas gerais estabelecidas " +
                    "por lei complementar federal, prevista no art. 146, CF/88.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(4L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A expressão “direito tributário penal” " +
                    "identifica o mesmo que “direito penal tributário”.");
            question.setComentario(" Errado.\nDireito tributário penal significa o setor do direito " +
                    "tributário que comina sanções não criminais para " +
                    "determinadas condutas ilegais. Já o direito penal tributário " +
                    "seria o setor do direito penal que comina sanções criminais " +
                    "para determinadas condutas tributárias ilegais. Essas são " +
                    "definições da própria ESAF.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(5L);
            question.setTema("Direito Tributário");
            question.setEnunciado("O Código Tributário Nacional (CTN) foi " +
                    "votado como lei ordinária.");
            question.setComentario(" Correto.\nO CTN (Lei Ordinária nº 5.172 de 1966) vigora, devido " +
                    "ao instituto da recepção, com força de lei complementar desde " +
                    "a Constituição de 1967 que atribuiu tal tratamento às normas " +
                    "gerais de legislação tributária. Convém esclarecer que a " +
                    "recepção ocorre pela compatibilidade material do direito " +
                    "anterior com a CF/88, sendo irrelevante a correspondência de instrumentos normativos entre a antiga e a nova ordem " +
                    "constitucional.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(6L);
            question.setTema("Direito Tributário");
            question.setEnunciado("As normas gerais de direito tributário " +
                    "contidas no CTN podem ser alteradas ou revogadas mediante " +
                    "lei complementar.");
            question.setComentario(" Correto.\nDevido ao CTN ter sido recepcionado como uma lei " +
                    "complementar, somente esse tipo de lei pode revogá-lo ou " +
                    "alterá-lo.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(7L);
            question.setTema("Direito Tributário");
            question.setEnunciado("O Código Tributário Nacional, sendo " +
                    "lei ordinária, foi recepcionado pela Constituição com o status " +
                    "de lei complementar, embora originalmente não tenha sido " +
                    "elaborado com o atendimento aos requisitos de tal espécie " +
                    "normativa. Portanto, suas alterações somente podem ser " +
                    "efetuadas por intermédio de lei complementar.");
            question.setComentario(" Correto.\nO CTN é a lei ordinária 5.172/66, que primeiramente " +
                    "foi recepcionado pela CF/67 com o status de lei complementar, " +
                    "status este mantido pela CF/88. Saliente-se que o fato de ter " +
                    "sido o CTN recepcionado como Lei Complementar não lhe retira " +
                    "a qualidade formal de Lei Ordinária. Formalmente é Lei " +
                    "Ordinária; materialmente é Lei Complementar.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(8L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Tributos e penalidades constituem " +
                    "modalidade de receita derivada.");
            question.setComentario(" Correto.\nPois ele é instituído por lei e compulsório, por isso é " +
                    "uma receita derivada, não decorre de regime contratual. O " +
                    "Estado está em posição acima do particular cobrando algo " +
                    "independente de sua vontade.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(9L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Preços públicos constituem " +
                    "modalidade de receita derivada.");
            question.setComentario(" Errado.\nPreço público é uma receita “originária”. Segundo a " +
                    "definição da própria ESAF, preço público é a prestação " +
                    "pecuniária, decorrente da livre manifestação do comprador, " +
                    "exigida pelo Estado, por órgão estatal, ou por entidade ligada " +
                    "ao Poder Público, pela venda de um bem material ou imaterial. " +
                    "Diferencia-se do tributo por ser contratual, não é instituido por " +
                    "lei, não é compulsório, é geralmente cobrado por meio de " +
                    "tarifas como as de energia elétrica, abastecimento de água, " +
                    "esgoto e etc.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(10L);
            question.setTema("Direito Tributário");
            question.setEnunciado("As receitas compulsórias, " +
                    "cuja arrecadação e utilização são conferidas, pelo Poder Público " +
                    "competente, a uma entidade paraestatal dotada de autonomia " +
                    "administrativa e financeira, são chamadas extrafiscais.");
            question.setComentario(" Errado.\nO correto seria dizer “parafiscais”. Tendo em vista esta " +
                    "classificação das receitas e tributos, podemos destacar 3 tipos:  " +
                    "Fiscais – Aquela receita gerada por um tributo cuja finalidade " +
                    "precípua é realmente arrecadar, por exemplo, a receita gerada " +
                    "pelo ICMS.  Extrafiscais - Aquela receita gerada por um tributo cuja " +
                    "finalidade precípua não é arrecadar, mas intervir em algum " +
                    "comportamento, por exemplo, temos o ITR, onde o governo " +
                    "quer, principalmente, desestimular propriedades improdutivas, " +
                    "sendo a arrecadação função secundária.  Parafiscais – São as receitas que são arrecadadas por pessoas " +
                    "jurídicas diferentes das insituídoras, como exemplo, temos a " +
                    "delegação que era feita ao INSS pela União para que aquele " +
                    "cobrasse contribuições sociais, e também as contribuições que " +
                    "servem para custear entidades paraestatais como o SESI, " +
                    "SESC, SENAI e etc.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(11L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A expressão \"Fazenda Pública\", nos termos " +
                    "do Código Tributário Nacional, somente se aplica à Fazenda " +
                    "Pública da União.");
            question.setComentario(" Errado.\nA expressão 'Fazenda Pública', nos termos do CTN, " +
                    "aplica-se à Fazenda Pública da União, dos Estados, do Distrito " +
                    "Federal e dos Municípios.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(12L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Tributo é toda prestação pecuniária " +
                    "compulsória, em moeda, ou cujo valor nela se possa exprimir, " +
                    "que não constitua sanção de ato ilícito, instituída em lei e " +
                    "cobrada mediante atividade administrativa plenamente " +
                    "vinculada.");
            question.setComentario(" Correto.\nÉ exatamente o que dispõe o art. 3º, CTN.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(13L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Tributo é prestação pecuniária compulsória, " +
                    "instituída em lei e cobrada mediante atividade administrativa " +
                    "discricionária.");
            question.setComentario(" Errado.\nA atividade administrativa é vinculada, ou seja, não " +
                    "cabe ao agente público decidir se cobra ou não o tributo, ele " +
                    "não tem liberdade para agir conforme sua conveniência e " +
                    "oportunidade, típicas de atos discricionários.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(14L);
            question.setTema("Direito Tributário");
            question.setEnunciado("As medidas provisórias podem, em " +
                    "determinadas situações, versar sobre matéria tributária.");
            question.setComentario(" Correto.\nTributo é uma prestação instituída por lei. O termo " +
                    "“lei” é usado em sentido amplo, abrangendo não só as leis " +
                    "ordinárias e complementares, mas também as medidas " +
                    "provisórias, que são atos que possuem força de lei. O art. 62, § " +
                    "2º, CF/88, é claro quando determina que medida provisória " +
                    "poderá instituir ou aumentar impostos, com produção de " +
                    "efeitos no exercício seguinte, desde que seja convertida em lei " +
                    "até o último dia do exercício em que tenha sido editada. São " +
                    "exceções a essa regra o II, IE, IPI, IOF e IEG, cuja medida " +
                    "provisória que venha a instituí-los ou aumentá-los produz " +
                    "efeitos tão logo seja editada. Outro ponto a destacar seria o " +
                    "mandamento do art. 146, CF/88, que proíbe que se edite " +
                    "medida provisória para se regulamentar assuntos que " +
                    "necessitem de lei complementar, bem como para instituir " +
                    "tributos que necessitem de lei complementar. São eles:\n" +
                    "\uF0A7 empréstimos compulsórios;\n" +
                    "\uF0A7 imposto sobre grandes fortunas;\n" +
                    "\uF0A7 impostos residuais; e\n" +
                    "\uF0A7 contribuições residuais.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(15L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Medidas provisórias são aptas a " +
                    "instituir, mas não a aumentar tributos.");
            question.setComentario("Errada. Elas cumprem perfeitamente as exigências da " +
                    "legalidade tributária, podendo instituir e majorar tributos.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(16L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A criação ou instituição de um " +
                    "tributo tem de ser veiculada por meio de lei, expressão que deve " +
                    "ser interpretada restritivamente, sem admitir-se a espécie " +
                    "Medida Provisória como hábil a tal propósito.");
            question.setComentario(" Errado.\nA lei é em sentido amplo. Poderá , sim, ser por meio de " +
                    "medida provisória.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(17L);
            question.setTema("Direito Tributário");
            question.setEnunciado("É permitida a edição de medida " +
                    "provisória para aumentar a contribuição social incidente sobre " +
                    "a folha de salários de empregados, devida por empregadores à " +
                    "seguridade social.");
            question.setComentario(" Correto.\nSó seria vedada a edição de medida provisória para " +
                    "tributos os quais necessitem da edição de uma lei " +
                    "complementar. São eles:\n" +
                    "\uF0A7 empréstimos compulsórios;\n" +
                    "\uF0A7 imposto sobre grandes fortunas;\n" +
                    "\uF0A7 impostos residuais; e\n" +
                    "\uF0A7 contribuições residuais.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(18L);
            question.setTema("Direito Tributário");
            question.setEnunciado("É vedada a edição de medida " +
                    "provisória para majorar o imposto sobre a renda e proventos de " +
                    "qualquer natureza.");
            question.setComentario(" Errado.\nÉ perfeitamente válido, pois o IR não necessita de lei " +
                    "complementar para sua instituição, único caso em que poderia " +
                    "ser restringido o uso da MP.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(19L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Medida provisória que implique " +
                    "majoração do imposto sobre propriedade territorial rural só " +
                    "produzirá efeitos no exercício financeiro seguinte se houver sido " +
                    "convertida em lei até o último dia daquele em que foi editada.");
            question.setComentario(" Correto.\nÉ o que dispõe o art. 62, §2º, CF/88, quando " +
                    "determina que medida provisória poderá instituir ou aumentar " +
                    "impostos (entre os quais está o ITR), com produção de efeitos " +
                    "no exercício seguinte, desde que seja convertida em lei até o " +
                    "último dia do exercício em que tenha sido editada. São exceções " +
                    "a essa regra o II, IE, IPI, IOF e IEG, cuja medida provisória que " +
                    "venha a instituí-los ou aumentá-los produz efeitos tão logo seja " +
                    "editada.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(20L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A expressão prestação pecuniária " +
                    "exprime a obrigação de que o tributo tem de ser pago em " +
                    "unidades de moeda em curso, não se admitindo, como regra, " +
                    "seu pagamento em bens (in natura) ou em trabalho (in labore).");
            question.setComentario(" Correto.\nEm regra, a obrigação tributária não pode ser " +
                    "satisfeita por algo que não seja moeda; todavia, o CTN, em seu " +
                    "art. 156, XI, estabelece uma única exceção, que é a “dação em " +
                    "pagamento em bens imóveis”.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(21L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Tributos não se confundem com " +
                    "penalidades, estas se aplicam pela ocorrência de atos ilícitos, " +
                    "assim, somente atos lícitos podem ser tributados.");
            question.setComentario(" Correto.\nO art. 3º, CTN, estabelece que tributo não constitui " +
                    "sanção de ato ilícito. Já o art. 118 dispõe sobre o princípio " +
                    "pecunia non ollet (dinheiro não cheira), isto é, o tributo passa a " +
                    "ser devido pela ocorrência de um fato gerador ocorrido no " +
                    "mundo dos fatos, que nada mais é do que a concretização de " +
                    "uma hipótese de incidência, esta, sim, prevista em lei. A " +
                    "hipótese de incidência há de ser necessariamente algo lícito, " +
                    "como, por exemplo: auferir renda, circulação de mercadoria, " +
                    "transmissão causa mortis etc. Nesse sentido, não haverá " +
                    "alíquota maior para o IR relativamente à renda advinda do jogo " +
                    "do bicho; não haverá incidência de ISS pela mediação da " +
                    "libidinagem feita pelo dono de bordel, pois ambas as atividades " +
                    "são ilícitas; mas haverá incidência de IR sobre suas rendas. A " +
                    "aquisição de renda é, abstratamente considerada, fato lícito e passível de ser tributado. Assim, se uma pessoa auferiu rendas " +
                    "oriundas do tráfico de drogas, será obrigada a pagar imposto de " +
                    "renda da mesma forma que um trabalhador comum, mas veja " +
                    "que o que gera a incidência do tributo é “auferir rendas” – " +
                    "atividade lícita –, e não a “pratica de tráfico de drogas”, pois, se " +
                    "assim fosse, o tributo se confundiria com multa, sendo uma " +
                    "sanção ao ato ilícito. Esse é o pensamento da ESAF.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(22L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Tributo é um gravame cuja obrigação tem " +
                    "por fato gerador uma situação independente de qualquer " +
                    "atividade estatal específica, relativa ao contribuinte.");
            question.setComentario(" Errado.\nO conceito de tributo, segundo o art. 3º, CTN, é: “toda " +
                    "prestação pecuniária compulsória, em moeda, ou cujo valor " +
                    "nela se possa exprimir, que não constitua sanção de ato ilícito, " +
                    "instituída em lei e cobrada mediante atividade administrativa " +
                    "plenamente vinculada”. O erro da questão foi fazer menção a " +
                    "“tributo” no lugar de “imposto”, eis que é esta a única espécie " +
                    "tributária que independe de contraprestação estatal específica.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(23L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A natureza jurídica dos " +
                    "tributos é determinada pela denominação adotada pela lei.");
            question.setComentario(" Errado.\nSegundo o art. 4º, CTN, somente o fato gerador é " +
                    "relevante para qualificar a natureza jurídica do tributo, ou seja, " +
                    "definir se ele será um imposto, uma taxa ou uma contribuição " +
                    "de melhoria, sendo sua denominação irrelevante para tal fim.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(24L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A natureza jurídica " +
                    "específica do tributo é determinada pelo fato gerador da " +
                    "respectiva obrigação, sendo irrelevantes para qualificá-la a " +
                    "denominação e demais características formais adotadas pela lei " +
                    "e a destinação legal do produto da sua arrecadação.");
            question.setComentario(" Correto.\nSegundo o art. 4º, CTN, somente o fato gerador é " +
                    "relevante para qualificar a natureza jurídica do tributo, ou seja, " +
                    "definir se ele será um imposto, uma taxa ou uma contribuição " +
                    "de melhoria.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(25L);
            question.setTema("Direito Tributário");
            question.setEnunciado("O sistema tributário nacional é regido pelo " +
                    "disposto na Constituição Federal de 1988, em leis " +
                    "complementares, em resoluções do Congresso Nacional e, nos " +
                    "limites das respectivas competências, em leis federais, nas " +
                    "Constituições e em leis estaduais, e em leis municipais.");

            question.setComentario(" Errado.\nA banca se baseou num dos dispositivos do CTN mais " +
                    "raros de serem cobrados em prova. Trata-se do art. 2º, que " +
                    "prevê como uma das normas que regem o Sistema Tributário " +
                    "Nacional as resoluções do Senado, e não do Congresso " +
                    "Nacional. As normas que regem o Sistema Tributário Nacional " +
                    "são as seguintes:\n" +
                    "a) a) CF/88;\n" +
                    "b) b) Leis Complementares;\n" +
                    "c) c) Resoluções do Senado Federal;\n" +
                    "d) d) Leis federais tributárias;\n" +
                    "e) e) Constituições estaduais;\n" +
                    "f) f) Leis estaduais tributárias;\n" +
                    "g) g) Leis municipais tributárias.\n" +
                    "Repare que não encontramos nesse rol “Constituições " +
                    "municipais”. Na realidade, os municípios não possuem, " +
                    "formalmente falando, Constituições; eles possuem Leis Orgânicas, que fazem as vezes de verdadeiras “Constituições " +
                    "municipais”. Assim, quando o CTN se refere a Leis municipais, " +
                    "subentende-se que também entram nesse grupo as leis " +
                    "orgânicas municipais.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(26L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A natureza jurídica específica do tributo é " +
                    "determinada pelo fato gerador da respectiva obrigação, sendo " +
                    "irrelevantes para qualificá-la a denominação e demais " +
                    "características formais adotadas pela lei, bem assim a " +
                    "destinação legal do produto da sua arrecadação.");
            question.setComentario(" Correto.\nSegundo o art. 4º do CTN, somente o fato gerador é " +
                    "relevante para qualificar a natureza jurídica do tributo, ou seja, " +
                    "definir se ele será um imposto, uma taxa ou uma contribuição " +
                    "de melhoria. Os demais aspectos (denominação e demais " +
                    "características e a destinação legal do produto da arrecadação) " +
                    "são irrelevantes para essa qualificação.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(27L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Para conhecimento da " +
                    "natureza específica das diversas espécies tributárias previstas " +
                    "no Sistema Tributário Nacional, é essencial o exame do fato " +
                    "gerador da respectiva obrigação, tendo em vista que, à luz do " +
                    "Código Tributário Nacional, a natureza jurídica específica do " +
                    "tributo é determinada pelo fato gerador da respectiva obrigação, " +
                    "sendo irrelevantes para qualificá-la: a denominação e demais " +
                    "características formais adotadas pela lei e a destinação legal do " +
                    "produto da sua arrecadação.");
            question.setComentario(" Correto.\nInteressante observar quão repetitivo é este assunto " +
                    "nas provas da ESAF. Mais uma vez, recorremos ao art. 4º do " +
                    "CTN, onde consta que somente o fato gerador é relevante para " +
                    "qualificar a natureza jurídica do tributo, ou seja, definir se ele " +
                    "será um imposto, uma taxa ou uma contribuição de melhoria. " +
                    "Os demais aspectos (denominação e demais características e a " +
                    "destinação legal do produto da arrecadação) são irrelevantes " +
                    "para essa qualificação.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(28L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Empréstimo compulsório, contribuição de " +
                    "melhoria, contribuição de intervenção no domínio econômico e " +
                    "compensação financeira aos Estados pela exploração de " +
                    "petróleo por empresas privadas são espécies tributárias.");
            question.setComentario(" Errado.\nAs espécies tributárias são:\n" +
                    "a) Expressamente, segundo o CTN e a Constituição Federal (Teoria Tripartite – 3 tributos):\n" +
                    "  \uF0A7 Impostos;\n" +
                    "  \uF0A7 Taxas; e\n" +
                    "  \uF0A7 Contribuição de melhoria.\n" +
                    "b) Segundo o STF (Teoria Quintipartite – 5 tributos: impostos, " +
                    "taxas, empréstimos compulsórios, contribuições de melhoria e " +
                    "contribuições sociais), por se enquadrarem perfeitamente na " +
                    "definição do art. 3º do CTN:\n\uF0A7 Impostos:\n" +
                    "- Nominados (arts 145, I, 153, 155 e 156, CF/88);\n" +
                    "- Residuais (art. 154, I, CF/88);\n" +
                    "- Extraordinários de guerra (art. 154, II, CF/88);\n" +
                    "\uF0A7 Taxas (art. 145, II, CF/88):\n" +
                    "- De poder de polícia;\n" +
                    "- De serviços públicos específicos e divisíveis;\n" +
                    "\uF0A7 Empréstimos Compulsórios:\n- Extraordinários de calamidade ou guerra (art. 148, I, CF/88);\n" +
                    "- De investimento (art. 148, II, CF/88);\n" +
                    "\uF0A7 Contribuições:\n" +
                    "- De melhoria (art. 145, III, CF/88);\n" +
                    "- Sociais:\n" +
                    "    \uF0A7 De seguridade social (art. 195,I, II, III, CF/88);\n" +
                    "    \uF0A7 Outras de seguridade social (art. 195, §4º, CF/88);\n" +
                    "    \uF0A7 Sociais gerais (FGTS, salário-educação, contribuições para o SESI, SENAT, SENAC etc);\n" +
                    "- Especiais:\n" +
                    "    \uF0A7 De intervenção no domínio econômico (art. 149, CF/88);\n" +
                    "    \uF0A7 Corporativas (art. 149, CF/88).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(29L);
            question.setTema("Direito Tributário");
            question.setEnunciado("O empréstimo compulsório é considerado " +
                    "tributo, pelo regime jurídico a que está submetido.");
            question.setComentario(" Correto.\nApesar de o termo “empréstimo” num primeiro " +
                    "momento deixe transparecer tratar-se de algo que não tenha " +
                    "relação com tributo, há muito essa questão já está pacificada " +
                    "na doutrina e jurisprudência, ambas concordando com sua " +
                    "natureza tributária, eis que presentes todos os pressupostos " +
                    "constantes do art. 3º do CTN, quais sejam: " +
                    "a) prestação pecuniária;\n" +
                    "b) compulsório;\n" +
                    "c) em moeda (ou cujo valor nela se possa exprimir);\n" +
                    "d) não seja sanção de ato ilícito;\n" +
                    "e) instituição por lei; e\n" +
                    "f) cobrado mediante atividade administrativa vinculada.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(30L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A contribuição previdenciária não é " +
                    "considerada tributo pelos nossos tribunais, por não satisfazer " +
                    "os pressupostos legais para isso.");
            question.setComentario(" Errado.\nAssim como os empréstimos compulsórios, as " +
                    "contribuições previdenciárias também reúnem todos os " +
                    "requisitos previstos no art. 3º, CTN. O STF também por " +
                    "diversas vezes já teve a oportunidade de se pronunciar no " +
                    "sentido de sua natureza tributária.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(31L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Empréstimo compulsório, " +
                    "contribuição de melhoria, contribuição de intervenção no " +
                    "domínio econômico e contribuição para a seguridade social são " +
                    "espécies tributárias.");
            question.setComentario(" Correto.\nTodos eles são tributos, embora não incluídos " +
                    "expressamente no rol das espécies tributárias do art. 145, " +
                    "CF/88. É nesse sentido a jurisprudência e a opinião da " +
                    "doutrina, pacíficas.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(32L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Contribuição de interesse de " +
                    "categorias econômicas, taxa, imposto e encargo de reparação de " +
                    "guerra são espécies tributárias.");
            question.setComentario(" Errado.\nEncargo de reparação de guerra não é espécie " +
                    "tributária; não existe isso na CF/88.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(33L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Segundo o Código Tributário Nacional, são " +
                    "tributos os impostos, as taxas e a contribuição de melhoria.");
            question.setComentario(" Correto.\nÉ o que dispõe o art. 5º, CTN.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(34L);
            question.setTema("Direito Tributário");
            question.setEnunciado("São espécies " +
                    "tributárias previstas na Constituição Federal: imposto, taxa, " +
                    "empréstimo compulsório, contribuição de melhoria, " +
                    "contribuição social, contribuição de intervenção no domínio " +
                    "econômico, contribuição de interesse de categorias " +
                    "profissionais ou econômicas e compensação financeira aos " +
                    "Estados pela exploração de petróleo por empresas privadas.");
            question.setComentario(" Errado.\nCompensação financeira aos Estados pela exploração " +
                    "de petróleo por empresas privadas não é espécie tributária. " +
                    "Trata-se de uma receita originária, pois advém da exploração " +
                    "de bens públicos.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(35L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Denomina-se preço público a " +
                    "prestação pecuniária compulsória, em moeda ou cujo valor nela " +
                    "se possa exprimir, que não constitua sanção de ato ilícito, " +
                    "instituída em lei e cobrada mediante atividade administrativa " +
                    "plenamente vinculada.");
            question.setComentario(" Errado.\nEsse é o conceito de tributo. O preço público, segundo " +
                    "a definição da própria ESAF, é a prestação pecuniária, " +
                    "decorrente da livre manifestação do comprador, exigida pelo " +
                    "Estado, por órgão estatal, ou por entidade ligada ao Poder " +
                    "Público, pela venda de um bem material ou imaterial. O preço " +
                    "público diferencia-se do tributo por ser contratual, não ser " +
                    "instituido por lei, não ser compulsório e, geralmente, por ser " +
                    "cobrado através de tarifas, como as de energia elétrica, " +
                    "abastecimento de água, esgoto etc.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(36L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Tributo é gênero de que são espécies o " +
                    "imposto, a taxa, a contribuição de melhoria e o preço de " +
                    "serviços públicos.");
            question.setComentario(" Errado.\nPreços públicos são voluntários, não são compulsórios, " +
                    "pois não são instituídos por lei, logo não são tributos.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(37L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Preços de serviços públicos e taxas às vezes " +
                    "se confundem porque ambos são compulsórios.");
            question.setComentario(" Errado.\nPreços públicos são cobrados por tarifas, isto é, são " +
                    "voluntários. Representam o preço de venda de um bem, quando " +
                    "exigidos por concessionárias ou permissionárias de serviços " +
                    "públicos, na qualidade de vendedora.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(38L);
            question.setTema("Direito Tributário");
            question.setEnunciado("O Imposto tem por fato gerador uma " +
                    "situação independente de qualquer atividade estatal específica, " +
                    "relativa ao contribuinte.");
            question.setComentario(" Correto.\nDiferentemente das taxas e contribuições de " +
                    "melhorias, imposto não é um tributo contraprestacional. Tratase " +
                    "de um tributo não-vinculado, que é cobrado " +
                    "independentemente da atuação do Estado. No caso da taxa, é " +
                    "preciso que já exista um exercício regular do poder de polícia " +
                    "(como a fiscalização sanitária ou de obras), ou a utilização, " +
                    "efetiva ou potencial, de serviço público específico e divisível, " +
                    "prestado ao contribuinte ou posto à sua disposição, conforme " +
                    "dispõem os arts. 77 a 80, CTN. Em se tratando da contribuição " +
                    "de melhoria, o art. 81, CTN, determina que é necessário que anteriormente à cobrança tenha ocorrido uma obra pública da " +
                    "qual decorreu valorização imobiliária; também devem ser " +
                    "observados dois limites para nortear o montante a ser cobrado: " +
                    "o limite individual, que é o acréscimo imobiliário que resultar " +
                    "para cada imóvel beneficiado; e o limite total, que seria o valor " +
                    "total da obra.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(39L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Os impostos são chamados de 'tributos não " +
                    "vinculados' porque sua cobrança independe de uma atividade " +
                    "estatal específica em relação ao contribuinte.");
            question.setComentario("Correto.\nOs impostos são tributos que independem de " +
                    "contraprestação, sendo vedada a vinculação de sua receita. A " +
                    "esse mandamento dá-se o nome princípio da não-vinculação " +
                    "da receita de impostos, que tem seu fundamento no art. 167, " +
                    "IV, CF/88, que também elenca suas cinco exceções, quais " +
                    "sejam: " +
                    "a) repartição das receitas tributárias entre os entes federados;\n" +
                    "b) destinação de recursos para ações e serviços públicos de saúde;\n" +
                    "c) destinação de recursos para manutenção e desenvolvimento do ensino;\n" +
                    "d) destinação de recursos para realização de atividades das administração tributária; e\n" +
                    "e) prestação de garantias às operações de crédito por antecipação de receita.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(40L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A prestação de serviço militar é compulsória " +
                    "e não constitui sanção a ato ilícito, porém não tem a natureza " +
                    "de tributo porque não é prestação pecuniária.");
            question.setComentario("Correto.\nPara ser tributo é imperativo atender a todos os " +
                    "requisitos do art. 3º, CTN.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(41L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Os impostos, as taxas e as contribuições de " +
                    "melhoria são espécies de tributos.");
            question.setComentario("Correto.\nSão as espécies tributárias expressamente " +
                    "estabelecidas pela CF/88 e pelo CTN.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(42L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Todos os tributos deverão respeitar " +
                    "a capacidade econômica dos contribuintes.");
            question.setComentario(" Errado.\nSomente os impostos têm esta obrigação, segundo o " +
                    "art. 145, §1º, CF/88, que dispõe: “sempre que possível, os " +
                    "impostos terão caráter pessoal e serão graduados segundo a " +
                    "capacidade econômica do contribuinte...”. Outros tributos até " +
                    "poderão ser graduados segundo a capacidade contributiva, mas " +
                    "não há obrigatoriedade. Capacidade econômica do contribuinte " +
                    "ou capacidade contributiva é o princípio pelo qual cada pessoa " +
                    "deve participar nas despesas da coletividade de acordo com sua " +
                    "aptidão econômica; paga mais quem ganha mais, paga menos " +
                    "quem ganha menos.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(43L);
            question.setTema("Direito Tributário");
            question.setEnunciado("O princípio da capacidade " +
                    "contributiva aplica-se somente às contribuições.");
            question.setComentario(" Errado.\nSomente os impostos, quando possível, possuem essa " +
                    "obrigação.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(44L);
            question.setTema("Direito Tributário");
            question.setEnunciado("O princípio da capacidade " +
                    "contributiva não se aplica às penalidades tributárias.");
            question.setComentario(" Correto.\nA penalidade é aplicada independente da capacidade " +
                    "de contribuição do contribuinte. Até porque a penalidade tem " +
                    "caráter corretivo e sancionador de condutas ilícitas; não é sua " +
                    "função fazer justiça fiscal.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(45L);
            question.setTema("Direito Tributário");
            question.setEnunciado("O princípio da capacidade " +
                    "contributiva aplica-se somente aos impostos.");
            question.setComentario(" Errado.\nPoderá ser levada em consideração na hora da " +
                    "instituição de outros tributos. Por exemplo, quando se isentam " +
                    "pessoas pobres do pagamento de custas judiciais, nada mais " +
                    "há do que a aplicação do princípio da capacidade contributiva.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(46L);
            question.setTema("Direito Tributário");
            question.setEnunciado("O princípio da capacidade " +
                    "contributiva aplica-se indistintamente a todas as espécies " +
                    "tributárias.");
            question.setComentario(" Errado.\nExistem tributos que não conseguem identificar a " +
                    "riqueza daquele que promoveu seu fato gerador, como, por " +
                    "exemplo, as taxas pelo exercício do poder de polícia. Em regra, " +
                    "elas são cobradas em igual montante, independente daquele " +
                    "que promoveu o seu fato gerador.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(47L);
            question.setTema("Direito Tributário");
            question.setEnunciado("O princípio da capacidade " +
                    "contributiva é atendido pela progressividade dos impostos " +
                    "reais.");
            question.setComentario(" Errado.\nO princípio da capacidade contributiva é basilar para a " +
                    "progressividade, mas a progressividade deve ocorrer, em regra, " +
                    "apenas para impostos pessoais, pois 'olham para o bolso do " +
                    "contribuinte'. Impostos reais, em regra, não devem ser " +
                    "progressivos, como é o caso do ITBI, cuja progressividade é " +
                    "inconstitucional. Aplicar a progressividade para o IPTU, por " +
                    "exemplo, consiste em aumentar suas alíquotas conforme " +
                    "aumente o valor do imóvel; uma pessoa miserável que herde " +
                    "um imóvel de luxo continuaria a ser contribuinte do IPTU " +
                    "progressivo, mesmo que sua renda seja incompatível com o " +
                    "montante de imposto a pagar.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(48L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Para conferir efetividade ao princípio da " +
                    "pessoalidade da tributação e à graduação segundo a " +
                    "capacidade econômica do contribuinte, a Constituição prevê, " +
                    "expressamente, a faculdade da administração tributária de " +
                    "identificar o patrimônio, os rendimentos e as atividades " +
                    "econômicas do contribuinte.");
            question.setComentario(" Correto.\nÉ o que dispõe o art. 145, §1º, CF/88.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(49L);
            question.setTema("Direito Tributário");
            question.setEnunciado("As contribuições sociais " +
                    "e as taxas não poderão ter base de cálculo própria de imposto.");
            question.setComentario(" Errado.\nSomente as taxas não poderão ter base de cálculo " +
                    "própria dos impostos.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(50L);
            question.setTema("Direito Tributário");
            question.setEnunciado("O princípio da capacidade contributiva " +
                    "aplica-se, indistintamente, aos impostos, às taxas e as " +
                    "contribuições de melhoria.");
            question.setComentario(" Errado.\nEste princípio, disposto no art. 145, §1º, deve ser " +
                    "aplicado apenas em caráter obrigatório – e quando possível – " +
                    "para os impostos; todavia, a CF/88 não veda que seja aplicado " +
                    "às demais espécies tributárias.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(51L);
            question.setTema("Direito Tributário");
            question.setEnunciado("As leis complementares " +
                    "prestam-se basicamente a três (3) tipos de atuação em matéria " +
                    "tributária: conflitos de competência, em matéria tributária, " +
                    "entre a União, os Estados, o Distrito Federal e os Municípios; " +
                    "limitações constitucionais ao poder de tributar da União, dos " +
                    "Estados, do Distrito Federal e dos Municípios; normas gerais de " +
                    "legislação tributária.");
            question.setComentario(" Correto.\nÉ exatamente o que dispõe o art. 146, CF/88. " +
                    "Saliente-se, todavia, que leis complementares, embora de " +
                    "maneira mais específica, também são necessárias em algumas " +
                    "outras situações em matérias tributárias previstas na CF/88, a " +
                    "saber: " +
                    "a) estabelecimento de critérios especiais de tributação para combater os desequilíbrios de concorrência (art. 146-A);\n" +
                    "b) instituição de empréstimos compulsórios (art. 148);\n" +
                    "c) competência tributária residual da União em impostos e contribuições sociais (art. 154, I e 195, §4º );\n" +
                    "d) instituição do IGF (art. 153, VII);\n" +
                    "e) normas gerais relativas ao ICMS (art. 155, XII);\n" +
                    "f) fixação de alíquotas mínimas e máximas do ISS, bem como excluir da sua incidência exportações de serviços e regular a forma de seus benefícios fiscais (art. 156, §3º).");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(52L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Cabe à lei ordinária regular as limitações " +
                    "constitucionais ao poder de tributar.");
            question.setComentario(" Errado.\nÉ matéria reservada à lei complementar (art. 146, " +
                    "CF/88).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(53L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Cabe à lei " +
                    "complementar da União, além de outros temas que lhe são " +
                    "reservados, dispor sobre conflitos de competência, em matéria tributária, entre a União, os Estados, o Distrito Federal e os " +
                    "Municípios e regular as limitações constitucionais ao poder de " +
                    "tributar.");
            question.setComentario(" Correto.\nIsso é disposto no art. 146, CF/88.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(54L);
            question.setTema("Direito Tributário");
            question.setEnunciado("É proibida a concessão de qualquer " +
                    "subsídio ou isenção, redução de base de cálculo, concessão de " +
                    "crédito presumido, anistia ou remissão, relativas a impostos, " +
                    "taxas ou contribuições, se não for concedida mediante lei " +
                    "específica, federal, estadual ou municipal, que regule só esses " +
                    "benefícios ou o correspondente tributo ou contribuição.");
            question.setComentario(" Correto.\nÉ o que dispõe o art. 150, §6º, CF/88:\nSó por lei específica: Poderá conceder qualquer subsídio ou renúncia de receita (isenção, redução da BC, e etc.) relativo a:\n" +
                    "\uF0A7 Impostos;\n" +
                    "\uF0A7 Taxas; ou\n" +
                    "\uF0A7 Contribuições\n" +
                    "Exceção: Em se tratando do ICMS, esses institutos serão concedidos por CONVÊNIO entre os Estados e DF. Para este fim, lei específica é:\n" +
                    "\uF0A7 Aquela que regule exclusivamente as matérias acima enumeradas; ou\n" +
                    "\uF0A7 Regule apenas o correspondente tributo ou contribuição.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(55L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A União, por meio " +
                    "de lei complementar e atendendo a relevante interesse social, " +
                    "poderá conceder isenção de taxas estaduais.");
            question.setComentario(" Errado.\nA União não pode, segundo o art. 151, III, CF/88, " +
                    "instituir isenções de tributos dos demais entes. A questão " +
                    "estaria correta caso o instituto citado fosse moratória, por " +
                    "expressa previsão no art. 152, I, b, CTN.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(56L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Para efetivar os princípios da " +
                    "pessoalidade e da capacidade econômica do contribuinte, " +
                    "faculta-se à administração tributária identificar, respeitados os " +
                    "direitos individuais e nos termos da lei, o patrimônio, os " +
                    "rendimentos e as atividades econômicas a que se dedique o " +
                    "contribuinte.");
            question.setComentario(" Correto.\nÉ o que diz art. 145, §1º, CF/88.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(57L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A União prescinde de lei complementar para " +
                    "dispor sobre conflitos de competência, em matéria tributária, " +
                    "entre a União, os Estados, o Distrito Federal e os Municípios.");
            question.setComentario(" Errado.\nPrescindir é o mesmo que dispensar, não precisar. " +
                    "Assim, a questão está incorreta, já que é preciso lei " +
                    "complementar para tal situação (art. 146, I, CF/88).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(58L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Lei complementar poderá estabelecer " +
                    "critérios especiais de tributação, com o objetivo de prevenir " +
                    "desequilíbrios da concorrência.");
            question.setComentario(" Correto.\nÉ nesse sentido o art. 146-A, CF/88, ao dispor que lei " +
                    "complementar poderá estabelecer critérios especiais de " +
                    "tributação, com o objetivo de prevenir desequilíbrios da " +
                    "concorrência, sem, todavia, prejudicar a competência de a " +
                    "União, por lei, estabelecer normas de igual objetivo.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(59L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Lei complementar poderá definir " +
                    "tratamento diferenciado e favorecido para as microempresas e " +
                    "empresas de pequeno porte.");
            question.setComentario(" Correto.\nÉ o que dispõe o art. 146, III, d, CF/88. Atualmente, a " +
                    "LC 123/06 (Simples Nacional) regula esse tratamento " +
                    "diferenciado para microempresas e empresas de pequeno porte.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(60L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A Constituição Federal impede que as " +
                    "contribuições sociais para a seguridade social tenham base de " +
                    "cálculo própria de impostos.");
            question.setComentario(" Errado.\nAs taxas é que não poderão ter a base de cálculo " +
                    "própria dos impostos, segundo dispõe o art. 145, §2º, CF/88.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(61L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Objetivando evitar guerra fiscal " +
                    "entre a União, os Estados-membros, o Distrito Federal e os " +
                    "Municípios, a Constituição Federal cuidou de dispor sobre os " +
                    "conflitos de competência, em matéria tributária, não deixando " +
                    "margem para norma infraconstitucional regular o tema.");
            question.setComentario(" Errado.\nSegundo o art. 146, I, CF/88, compete à lei " +
                    "complementar dispor sobre os conflitos de competência entre " +
                    "os entes. Leis complementares, por estarem abaixo " +
                    "hierarquicamente da Constituição, são normas " +
                    "infraconstitucionais. Do mesmo modo, leis ordinárias e leis " +
                    "delegadas também são normas infraconstitucionais.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(62L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Lei complementar poderá " +
                    "instituir regime único de arrecadação dos impostos e " +
                    "contribuições da União, dos Estados, do Distrito Federal e dos " +
                    "Municípios.");
            question.setComentario(" Correto.\nÉ o que dispõe o art. 146, III, d, combinado com o art. " +
                    "146, §único, CF/88. Essa lei complementar foi publicada em " +
                    "14 de dezembro de 2006; é a LC 123/06, que instituiu o " +
                    "“Simples Nacional”, pelo qual as micro e pequenas empresas e " +
                    "o pequeno empresário poderão efetuar a quitação de impostos e " +
                    "contribuições federais, estaduais e distritais de forma " +
                    "unificada.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(63L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A concessão de subsídio ou isenção, redução " +
                    "de base de cálculo, crédito presumido, anistia ou remissão " +
                    "relativos a impostos, taxas ou contribuições depende de lei " +
                    "complementar específica, que regule exclusivamente as " +
                    "matérias acima enumeradas ou o correspondente tributo ou " +
                    "contribuição;");
            question.setComentario(" Errado.\nEmbora, a definição de lei específica esteja correta (lei " +
                    "específica realmente é a lei que regule exclusivamente as " +
                    "matérias acima enumeradas ou o correspondente tributo ou contribuição), não há necessidade de lei complementar. É o que " +
                    "dispõe o artigo 150, §6º, CF/88.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(64L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A concessão de subsídio ou isenção, redução " +
                    "de base de cálculo, crédito presumido, anistia ou remissão " +
                    "relativos a impostos, taxas ou contribuições depende de lei " +
                    "federal, estadual ou municipal, não constituindo limitação " +
                    "constitucional do poder de tributar.");
            question.setComentario(" Errado.\nSegundo o artigo 150, §6º, CF/88, precisa que essa lei " +
                    "seja específica e esta concessão é, sim, uma limitação ao poder " +
                    "de tributar, incluída na seção II (limitações ao poder de " +
                    "tributar), do capítulo I (sitema tributário nacional), do título IV " +
                    "(Da tributação e do orçamento) da Constituição Federal.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(65L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A concessão de subsídio ou isenção, redução " +
                    "de base de cálculo, crédito presumido, anistia ou remissão " +
                    "relativos a impostos, taxas ou contribuições depende de lei " +
                    "federal, estadual ou municipal específica, sendo uma limitação " +
                    "do poder de tributar.");
            question.setComentario(" Correto.\nÉ exatamente o que dispõe o artigo 150, §6º, CF/88. É " +
                    "bom reforçar que esse dispositivo excepciona expressamente a " +
                    "concessão de benefícios relativos ao ICMS, que poderão ocorrer " +
                    "por meio de convênio entre os Estados no âmbito do CONFAZ " +
                    "(art. 155, §2º, XII, g, CF/88).");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(66L);
            question.setTema("Direito Tributário");
            question.setEnunciado("É matéria reservada a lei " +
                    "complementar a determinação de medidas para que os " +
                    "consumidores sejam esclarecidos acerca dos impostos que " +
                    "incidam sobre mercadorias e serviços.");
            question.setComentario(" Errado.\nÉ matéria de simples lei ordinária, conforme dispõe o " +
                    "art 150, §5º, CF/88.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(67L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Não é matéria de lei complementar o " +
                    "adequado tratamento tributário ao ato cooperativo praticado " +
                    "pelas sociedades cooperativas.");
            question.setComentario(" Errado.\nEste será caso de lei complementar, previsto no art. " +
                    "146, III, c, CF/88.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(68L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Não é matéria de lei complementar a " +
                    "determinação de medidas para que os consumidores sejam " +
                    "esclarecidos acerca dos impostos que incidam sobre " +
                    "mercadorias e serviços.");
            question.setComentario(" Correto.\nNeste caso precisamos de uma simples lei ordinária, " +
                    "como dispõe o art. 150, §5º, CF/88.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(69L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A Constituição Federal permite " +
                    "que lei complementar estabeleça critérios especiais de " +
                    "tributação, com o objetivo de prevenir desequilíbrios da " +
                    "concorrência.");
            question.setComentario(" Correto.\nÉ nesse sentido o art. 146-A, CF/88, ao dispor que lei " +
                    "complementar poderá estabelecer critérios especiais de " +
                    "tributação, com o objetivo de prevenir desequilíbrios da " +
                    "concorrência, sem, todavia, prejudicar a competência de a " +
                    "União, por lei, estabelecer normas de igual objetivo.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(70L);
            question.setTema("Direito Tributário");
            question.setEnunciado("É admissível que lei complementar " +
                    "regule as limitações que a Constituição Federal impõe ao poder " +
                    "de tributar.");
            question.setComentario(" Correto.\nÉ o que dispõe o art. 146, II, CF/88.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(71L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Lei complementar poderá " +
                    "instituir regime único de arrecadação dos impostos e " +
                    "contribuições da União, dos Estados, do Distrito Federal e dos " +
                    "Municípios.");
            question.setComentario(" Correto.\nÉ o que dispõe o art. 146, III, d, combinado com o art. " +
                    "146, §único, CF/88. Essa lei complementar foi publicada em " +
                    "14 de dezembro de 2006; é a LC 123/06, que instituiu o " +
                    "“Simples Nacional”, pelo qual as micro e pequenas empresas e " +
                    "o pequeno empresário individual poderão efetuar a quitação de " +
                    "impostos e contribuições federais, estaduais e distritais de " +
                    "forma unificada.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(72L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Uma vez instituído o regime " +
                    "único a que se refere o art. 146, parágrafo único da " +
                    "Constituição, poderá o contribuinte optar ou não por ele.");
            question.setComentario(" Correto.\nO próprio art. 146, §único, I, CF/88, dispõe que o " +
                    "regime único de arrecadação de impostos e contribuições será " +
                    "opcional para o contribuinte.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(73L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Uma vez instituído o regime " +
                    "único a que se refere o art. 146, parágrafo único da " +
                    "Constituição, nele não poderão ser estabelecidas condições de " +
                    "enquadramento diferenciadas por Estado.");
            question.setComentario(" Errado.\nAs condições de enquadramento diferenciado por " +
                    "Estado têm previsão constitucional no próprio art. 146, §único, " +
                    "II. Essa possibilidade foi adotada pela LC 123/06, que " +
                    "estabeleceu efetivamente condições diferenciadas para os " +
                    "Estados.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(74L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Os entes federados poderão, no " +
                    "regime único, adotar cadastro único de contribuintes.");
            question.setComentario(" Correto.\nÉ o que diz o art. 146, §único, IV, CF/88.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(75L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Uma norma geral poderá, a pretexto de " +
                    "definir tratamento diferenciado e favorecido para as micro e " +
                    "pequenas empresas, instituir regime único de arrecadação de " +
                    "impostos e contribuições dos entes federados.");
            question.setComentario(" Correto.\nÉ o que diz o art. 146, III, d, combinado com o art. " +
                    "146, §único, CF/88.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(76L);
            question.setTema("Direito Tributário");
            question.setEnunciado("O Distrito Federal, entidade integrante da " +
                    "República Federativa do Brasil, pode instituir imposto sobre " +
                    "propriedade territorial rural; imposto sobre transmissão causa " +
                    "mortis de quaisquer bens ou direitos, contribuição de melhoria " +
                    "e contribuições sociais de quaisquer espécies.");
            question.setComentario(" Errado.\nO Distrito Federal pode instituir os tributos que " +
                    "competem aos Estados e aos Municípios; assim, só não poderá instituir “contribuições sociais de quaisquer espécies” já que, em regra, contribuições sociais serão instituídas apenas pela União (art. 149, CF/88), excetuando-se apenas 2 casos:\n" +
                    "\uF0A7 A contribuição para iluminação pública (CIP ou COSIP)\n" +
                    "\uF0A7 A contribuição para custeio do regime próprio de previdência social.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(77L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Compete à União e ao Estados a " +
                    "instituição de contribuições de intervenção no domínio " +
                    "econômico.");
            question.setComentario(" Errado.\nCompete exclusivamente à União (art. 149, CF/88).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(78L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A instituição de contribuições de " +
                    "intervenção no domínio econômico é da competência exclusiva " +
                    "da União, não podendo, portanto, ser delegada a outros entes " +
                    "federativos, como Estados, Municípios e Distrito Federal.");
            question.setComentario(" Correto.\nÉ o que dispõe o art. 149, CF/88 – competência " +
                    "privativa da União – e o que dispõe o art. 7º, CTN – prevê que a " +
                    "competência tributária é indelegável. Saliente-se que a " +
                    "competência tributária é indelegável, mas a capacidade " +
                    "tributária ativa (que compreende as funções de arrecadar ou " +
                    "fiscalizar tributos, ou de executar leis, serviços, atos ou " +
                    "decisões administrativas em matéria tributária, conferida por " +
                    "uma pessoa jurídica de direito público a outra) é plenamente " +
                    "delegável.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(79L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Em consonância com a " +
                    "Constituição Federal, somente a União é dotada de " +
                    "competência tributária para instituir empréstimos " +
                    "compulsórios, imposto sobre grandes fortunas e contribuição " +
                    "social para custeio de sistemas de previdência social.");
            question.setComentario(" Errado.\nEmbora a União possa instituir todos esses tributos, os " +
                    "Estados, DF, e Municípios também poderão instituir a " +
                    "contribuição social para custeio de seus sistemas de " +
                    "previdência social (regime próprio de previdência para seus " +
                    "servidores públicos).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(80L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A Constituição atribui à União competência " +
                    "residual para instituir impostos, contribuições para a " +
                    "seguridade social e taxas.");
            question.setComentario(" Errado.\nA União só possui competência para instituir impostos " +
                    "residuais (art. 154, I, CF/88) e contribuições residuais (art. " +
                    "195, §4º, CF/88). Já a competência residual para instituir " +
                    "taxas e contribuições de melhoria pertence aos Estados e ao " +
                    "Distrito Federal. Esta competência não foi expressamente " +
                    "conferida pela Constituição, porém, doutrinariamente entendese " +
                    "que foi conferida pelo art. 25, §1º: “São reservadas aos " +
                    "estados as competências que não lhes sejam vedadas por esta " +
                    "Constituição”. Os artigos 77, caput, e 81, caput, CTN também " +
                    "corroboram esse entendimento.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(81L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Para instituir impostos com fundamento na " +
                    "competência residual, é imprescindível, além da competência " +
                    "tributária, veiculação da matéria por lei complementar e " +
                    "observância dos princípios constitucionais da nãocumulatividade " +
                    "e da identidade plena com outros impostos " +
                    "discriminados na Constituição, no que se refere a fato gerador e " +
                    "base de cálculo.");
            question.setComentario(" Errado.\nEstá errada a parte que diz “identidade plena com outros impostos discriminados na Constituição, no que se refere a fato gerador e base de cálculo”. Os requisitos para que se instituam os impostos residuais, de acordo com o art. 154, I, CF/88, são:\n" +
                    "\uF0A7 Exigência de lei complementar;\n" +
                    "\uF0A7 Sejam não-cumulativos;\n" +
                    "\uF0A7 Não tenham FG ou BC próprios dos demais impostos discriminados na CF.\nDe acordo com o art.195, §4º, CF/88, a União também pode instituir contribuições novas, desde que também observe os seguintes requisitos:\n" +
                    "\uF0A7 Mediante lei complementar;\n" +
                    "\uF0A7 Sejam não-cumulativas; e\n" +
                    "\uF0A7 Não tenham FG ou BC próprios das demais contribuições discriminadas na CF.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(82L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Somente a União tem competência residual " +
                    "para instituir impostos.");
            question.setComentario(" Correto.\nÉ o que dispõe o art. 154, I, CF/88.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(83L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Os Estados, o Distrito Federal e os " +
                    "Municípios têm competência para instituir impostos, taxas, " +
                    "contribuição de melhoria e contribuição de intervenção no " +
                    "domínio econômico, que a Constituição lhes reserva.");
            question.setComentario(" Errado.\nSegundo o art. 149, CF/88, somente a União pode " +
                    "instiuir a CIDE - contribuição de intervenção no domínio " +
                    "econômico.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(84L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Somente a União dispõe de " +
                    "competência para instituir impostos extraordinários no caso de " +
                    "guerra externa, contribuição de intervenção no domínio " +
                    "econômico e empréstimos compulsórios.");
            question.setComentario(" Correto.\nÉ o que dispõe a Consituição em seus artigos: 154, II " +
                    "(IEG), 149 (CIDE) e 148 (Empréstimos Compulsórios).");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(85L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Os Estados-membros e o Distrito " +
                    "Federal não podem instituir imposto sobre doação de bens ou " +
                    "direitos, porquanto a matéria é objeto de tributação pelo " +
                    "imposto sobre a renda e proventos de qualquer natureza.");
            question.setComentario(" Errado.\nExiste sim o imposto sobre doação de bens ou direitos, " +
                    "e ele é realmente de competência dos Estados e do DF. Este " +
                    "imposto – ITCMD ou ITCD– está previsto no art. 155, I, CF/88.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(86L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A Constituição Federal atribui aos " +
                    "Estados a competência para a instituição de taxas, " +
                    "contribuições de melhoria e empréstimos compulsórios.");
            question.setComentario(" Errado.\nTaxas e contribuições de melhoria são de competência " +
                    "comum entre União, Estados e Municípios; todavia, os " +
                    "empréstimos compulsórios só poderão ser instituídos pela " +
                    "União (art. 148, caput, CF/88).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(87L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A Constituição Federal atribui aos " +
                    "Estados a competência para a instituição de contribuições de " +
                    "interesse de categorias profissionais ou econômicas, " +
                    "contribuições de melhoria e taxas.");
            question.setComentario(" Errado.\nSomente a União pode instituir contribuições de " +
                    "interesse de categorias profissionais ou econômicas (art. 149, " +
                    "caput, CF/88).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(88L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A Constituição Federal atribui aos " +
                    "Estados a competência para a instituição de contribuições " +
                    "sociais relativas à seguridade social, contribuições de melhoria " +
                    "e taxas.");
            question.setComentario(" Correto.\nPorém, lebramos que esta contribuição social para " +
                    "seguridade social é para o custeio do regime próprio de " +
                    "previdência social dos seus servidores, cuja alíquota não " +
                    "poderá ser inferior à alíquota cobrada pela União dos seus " +
                    "servidores efetivos (art. 149, §1º, CF/88).");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(89L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Inclui-se na competência tributária dos Municípios a instituição de Empréstimo compulsório.");
            question.setComentario(" Errado.\nA competência é exclusiva da União, mediante lei complementar (art. 148, CF/88).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(90L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Inclui-se na competência tributária dos Municípios a instituição de Imposto sobre a propriedade de veículos automotores.");
            question.setComentario(" Errado.\nA competência do IPVA é estadual (art. 155, III, CF/88). Também fazem parte da competência tributária estadual:\n" +
                    "1- ICMS; e\n" +
                    "2- ITCMD.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(91L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Inclui-se na competência tributária dos Municípios a instituição de Imposto sobre a propriedade predial e territorial urbana.");
            question.setComentario(" Correto.\nAlém do IPTU (art. 156, I, CF/88), os Municípios podem instituir os seguintes impostos:\n" +
                    "1- ISS; e\n" +
                    "2- ITBI.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(92L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Inclui-se na competência tributária " +
                    "dos Municípios a instituição de Imposto sobre a propriedade " +
                    "territorial rural.");
            question.setComentario(" Errado.\nO ITR é de competência da União (art. 153, VI, CF/88). " +
                    "Todavia, caso o Município assim venha a optar, poderá " +
                    "fiscalizá-lo e cobrá-lo (art. 153, §4º, III); isso, entretanto, não " +
                    "significa que a competência tributária seja transferida para o " +
                    "Município. O que ocorre é o que a doutrina costuma chamar de parafiscalidade, que é a transferência da capacidade tributária " +
                    "ativa da União para o Município.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(93L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Inclui-se na competência tributária " +
                    "dos Municípios a instituição de Imposto sobre serviço de " +
                    "transporte intermunicipal e de comunicação.");
            question.setComentario(" Errado.\nO serviço de transporte intermunicipal, interestadual e " +
                    "de comunicação é o “S” do ICMS, e este imposto é de " +
                    "competência estadual (art. 155, II, CF/88).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(94L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A competência tributária não exercida " +
                    "por um ente da Federação poderá ser delegada a outro.");
            question.setComentario(" Errado.\no art. 7º, CTN, proíbe a delegação da competência " +
                    "tributária, e o art. 8º dispõe que o não-exercício da " +
                    "competência tributária não defere a outra pessoa jurídica o " +
                    "direito de utilizá-la. Importante atentar para a diferença entre " +
                    "competência tributária e capacidade tributária. Competência é " +
                    "a atribuição dada pela CF/88 aos entes políticos (União, " +
                    "Estados, Distrito Federal e Municípios) da prerrogativa de " +
                    "instituir os seus tributos. Capacidade é o exercício da " +
                    "competência, e é exercida pela fiscalização, cobrança e " +
                    "excecução de leis e atos administrativos em matéria tributária.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(95L);
            question.setTema("Direito Tributário");
            question.setEnunciado("É vedado aos Estados instituírem " +
                    "contribuição de melhoria.");
            question.setComentario(" Errado.\nTodos os entes podem instituí-la (art. 145, III, CF/88).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(96L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Constituição da República Federativa " +
                    "do Brasil de 1988 - CRFB/88 atribuiu competência aos " +
                    "Estados para instituir imposto sobre a transmissão de bens " +
                    "inter vivos.");
            question.setComentario(" Errado.\nO ITBI é de competência dos Municípios (art. 156, II, " +
                    "CF/88).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(97L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Constituição da República Federativa " +
                    "do Brasil de 1988 - CRFB/88 atribuiu competência aos " +
                    "Estados para instituir taxa, pelo exercício do poder de polícia.");
            question.setComentario(" Correto.\nAs taxas, sejam elas de utilização de serviços, sejam " +
                    "elas de polícia, podem ser instituídas por quaisquer entes (art. " +
                    "145, II, CF/88).");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(98L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Constituição da República Federativa " +
                    "do Brasil de 1988 - CRFB/88 atribuiu competência aos " +
                    "Estados para instituir imposto sobre a transmissão de bens " +
                    "causa mortis.");
            question.setComentario(" Correto.\nO ITCMD é de competência estadual, conforme o art. " +
                    "155, I, CF/88.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(99L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Constituição da República Federativa " +
                    "do Brasil de 1988 - CRFB/88 atribuiu competência aos " +
                    "Estados para instituir contribuição previdenciária.");
            question.setComentario(" Correto.\nOs Estados podem instituir contribuições " +
                    "previdênciárias cobradas de seus servidores para o custeio do " +
                    "Regime Próprio de Previdência Social (art. 149, §1º, CF/88). " +
                    "Um ponto a destacar seria o caso de os Estados não possuírem " +
                    "Regime Próprio de Previdência; nesse caso, eles estarão " +
                    "necessariamente vinculados ao Regime Geral de Previdência " +
                    "Social, de maneira que tanto os servidores como o ente político " +
                    "terão de contribuir para esse regime.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(100L);
            question.setTema("Direito Tributário");
            question.setEnunciado("É permitido ao Distrito Federal e aos " +
                    "Municípios instituir contribuição para o custeio do serviço de " +
                    "iluminação pública.");
            question.setComentario(" Correto.\nÉ atribuida esta competência pelo art. 149-A, CF/88.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(101L);
            question.setTema("Direito Tributário");
            question.setEnunciado("De acordo com a Constituição " +
                    "Federal, os Municípios não têm competência para instituir " +
                    "contribuição que se destine ao custeio de serviço municipal de " +
                    "iluminação pública.");
            question.setComentario(" Errado.\nContraria o disposto no art. 149-A, CF/88.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(102L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Compete ao Município a " +
                    "instituição de empréstimo compulsório para atender a despesas " +
                    "extraordinárias, decorrentes de calamidade pública de âmbito " +
                    "municipal.");
            question.setComentario(" Errado.\nO art. 148, caput, CF/88, é bem claro em relação à " +
                    "competência para a instituição de empréstimos compulsórios: " +
                    "somente a União, mediante lei complementar, poderá instituílos.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(103L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Compete ao Município a " +
                    "instituição de contribuição de interesse de categoria " +
                    "profissional.");
            question.setComentario(" Errado.\nAqui também a Constituição é taxativa ao determinar " +
                    "que somente a União poderá instituir as contribuições de " +
                    "interesse das categorias profissionais ou econômicas (art. 149, " +
                    "caput, CF/88). Saliente-se que essas contribuições também são " +
                    "chamadas de profissionais ou corporativas. Dentre elas, " +
                    "situam-se as contribuições para os conselhos de fiscalização " +
                    "profissional e a contribuição sindical.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(104L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A União pode exigir ou " +
                    "aumentar tributo sem a respectiva lei autorizativa.");
            question.setComentario(" Errado.\nSomente por lei pode ser insituído tributo, e, em regra, " +
                    "também é exigida lei para aumentá-los, ressalvando-se " +
                    "exceções como os impostos aduaneiros, entre outros (art. 150, " +
                    "I, c/c art. 153, §1º, CF/88).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(105L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Compete aos Estados e ao " +
                    "DF o imposto sobre a transmissão causa mortis e doação de " +
                    "bens e direitos.");
            question.setComentario(" Correto.\nO ITCMD é instituído tanto pelos Estados quanto pelo " +
                    "DF, podendo este último insituir tributos estaduais e " +
                    "municipais (art. 155, I; e art. 147, CF/88).");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(106L);
            question.setTema("Direito Tributário");
            question.setEnunciado("É da competência dos " +
                    "Estados o imposto sobre serviços de qualquer natureza.");
            question.setComentario(" Errado.\nO ISS é de competência municipal (art. 156, III, " +
                    "CF/88).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(107L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Na defesa de seus " +
                    "interesses econômicos, os Estados podem em caso de " +
                    "calamidade pública, instituir imposto novo, temporário, " +
                    "destinando cinqüenta por cento (50%) da arrecadação aos " +
                    "Municípios.");
            question.setComentario(" Errado.\nA questão possui duas impropriedades. A primeira é " +
                    "que a competência tributária residual é exclusiva da União (art. " +
                    "154, I; e art. 195, §4º, CF/88). A segunda está na calamidade " +
                    "pública como evento autorizativo para instituição de tributo, " +
                    "que está, também, dentro das competências da União, por meio " +
                    "dos empréstimos compulsórios (art. 148, I, CF/88).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(108L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Compete ao Distrito Federal " +
                    "instituir imposto sobre propriedade predial e territorial urbana.");
            question.setComentario(" Correto.\nO IPTU é um tributo municipal e, como o DF possui " +
                    "competência mista – estadual e municipal -, poderá instituí-lo " +
                    "(art. 147, c/c art. 156, I, CF/88).");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(109L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A competência tributária, a teor do " +
                    "que dispõe o Código Tributário Nacional, é indelegável. Isso " +
                    "significa que um ente tributante não pode instituir tributo que " +
                    "seja da competência tributária de outro. Não constitui, porém, " +
                    "violação a essa regra a delegação, por um ente tributante, a " +
                    "outro, das funções de arrecadar ou fiscalizar tributos.");
            question.setComentario(" Correto.\nÉ o que chamamos de delegação da capacidade " +
                    "tributária ativa (art. 7º, CTN).");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(110L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Não viola as regras do CTN e da " +
                    "Constituição Federal a possibilidade de a União cobrar tributo " +
                    "da competência estadual, na hipótese de Estado que não tenha " +
                    "exercitado ainda essa competência.");
            question.setComentario(" Errado.\nO não exercício da competência tributária por um dos " +
                    "entes não autoriza o exerício por outro (art. 8º, CTN). A CF/88 " +
                    "outorga competências aos entes políticos, mas não os obriga ao " +
                    "seu exercício. Não se trata de um poder-dever.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(111L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Não viola as regras do CTN e da " +
                    "Constituição Federal a instituição de lei estadual sobre tributo " +
                    "da competência de seus Municípios, que contenha apenas " +
                    "normas gerais sobre o mesmo tributo.");
            question.setComentario(" Errado.\nO ente competente para instituir normas gerais em " +
                    "matéria tributária é a União; os Estados poderão legislar de " +
                    "forma plena no caso de a União faltar em seu mister; porém o " +
                    "exercício da legislação plena por parte dos Estados só se aplica " +
                    "no que concerne aos tributos estaduais, não se aplicando a " +
                    "tributos municipais (art. 24, §3º, CF/88).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(112L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Não viola as regras do CTN e da " +
                    "Constituição Federal a instituição de imposto extraordinário de " +
                    "guerra, por qualquer dos entes tributantes, na hipótese de a " +
                    "União não tê-lo feito tempestivamente em estado de guerra " +
                    "iminente.");
            question.setComentario(" Errado.\nSó a União pode instituir o IEG; a sua não instituição " +
                    "não autoriza que outro ente o faça (art. 154, II, CF/88).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(113L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Com relação ao imposto sobre importação " +
                    "de produtos Estrangeiros, a Constituição Federal outorga à " +
                    "União a competência para instituí-lo, vale dizer, concede a este " +
                    "ente político a possibilidade de instituir imposto sobre a " +
                    "entrada no território nacional, para incorporação à economia " +
                    "interna, de bem destinado ou não ao comércio, produzido pela " +
                    "natureza ou pela ação humana, fora do território nacional.");
            question.setComentario(" Correto.\nRelativamente ao Imposto de Importação, é " +
                    "competente para instituí-lo somente a União, " +
                    "independentemente de o bem ser destinado ou não ao " +
                    "comércio, produzido pela natureza ou pela ação humana (art. " +
                    "153, I, CF/88).");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(114L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A competência tributária é indelegável, " +
                    "salvo atribuição das funções de arrecadar ou fiscalizar tributos, " +
                    "ou de executar leis, serviços, atos ou decisões administrativas " +
                    "em matéria tributária, conferida por uma pessoa jurídica de " +
                    "direito público a outra.");
            question.setComentario(" Correto.\nNeste caso está se delegando apenas a capacidade " +
                    "tributária ativa (art. 7º, CTN).");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(115L);
            question.setTema("Direito Tributário");
            question.setEnunciado("O não-exercício da competência tributária " +
                    "por determinada pessoa política autoriza a União a exercitar tal " +
                    "competência, com base no princípio da isonomia.");
            question.setComentario(" Errado.\nO não exercício da competência tributária por um dos " +
                    "entes não autoriza o exercício por outro, nem mesmo pela " +
                    "União (art. 8º, CTN). A CF/88 outorga competências aos entes " +
                    "políticos, mas não os obriga ao seu exercício. Não se trata de " +
                    "um poder-dever.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(116L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A pessoa política que detém a competência " +
                    "tributária para instituir o imposto também é competente para " +
                    "aumentá-lo, diminuí-lo ou mesmo conceder isenções, " +
                    "observados os limites constitucionais e legais.");
            question.setComentario(" Correto.\nA pessoa competente para instituir é que terá também " +
                    "a competência para aumentá-lo, diminuí-lo, conceder isenções " +
                    "etc. Todavia, existe a exceção das isenções e benefícios fiscais " +
                    "concernentes ao ICMS, os quais só poderão ser concedidos " +
                    "mediante deliberação dos Estados, reunidos no âmbito do " +
                    "CONFAZ (art. 155, §2º, XI, h, CF/88).");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(117L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A União poderá instituir empréstimo " +
                    "compulsório para resgatar sua dívida interna.");
            question.setComentario(" Errado.\nO resgate da dívida interna não está entre os motivos " +
                    "para instituição do empréstimo compulsório (art. 148, CF/88).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(118L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A União poderá conceder isenções de " +
                    "tributos estaduais, desde que sejam os Estados compensados " +
                    "pela quebra de arrecadação.");
            question.setComentario(" Errado.\nÉ vedada a isenção heterônoma, não podendo ser " +
                    "excepcionalizada neste caso (art. 151, III, CF/88). Um pouco de história: antes da promulgação da atual constituição, ainda sob " +
                    "a égide da CF/67, a União estava autorizada a conceder " +
                    "isenções relativamente a tributos estaduais e municipais, desde " +
                    "que por meio de Lei Complementar.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(119L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A União poderá tributar a renda das " +
                    "obrigações da dívida pública dos Estados, desde que em " +
                    "igualdade de condições com as suas obrigações.");
            question.setComentario(" Correto.\nEstabelece o art. 151, I, CF/88, que é vedado à União " +
                    "tributar a renda das obrigações da dívida pública dos Estados, " +
                    "do Distrito Federal e dos Municípios, bem como a remuneração " +
                    "e os proventos dos respectivos agentes públicos, em níveis " +
                    "superiores aos que fixar para suas obrigações e para seus " +
                    "agentes. Foi esse o entendimento do examinador ao dar como " +
                    "correta a questão; todavia, a CF/88 veda apenas que a União " +
                    "fixe níveis superiores, dando margem para fixação de carga " +
                    "idêntica ou, até mesmo, inferior à que fixar para suas " +
                    "obrigações e seus agentes. Assim, o mais sensato seria dar a " +
                    "questão como ERRADA.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(120L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A União poderá exigir tributo por meio de " +
                    "decreto.");
            question.setComentario(" Errado.\nContraria a legalidade tributária (art. 150, I, CF/88).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(121L);
            question.setTema("Direito Tributário");
            question.setEnunciado("As imunidades tributárias são " +
                    "classificadas em ontológicas e políticas.");
            question.setComentario(" Correto.\nAs imunidades ontológicas são aquelas “de direito”, " +
                    "concedidas devido ao mérito das ações e serviços prestados " +
                    "pelas entidades beneficiadas. Diz-se que as pessoas " +
                    "abrangidas, embora tenham capacidade econômica, não " +
                    "possuem capacidade contributiva, pois este 'poder econômico' " +
                    "acaba por ser revertido na prestação de serviços. Ex.: a " +
                    "imunidade recíproca, imunidade de assistência social e " +
                    "educacional. " +
                    "As imunidades políticas são necessariamente positivadas na " +
                    "Constituição e existem por razões de cunho político. Embora as " +
                    "pessoas ou objetos abrangidos tenham capacidade de " +
                    "contribuir, eles se tornam imunes, pois assim é conveniente. " +
                    "Ex.: Imunidades dos templos, das entidades sindicais de " +
                    "trabalhadores e dos partidos políticos e suas fundações, e a " +
                    "imunidade objetiva conferida aos livros, jornais, periódicos e " +
                    "papel destinado à sua impressão.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(122L);
            question.setTema("Direito Tributário");
            question.setEnunciado("É vedado aos entes tributantes " +
                    "instituir impostos sobre patrimônio, renda ou serviços de " +
                    "fundação de partido político, quando não relacionados com as " +
                    "finalidades essenciais da entidade fundacional.");
            question.setComentario(" Errado.\nA Consituição, em seu art. 150, VI, c, confere o que " +
                    "chamamos de imunidade partidária, sindical, educacional e assistencial: “É vedado à União, Estados, ao DF e aos " +
                    "Municípios instituir impostos sobre o patrimônio, renda ou " +
                    "serviços dos partidos políticos, inclusive suas fundações, das " +
                    "entidades sindicais dos trabalhadores, das instituições de " +
                    "educação e de assistência social, sem fins lucrativos, atendidos " +
                    "os requisitos da lei”. E o art. 150, § 4º, dispõe que essa vedação " +
                    "compreende somente o patrimônio, a renda e os serviços, " +
                    "relacionados com as finalidades essenciais destas entidades.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(123L);
            question.setTema("Direito Tributário");
            question.setEnunciado("O empréstimo compulsório, no " +
                    "caso de investimento público de caráter urgente e de relevante " +
                    "interesse nacional, pode ser exigido no mesmo exercício " +
                    "financeiro em que haja sido publicada a lei que o instituiu.");
            question.setComentario(" Errado.\nSomente o empréstimo compulsório de motivos " +
                    "imprevisíveis (art. 148, I , CF/88) é que constitui exceção à " +
                    "anterioridade e à noventena. O empréstimo compulsório para " +
                    "custear investimento público deve respeitar a anterioredade " +
                    "geral e a anterioridade mitigada (ou noventena).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(124L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Na iminência ou no caso de guerra " +
                    "externa, é permitido à União iniciar a cobrança de imposto " +
                    "extraordinário no mesmo exercício financeiro em que for " +
                    "publicada a lei que o instituir.");
            question.setComentario(" Correto.\nO IEG é uma exceção à anterioridade, até por conta de " +
                    "fatores relacionados à segurança nacional. Seria no mínimo um " +
                    "tanto desarrazoado querer que a República Federativa do " +
                    "Brasil, ao necessitar de recursos extras por ter entrado em " +
                    "conflito bélico externo, respeite princípios tributários cujos " +
                    "lapsos de tempo poderiam influir sobremaneira no desfecho do " +
                    "entrevero (art. 154, II, CF/88).");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(125L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Na hipótese de criação de imposto " +
                    "extraordinário em decorrência de guerra externa, que incida " +
                    "sobre a mesma base de cálculo do imposto sobre operações " +
                    "relativas à circulação de mercadorias e sobre prestações de " +
                    "serviços de transporte interestadual e intermunicipal e de " +
                    "comunicação (ICMS), é permitido à União instituir isenção do " +
                    "imposto de competência dos Estados e do Distrito Federal.");
            question.setComentario(" Errado.\nIsso é vedado pelo art. 151, III ,da CF/88.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(126L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Nos termos da Constituição Federal, é " +
                    "vedado à União, aos Estados, ao Distrito Federal e aos " +
                    "Municípios instituir imposto sobre patrimônio, renda ou " +
                    "serviços das instituições de previdência social, sem fins " +
                    "lucrativos, ainda que tais instituições exijam contribuição de " +
                    "seus filiados para atendimento de suas finalidades, desde que: " +
                    "[a] tenham sido constituídas com observância dos requisitos " +
                    "previstos em lei e [b] seu patrimônio, renda e serviços sejam " +
                    "relacionados com suas finalidades essenciais.");
            question.setComentario(" Errado.\nA impropriedade da questão é que o art. 150, VI, c, " +
                    "CF/88, apenas cita instituições de assistência social, sem " +
                    "contemplar as de previdência social. Todavia, o STF, em sua " +
                    "súmula 730, determina que “a imunidade conferida a " +
                    "instituições de assistência social sem fins lucrativos pelo art. " +
                    "150, VI, c, da CF, somente alcançará as entidades fechadas de " +
                    "previdência social se não houver contribuição dos " +
                    "beneficiários”; isso se deve ao fato de que as instituições de " +
                    "previdência que não cobram contribuição dos seus " +
                    "beneficiários nada mais são do que instituições assistenciais, " +
                    "pois concedem benefícios sem a devida contraprestação.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(127L);
            question.setTema("Direito Tributário");
            question.setEnunciado("À exceção do imposto sobre importação " +
                    "de produtos estrangeiros, do imposto sobre exportação, para o " +
                    "exterior, de produtos nacionais ou nacionalizados e do ICMS, " +
                    "nenhum outro imposto poderá incidir sobre operações relativas " +
                    "a energia elétrica, serviços de telecomunicações, derivados de " +
                    "petróleo, combustíveis e minerais do País.");
            question.setComentario(" Correto.\nÉ o que dispõe, ipsis litteris, o art. 155 § 3º, CF/88: “à " +
                    "exceção dos impostos de que tratam o inciso II do caput deste " +
                    "artigo e o art. 153, I e II, nenhum outro imposto poderá incidir " +
                    "sobre operações relativas a energia elétrica, serviços de " +
                    "telecomunicações, derivados de petróleo, combustíveis e " +
                    "minerais do País”.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(128L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A União pode conceder " +
                    "isenções de tributos da competência dos Estados.");
            question.setComentario(" Errado.\nÉ vedada a isenção heterônoma (art. 151, III, CF/88). " +
                    "Um pouco de história: antes da promulgação da atual " +
                    "constituição, ainda sob a égide da CF/67, a União estava " +
                    "autorizada a conceder isenções relativamente a tributos " +
                    "estaduais e municipais, desde que por meio de Lei " +
                    "Complementar.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(129L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Aos Estados é permitido " +
                    "tributar a renda, o patrimônio e os serviços dos Municípios.");
            question.setComentario(" Errado.\nIsso é vedado pela imunidade recíproca, que tem como " +
                    "razão subjacente a própria garantia da Federação, o equilíbrio " +
                    "do federalismo (art. 150, VI, a, CF/88).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(130L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Na defesa de seus " +
                    "interesses econômicos, os Estados podem estabelecer " +
                    "limitações ao tráfego de bens, por meio de tributos " +
                    "intermunicipais.");
            question.setComentario(" Errado.\nA CF/88, em seu art. 150, V, expressamente proíbe " +
                    "qualquer limitação ao tráfego de pessoas ou bens, por meio de " +
                    "tributos interestaduais ou intermunicipais. Estabelece ainda " +
                    "um única exceção que é a cobrança de pedágio pela utilização " +
                    "de vias conservadas pelo Poder Público. Segundo a " +
                    "jurisprudência do STF, há que se diferenciar os pedágios " +
                    "operacionalizados pelo Poder Público (considerados tributos do " +
                    "tipo TAXA) e os operacionalizados pelas concessionárias " +
                    "particulares (considerados preços públicos ou TARIFA).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(131L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Na defesa de seus interesses econômicos, os Estados podem estabelecer diferença tributária entre bens, em razão de sua procedência.");
            question.setComentario(" Errado.\nIsso é vedado pelo art. 152, CF/88, que é expresso nesse sentido: “É vedado aos Estados, ao Distrito Federal e aos Municípios estabelecer diferença tributária entre bens e serviços, de qualquer natureza, em razão de sua procedência ou destino”. É o chamado princípio da não-discriminação tributária em razão da procedência ou destino.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(132L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Na defesa de seus interesses econômicos, os Estados podem conceder isenção geral dos impostos estaduais e municipais, mediante lei complementar.");
            question.setComentario(" Errado.\nO ente que tem competência para instituir determinado tributo é quem tem competência para extingui-lo, majorá-lo, diminuí-lo, conceder isenção. Daí porque a União não tem ingerência sobre os tributos estaduais e municipais, nem o Estados, sobre os tributos municipais.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(133L);
            question.setTema("Direito Tributário");
            question.setEnunciado("O princípio da anterioridade não se aplica ao ICMS.");
            question.setComentario(" Errado.\nO ICMS só será exceção à anterioridade no que tange à redução e restabelecimento das alíquotas do ICMS-monofásico (art. 155, §4º, CF/88).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(134L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Norma legal que altera o prazo de recolhimento da obrigação tributária não se sujeita ao princípio da anterioridade.");
            question.setComentario(" Correto.\nO enunciado da questão é cópia fiel da Súmula 669, do STF.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(135L);
            question.setTema("Direito Tributário");
            question.setEnunciado("O princípio da anterioridade não se aplica ao Imposto sobre Operações Financeiras - IOF.");
            question.setComentario(" Correto.\nO IOF, assim como o II, IE e IPI são os chamados impostos regulatórios, e por isso não se sujeitam à anterioridade (art. 153, §1º, CF/88). Lembramos porém que o IPI será sujeito à noventena, diferentemente dos outros três.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(136L);
            question.setTema("Direito Tributário");
            question.setEnunciado("O princípio da anterioridade não se aplica ao Imposto sobre Propriedade Predial e Territorial Urbana – IPTU.");
            question.setComentario(" Errado.\nO IPTU e o IPVA possuem uma única exceção: em se tratando da fixação da sua base de cálculo, não precisa observar a noventena. Porém, a anterioridade geral sempre se aplica (art. 150, §1º, CF/88).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(137L);
            question.setTema("Direito Tributário");
            question.setEnunciado("O princípio da anterioridade não se aplica ao Imposto de Renda Pessoa Jurídica – IRPJ.");
            question.setComentario(" Errado.\nO IR é exceção apenas à noventena, mas obedece à anterioridade geral. Já com o IPI acontece o oposto: é exceção à anteriordade geral, mas obedece à noventena (art. 150, §1º, CF/88).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(138L);
            question.setTema("Direito Tributário");
            question.setEnunciado("O princípio da anterioridade não se aplica ao Imposto sobre Propriedade de Veículos Automotores – IPVA.");
            question.setComentario(" Errado.\nO IPTU e o IPVA possuem uma única exceção: em se tratando da fixação da sua base de cálculo, não precisa observar a noventena. Porém, a anterioridade geral sempre se aplica (art. 150, §1º, CF/88).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(139L);
            question.setTema("Direito Tributário");
            question.setEnunciado("O Imposto sobre Importação de Produtos Estrangeiros sujeita-se, sem exceções, ao princípio da estrita legalidade.");
            question.setComentario(" Errado.\nEle é exceção à legalidade no que tange à majoração e redução de suas alíquotas, podendo ser feita por ato do Poder Executivo (decreto presidencial ou portaria do Ministro da Fazenda). Todavia, alertamos que a faculdade do Poder Executivo de alterar as alíquotas do II (assim como do IE, IPI e IOF) não é plena, pois deve obedecer às condições e limites estabelecidos em lei ordinária; no caso do IE, por exemplo, esses limites e condições estão dispostos no art. 3º, do Decreto-Lei 1578/77.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(140L);
            question.setTema("Direito Tributário");
            question.setEnunciado("O Imposto sobre Importação de Produtos Estrangeiros pode ter suas alíquotas e bases de cálculo alteradas pelo Poder Executivo, atendidas as condições e os limites estabelecidos em lei.");
            question.setComentario(" Errado.\nSomente as alíquotas é que podem ser alteradas dispensando-se a lei (art. 150, §1º, CF/88). Embora o CTN faça menção também às bases de cálculo, essa parte não foi recepcionada pela Consituição de 1988.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(141L);
            question.setTema("Direito Tributário");
            question.setEnunciado("É vedado à União elevar a alíquota do imposto sobre a renda e proventos de qualquer natureza, de 27,5% para 41%, incidente sobre renda líquida igual ou superior a R$ 120.000,00, auferida no ano civil por pessoa física, por força da disposição constitucional vedatória da utilização de tributo com efeito de confisco, bem assim da que prevê a graduação de impostos segundo a capacidade econômica do contribuinte.");
            question.setComentario(" Errado.\nQuestão um tanto controvertida. Convém, nela, discorrer um pouco mais Segundo uma parte da doutrina (Ségio Pinto Martins, Aires Barreto), o princípio da vedação ao confisco deve assumir caráter objetivo, ou seja, impede que o Estado exija exação do contribuinte em valor superior a 50%, porque assim o Estado absorveria a maior parte do seu patrimônio. Talvez a ESAF tenha se baseado nessa minoria que acredita que a definição de confisco deve assumir contornos objetivos. Já a jurisprudência do STF, quando do julgamento da ADI 2.010-2, assinalou que a análise do caráter confiscatório de um novo tributo ou majoração se faz em face da carga tributária total a que se sujeita o contribuinte, isto é, “resulta configurado o caráter confiscatório de determinado tributo, sempre que o efeito cumulativo – resultante das múltiplas incidências tributárias estabelecidas pela mesma entidade estatal – afetar, substancialmente, de maneira irrazoável, o patrimônio e /ou os rendimentos do contribuinte”.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(142L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Uma alíquota do imposto sobre produtos industrializados de 150%, por exemplo, não significa necessariamente confisco.");
            question.setComentario(" Correto.\nNessa questão, a banca optou por seguir a linha mais concreta do STF, no lugar de opiniões controvertidas da doutrina. Esse é o entendimento esposado pelo STF, na ADI 2.010-2, ao estabelecer que o caráter confiscatório deve ser analisado levando-se em conta toda a carga tributária, de determinado ente, que recaia sobre o contribuinte.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(143L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Cabe à lei complementar dispor sobre a vedação a que se estabeleçam limitações ao tráfego de pessoas ou bens, por meio de tributos interestaduais.");
            question.setComentario(" Correto.\nAssim dispõe o art. 150, V, CF/88: “É vedado à União, Estados, Distrito Federal e Municípios estabelecer limitações ao tráfego de pessoas ou bens, por meio de tributos interestaduais ou intermunicipais, ressalvada a cobrança de pedágio pela utilização de vias conservadas pelo Poder Público”. Segundo a jurisprudência do STF, há que se diferenciar os pedágios operacionalizados pelo Poder Público (considerados tributos do tipo TAXA) e os operacionalizados pelas concessionárias particulares (considerados preços públicos ou TARIFA).");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(144L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A União não pode criar situação de isenção ao ICMS, por via indireta, ou seja, por meio de tratado ou convenção internacional que garanta ao produto estrangeiro a mesma tributação do similar nacional.");
            question.setComentario(" Errado.\nA União, personificada na figura do Presidente da República, ao firmar tratado internacional com outros países, representa a República Federativa do Brasil, ou seja, o complexo formado pela União, Estados, DF e Municípios, e não apenas o ente União. O decreto legislativo por meio do qual o Congresso Nacional ratifica o tratado internacional firmado pelo Presidente da República se dá pelo exercício de uma atividade de nível nacional, e não apenas federal. Não é correto afirmar que o Estado Federal estaria invadindo competência tributária dos Estados. No caso do ICMS, não é a União que está concedendo isenção, mas, na verdade, a República Federativa do Brasil, sendo apenas representada pela União. Assim, é perfeitamente possível a União, por meio de tratado internacional, conceder isenção de ICMS, garantindo ao produto estrangeiro a mesma tributação do similar nacional.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(145L);
            question.setTema("Direito Tributário");
            question.setEnunciado("É ilegítima a exigência de fazer incidir ICMS na comercialização de exemplares de obras cinematográficas, gravadas em fitas de videocassete.");
            question.setComentario(" Errado.\nTal incidência é legítima, pois, segundo a jusrisprudência do STF, a imunidade objetiva do art. 150, VI, d, CF/88, não abrange as obras cinematográficas. (STF, Súmula 662: É legitima a incidência de ICMS na comercialização de exemplares de obras cinematográficas, gravados em fita de videocassete).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(146L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A imunidade prevista no art. 150, VI, 'd', da Constituição Federal não abrange os filmes e papéis fotográficos necessários à publicação de jornais e periódicos, pelo que o ICMS é devido quando da entrada da referida mercadoria no estabelecimento do comprador.");
            question.setComentario(" Errado.\nA referida imunidade abrange os filmes e papéis fotográficos necessários à publicação de jornais e periódicos, segundo a súmula 657, do STF: “A imunidade prevista no art. 150, VI, d, da CF abrange os filmes e papéis fotográficos necessários à publicação de jornais e periódicos”.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(147L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A isenção heterônoma é, em regra, admitida pelo art. 151, III, da Constituição Federal.");
            question.setComentario(" Errado.\nO art. 151, III, CF/88, estipula que é vedado à União instituir isenções de tributos da competência dos Estados, do Distrito Federal e dos Municípios. Assim, fica vedada a isenção heterônoma – aquela concedida por ente diverso do competente para instituir o tributo.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(148L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A imunidade recíproca veda à União, aos estados, ao Distrito Federal e aos municípios a possibilidade de instituírem impostos sobre patrimônio, renda ou serviços, uns dos outros.");
            question.setComentario(" Correto.\nÉ a imunidade prevista no art. 150, VI, a, CF/88.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(149L);
            question.setTema("Direito Tributário");
            question.setEnunciado("No tocante à imunidade dos livros, jornais, periódicos e do papel destinado à sua impressão, estamos diante de uma imunidade objetiva, direcionada a estes bens, e não à editora ou empresa que os comercializa.");
            question.setComentario(" Correto.\nO que é imune é o objeto e não a pessoa, daí ser uma imunidade objetiva e não subjetiva. A imunidade objetiva contempla, exclusivamente, os veículos escritos de comunicação e informação, bem como o papel destinado a sua impressão; as editoras, autores e empresas jornalísticas continuam normalmente sujeitas à tributação pelas receitas e lucros auferidos, por exemplo.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(150L);
            question.setTema("Direito Tributário");
            question.setEnunciado("As instituições de educação ou assistência social, embora reconhecidamente imunes pela Constituição Federal, deverão obedecer a determinados requisitos legais para que possam fruir de tal benefício.");
            question.setComentario(" Correto.\nDevem atender aos requisitos dispostos em lei, segundo o art. 150, VI, c, CF/88. Atualmente, esses requisitos encontram-se dispostos no art. 14, CTN:\nI – não distribuírem qualquer parcela de seu patrimônio ou de suas rendas, a qualquer título;\nII - aplicarem integralmente, no País, os seus recursos na manutenção dos seus objetivos institucionais;\nIII - manterem escrituração de suas receitas e despesas em livros revestidos de formalidades capazes de assegurar sua exatidão.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(151L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Os princípios da anteiroridade e da estrita reserva legal não se aplicam aos impostos sobre: importação de produtos estrangeiros; exportação, para o exterior, de produtos nacionais ou nacionalizados; produtos industrializados; operações de crédito, câmbio e seguro, ou relativas a títulos ou valores mobiliários.");
            question.setComentario(" Correto.\nOs chamados impostos regulatórios – II, IE, IPI e IOF – são exceções aos princípios da anterioridade e da legalidade estrita.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(152L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Ainda que atendidas as condições e os limites estabelecidos em lei, é vedado ao Poder Executivo alterar as alíquotas do imposto sobre propriedade territorial rural.");
            question.setComentario(" Correto.\nA alteração de alíquotas dos impostos regulatórios (II, IE, IPI e IOF) é uma exceção ao princípio da legalidade, podendo ser feita diretamente por ato do Poder Executivo; o ITR, porém, não se inclui neste rol (art. 153, §3º, CF/88).");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(153L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Cabe aos Estados e ao Distrito Federal estabelecer hipótese de imunidade tributária em relação a fato que esteja sujeito à incidência do imposto sobre propriedade de veículos automotores.");
            question.setComentario(" Errado.\nSomente a Constituição Federal poderá instituir imunidades; os Estados e o DF, no máximo, podem instituir isenções dos tributos de sua competência.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(154L);
            question.setTema("Direito Tributário");
            question.setEnunciado("É vedado à União exigir o imposto sobre produtos industrializados antes de decorridos noventa dias da data de publicação da lei que o aumentar.");
            question.setComentario(" Correto.\nO IPI embora seja exceção à anterioridade e à legalidade, deve respeitar a noventena (art 150, §1º, CF/88).");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(155L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Podem ser instituídos impostos federais, estaduais ou municipais sobre o patrimônio, a renda e os serviços não relacionados com as finalidades essenciais dos partidos políticos e de suas fundações.");
            question.setComentario(" Correto.\nA imunidade só abrange o patrimônio, renda e serviços vinculados às finalidades essenciais (art. 150, VI, c, CF/88).");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(156L);
            question.setTema("Direito Tributário");
            question.setEnunciado("As fundações instituídas e mantidas pelo poder público não se incluem entre os contribuintes do ICMS.");
            question.setComentario(" Errado.\nA imunidade conferida pela Constituição Federal abrange apenas impostos sobre partimônio, renda e serviços. Como o ICMS é um imposto sobre a circulação de mercadorias (mais precisamente, um imposto sobre o consumo), não há o que se falar em imunidade (art. 150, VI, c, CF/88). Todavia, há que se salientar a posição do STF no sentido de que esse imunidade não é restrita aos impostos sobre o patrimônio, sobre a renda ou sobre serviços, mas toda a imposição tributária a título de impostos, que possa comprometer o patrimônio, a renda e os serviços da entidade imune.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(157L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A planta de valores dos imóveis, para efeitos de cobrança do Imposto Sobre Veículos Automotores - IPVA no exercício seguinte, deve ser publicada antes de 90 dias de findo o exercício financeiro em curso.");
            question.setComentario(" Errado.\nA planta de valores é instrumento publicado para determinar a base de cálculo para impostos como IPVA e IPTU. Segundo a CF/88, em seu art. 150, §1º, a fixação da base de cálculo tanto do IPVA quanto do IPTU não necessita respeitar o princípio da noventena.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(158L);
            question.setTema("Direito Tributário");
            question.setEnunciado("É vedado aos Municípios instituir taxas que recaiam sobre templos de qualquer culto.");
            question.setComentario(" Errado.\nPois a imunidade religiosa só abrange os impostos, e somente impostos sobre patrimônio, renda e serviços (art. 150, VI, b, CF/88).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(159L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Aos Municípios é conferida a competência para instituir imposto sobre imóveis urbanos de propriedade da União, dos Estados e do Distrito Federal, que se localizem em seus territórios.");
            question.setComentario(" Errado.\nEm relação ao IPTU, os entes políticos estão abrangidos pela imunidade recíproca (art. 150, VI, a, CF/88). Dessa forma, para o próprio bem do pacto federativo, municípios não podem, por exemplo, tributar com o IPTU os imóveis pertencentes à União, localizados em suas jurisdições.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(160L);
            question.setTema("Direito Tributário");
            question.setEnunciado("No tocante às imunidades tributárias conferidas às instituições de assistência social sem fins lucrativos: ainda quando alugado a terceiros, permanece imune ao IPTU o imóvel pertencente a tais instituições, desde que o valor dos aluguéis seja aplicado nas atividades essenciais de tais entidades.");
            question.setComentario(" Correto.\nAinda que alugado a terceiros, a imunidade ao IPTU subsiste nessas condições, desde que a renda auferida seja aplicada nos fins da entidade. Essa é a posição do STF.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(161L);
            question.setTema("Direito Tributário");
            question.setEnunciado("No tocante às imunidades tributárias conferidas às instituições de assistência social sem fins lucrativos: somente alcançam as entidades fechadas de previdência social privada se não houver contribuição dos beneficiários.");
            question.setComentario(" Correto.\nO STF, em sua súmula 730, determina que “a imunidade conferida a instituições de assistência social sem fins lucrativos pelo art. 150, VI, c, da CF, somente alcançará as entidades fechadas de previdência social se não houver contribuição dos beneficiários”; isso se deve ao fato de que as instituições de previdência que não cobram contribuição dos seus beneficiários nada mais são do que instituições assistenciais, pois concedem benefícios sem a devida contraprestação.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(162L);
            question.setTema("Direito Tributário");
            question.setEnunciado("No tocante às imunidades tributárias conferidas às instituições de assistência social sem fins lucrativos: não dispensa tais entidades do cumprimento de obrigações tributárias acessórias, como a de manterem escrituração de suas receitas e despesas em livros revestidos de formalidades capazes de assegurar sua exatidão.");
            question.setComentario(" Correto.\nA imunidade ocorre apenas em relação à obrigação principal. Em relação a obrigaçõea acessórias, devem atender aos requisitos dispostos em lei, segundo o art. 150, VI, c, CF/88. Atualmente, esses requisitos encontram-se dispostos no art. 14, CTN:\nI – não distribuírem qualquer parcela de seu patrimônio ou de suas rendas, a qualquer título;\nII - aplicarem integralmente, no País, os seus recursos na manutenção dos seus objetivos institucionais;\nIII - manterem escrituração de suas receitas e despesas em livros revestidos de formalidades capazes de assegurar sua exatidão.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(163L);
            question.setTema("Direito Tributário");
            question.setEnunciado("No tocante às imunidades tributárias conferidas às instituições de assistência social sem fins lucrativos: não excluem a atribuição, por lei, às instituições de assistência social, da condição de responsáveis pelos tributos que lhes caiba reter na fonte.");
            question.setComentario(" Correto.\nNada impede que uma pessoa imune possa ser responsável tributário. Ela não será contribuinte, mas poderá ficar responsável por reter importâncias de outros contribuintes, como, por exemplo, ao contratar trabalhadores autônomos para prestação de algum serviço.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(164L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A imunidade tributária conferida pela Constituição Federal a instituições de assistência social sem fins lucrativos somente alcança as entidades fechadas de previdência social privada se não houver contribuição dos beneficiários.");
            question.setComentario(" Correto.\nComo vimos, o STF, em sua súmula 730, determina que “a imunidade conferida a instituições de assistência social sem fins lucrativos pelo art. 150, VI, c, da CF, somente alcançará as entidades fechadas de previdência social se não houver contribuição dos beneficiários”; isso se deve ao fato de que as instituições de previdência que não cobram contribuição dos seus beneficiários nada mais são do que instituições assistenciais, pois concedem benefícios sem a devida contraprestação.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(165L);
            question.setTema("Direito Tributário");
            question.setEnunciado("É permitido à União exigir imposto sobre a renda auferida por Municípios que provenha de aluguel de imóveis a eles pertencentes.");
            question.setComentario(" Errado.\nA imunidade recíproca impede que a União tribute a renda dos Municípios (art. 150, VI, a, CF/88).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(166L);
            question.setTema("Direito Tributário");
            question.setEnunciado("O imóvel pertencente a entidade sindical de trabalhadores, ainda quando alugado a terceiros, permanece imune ao imposto sobre propriedade predial e territorial urbana (IPTU), desde que o valor dos aluguéis seja aplicado nas atividades essenciais de tal entidade.");
            question.setComentario(" Correto.\nDe acordo com o STF, a imunidade subsiste ainda que o imóvel esteja alugado, desde que a renda auferida seja revertida para as finalidades essenciais da entidade.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(167L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A cobrança de pedágio pela utilização de vias conservadas pelo poder público não constitui violação do dispositivo constitucional que veda o estabelecimento de limitações ao tráfego de pessoas ou bens por meio de tributos interestaduais ou intermunicipais.");
            question.setComentario(" Correto.\nAssim dispõe o art. 150, V, CF/88: “É vedado à União, Estados, Distrito Federal e Municípios estabelecer limitações ao tráfego de pessoas ou bens, por meio de tributos interestaduais ou intermunicipais, ressalvada a cobrança de pedágio pela utilização de vias conservadas pelo Poder Público”. Segundo a jurisprudência do STF, há que se diferenciar os pedágios operacionalizados pelo Poder Público (considerados tributos do tipo TAXA) e os operacionalizados pelas concessionárias particulares (considerados preços públicos ou TARIFA).");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(168L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A imunidade tributária conferida pelo art. 150, VI, c, da Constituição Federal às instituições de assistência social sem fins lucrativos alcança as entidades fechadas de previdência social que conferem benefícios aos seus filiados mediante o recolhimento das contribuições pactuadas.");
            question.setComentario(" Errado.\nPara que ocorra esta imunidade não pode haver recolhimento de contribuições dos filiados. É esse o entendimento do STF, na súmula 730.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(169L);
            question.setTema("Direito Tributário");
            question.setEnunciado("É legítima a cobrança de IPTU de lotes vagos e prédios comerciais de entidade religiosa.");
            question.setComentario(" Errado.\nO STF entende que, ainda que os lotes estejam vagos, as imunidades devem subsistir, pois não se pressupõe que os fins foram desvirtudados. Nesse sentido, impõe-se transcrever um acórdão de 2003 (RE 251772 / SP): \"O caráter benemérito da recorrida jamais foi questionado pelo recorrente, devendo-se presumir que todo seu patrimônio, bem como o produto de seus serviços está destinado ao cumprimento de seu mister estatutário. As instâncias ordinárias assentaram que os imóveis em questão encontram-se vagos, em razão de a recorrida ainda não ter arrecadado recursos suficientes para construir prédios destinados ao cumprimento de sua função institucional, descartando a hipótese de desvirtuamento de seus fins”.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(170L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Os filmes e papéis fotográficos necessários à publicação de jornais e periódicos são abrangidos por imunidade tributária.");
            question.setComentario(" Correto.\nÉ nesse sentido a posição so STF, já pacificada na súmula 657: “A imunidade prevista no art. 150, VI, d, CF/88 abrange os filmes e papéis fotográficos necessários à publicação de jornais e periódicos”.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(171L);
            question.setTema("Direito Tributário");
            question.setEnunciado("O campo de incidência do IPVA inclui embarcações e aeronaves.");
            question.setComentario(" Errado.\nSegundo a jurisprudência do STF (RE 134509 / AM), o campo de incidência do IPVA não inclui embarcações e aeronaves, apenas veículos automotores terrestres.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(172L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A identificação do efeito confiscatório não deve ser feita em função da totalidade da carga tributária, mas sim em cada tributo isoladamente.");
            question.setComentario(" Errado.\nNessa questão, mais uma vez a banca optou por seguir a linha mais concreta do STF, no lugar de opiniões controvertidas da doutrina. Esse é o entendimento esposado pelo STF, na ADI 2.010-2, ao estabelecer que o caráter confiscatório deve ser analisado levando-se em conta toda a carga tributária, de determinado ente, que recaia sobre o contribuinte.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(173L);
            question.setTema("Direito Tributário");
            question.setEnunciado("São imunes ao imposto sobre a renda e proventos de qualquer natureza, nos termos e limites fixados em lei, os rendimentos provenientes de aposentadoria e pensão, pagos pela previdência social da União, dos Estados, do Distrito Federal e dos Municípios, a pessoa com idade superior a sessenta e cinco anos, cuja renda total seja constituída, exclusivamente, de rendimentos do trabalho.");
            question.setComentario(" Errado.\nNão existe, na CF/88, a referida imunidade para o IR; isto é caso de isenção. Lembrando também que o que existe, apenas, é que os servidores inativos e pensionistas sujeitos a regime próprio de previdência (RPPS) só contribuem em relação ao valor do provento que passar do teto das aposentadorias do RGPS, isto é devido à isonomia aplicada ao art. 195, II da CF. (vide art. 40, §18, CF/88).");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(174L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Ainda quando alugado a terceiros, permanece imune ao imposto sobre propriedade predial e territorial urbana (IPTU) o imóvel pertencente a qualquer das entidades referidas pelo art. 150, VI, c, da Constituição (partidos políticos, inclusive suas fundações, entidades sindicais dos trabalhadores, instituições de educação e de assistência social, sem fins lucrativos), desde que o valor dos aluguéis seja aplicado nas atividades essenciais de tais entidades.");
            question.setComentario(" Correto.\nA imunidade subsiste ainda que o imóvel esteja alugado, desde que a renda auferida seja aplicada nas finalidades essenciais da entidade. Assim é o entendimento do STF.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(175L);
            question.setTema("Direito Tributário");
            question.setEnunciado("É vedado ao Município cobrar imposto sobre a propriedade predial e territorial urbana (IPTU) em relação a imóvel integrante do patrimônio de qualquer órgão da Administração Pública Federal ou Estadual.");
            question.setComentario(" Errado.\nA imunidade só alcança a administração pública direta, autárquica e fundacional, ainda sim, apenas no que se refere ao patrimônio, à renda e aos serviços, vinculados a suas finalidades essenciais (art. 150, §2º, CF/88). Dessa forma, as sociedades de economia mista e as empresas públicas, embora façam parte da administração pública (indireta), estarão sujeitas ao IPTU.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(176L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Quanto ao princípio da anterioridade, pode-se dizer que proíbe que se tributem fatos geradores que ocorreram antes do início da vigência da lei que houver instituído ou aumentado um tributo.");
            question.setComentario(" Errado.\nTrata-se do princípio da irretroatividade (art. 150, III, a, CF/88).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(177L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Quanto ao princípio da anterioridade, podese dizer que não se aplica ao Imposto de Importação, ao Imposto de Exportação, ao Imposto sobre Operações Financeiras e às Taxas decorrentes do exercício do poder de polícia");
            question.setComentario(" Errado.\nTal pricípio se aplica às taxas.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(178L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Quanto ao princípio da anterioridade, podese dizer que não se aplica ao Imposto sobre Produtos Industrializados, ao Imposto de Importação, ao Imposto sobre Operações Financeiras, ao Imposto de Exportação.");
            question.setComentario(" Correto.\nSão os impostos regulatórios (art. 153, §1º, CF/88).");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(179L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Quanto ao princípio da anterioridade, podese dizer que se aplica aos empréstimos compulsórios, qualquer que seja o pressuposto da sua instituição.");
            question.setComentario(" Errado.\nTemos como exceção à anterioridade o caso dos eventos imprevisíveis (guerra externa e calamidades), pressupostos para instituição do ECCG (art. 148, I, CF/88).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(180L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Quanto ao princípio da anterioridade, podese dizer que se aplica às contribuições para seguridade social da mesma forma que às outras espécies tributárias.");
            question.setComentario(" Errado.\nAs contribuições se sujeitam apenas à anterioridade nonagesimal (art. 195, §6º, CF/88).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(181L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A taxa é um tributo que não pode ter base de cálculo ou fato gerador idênticos aos que correspondam a imposto, nem ser calculada em função do capital das empresas.");
            question.setComentario(" Correto.\nQuestão que traz a literalidade do art. 77, §único, CTN.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(182L);
            question.setTema("Direito Tributário");
            question.setEnunciado("É competente para instituir e cobrar a taxa a pessoa política - União, Estado, Distrito Federal ou Município - legitimada para a realização da atividade que caracterize o fato gerador do tributo.");
            question.setComentario(" Correto.\nA Constituição estabeleceu a competência de cada um dos entes no que tange aos serviços públicos, assim, o ente público que prestar o tal serviço público poderá cobrar taxas por sua utilização, desde que se trate do exercício do poder de polícia ou de serviço específico e divisível, prestado ao contribuinte ou posto a sua disposição.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(183L);
            question.setTema("Direito Tributário");
            question.setEnunciado("As taxas poderão ser instituídas em razão do exercício do poder de polícia ou pela utilização, efetiva ou potencial, de serviços públicos específicos e divisíveis, prestados ou postos à disposição do contribuinte.");
            question.setComentario(" Correto.\nEssa é a definição das taxas dada pelo art. 145, II, CF/88.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(184L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Serviços públicos específicos são aqueles que podem ser destacados em unidades autônomas de intervenção, de utilidade ou de necessidade públicas.");
            question.setComentario(" Correto.\nLiteralidade do art. 79, II, CTN: específicos, quando intervenção, de unidade, ou de necessidades públicas.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(185L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Serviços públicos divisíveis são aqueles suscetíveis de utilização, separadamente, por parte de cada um dos seus usuários.");
            question.setComentario(" Correto.\nLiteralidade do art. 79, III, CTN: divisíveis, quando suscetíveis de utilização, separadamente, por parte de cada um dos seus usuários.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(186L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Os serviços gerais prestados por órgãos de Segurança Pública não podem ser sustentados por taxas. Essa atividade pública, por sua natureza, deve ser retribuída, genericamente, por impostos.");
            question.setComentario(" Correto.\nTaxas só podem ser usadas para retribuir serviços específicos e divisíveis, ou o uso regular de um poder de polícia. Em se tratando de serviços genéricos onde não se consegue identificar exatamente quem é o destinatário, é inconstitucional o uso da taxa.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(187L);
            question.setTema("Direito Tributário");
            question.setEnunciado("É constitucional a taxa municipal de conservação de estradas de rodagem que tem como base de cálculo a adotada para o imposto territorial rural.");
            question.setComentario(" Errado.\nSegundo o art. 145, §2º, CF/88, as taxas não podem ter base de cálculo própria dos impostos.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(188L);
            question.setTema("Direito Tributário");
            question.setEnunciado("É inconstitucional a taxa de fiscalização dos mercados de títulos e valores mobiliários instituída pela Lei n. 7.940, de 1989, haja vista não ser conferido, pelo ordenamento jurídico positivado, poder de polícia à Comissão de Valores Mobiliários.");
            question.setComentario(" Errado.\nDe acordo com o STF, súmula 665, “é constitucional a Taxa de Fiscalização dos Mercados de Títulos e Valores Mobiliários instituída pela Lei 7.940/89”.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(189L);
            question.setTema("Direito Tributário");
            question.setEnunciado("O serviço de iluminação pública, pela sua natureza jurídica, deve ser sempre remunerado mediante taxa.");
            question.setComentario(" Errado.\nO serviço de iluminação pública não pode ser remunerado por taxa (súmula 670 do STF), pois, não é um serviço público específico e divisível, requisitos essenciais para que um serviço seja remunerado por taxa. Em função disso, a EC 39/02 acrescentou o art. 149-A à CF/88, facultando aos Municípios e ao DF instituírem contribuição de iluminação pública, a fim de custearem esse serviço.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(190L);
            question.setTema("Direito Tributário");
            question.setEnunciado("É inconstitucional lei estadual que cria taxa destinando a arrecadação de seu produto aos serviços de fiscalização da atividade notarial e de registro a órgão público.");
            question.setComentario(" Errado.\nÉ constitucional. Trata-se de taxa pelo exercício de poder de políca. Sobre ela decidiu o STF em 2006, na ADI 3643/RJ: “É constitucional a destinação do produto da arrecadação da taxa de polícia sobre as atividades notariais e de registro, ora para tonificar a musculatura econômica desse ou daquele órgão do Poder Judiciário, ora para aportar recursos financeiros para a jurisdição em si mesma”. A vedação de destinação do produto da arrecadação se dá em relação aos impostos (art. 167, IV, CF/88).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(191L);
            question.setTema("Direito Tributário");
            question.setEnunciado("É admitida a cobrança cumulada de taxa de serviço de limpeza de logradouros públicos e de coleta domiciliar de lixo.");
            question.setComentario(" Errado.\nA jurisprudência do STF é pacífica nesse sentido(REAgR 362578 / RJ/2008): “É ilegítima a cobrança da Taxa de Coleta de Lixo e Limpeza Pública - TCLLP, porquanto não está vinculada apenas à coleta de lixo domiciliar, mas também a serviço de caráter universal e indivisível, como a limpeza de logradouros públicos.” Saliente-se que se a taxa fosse vinculada apenas à coleta domiciliar de lixo, seria perfeitamente possível. O problema encontra-se na limpeza dos logradouros públicos, pois essa atividade não se presta à especificidade prevista no art. 145, II, CF/88.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(192L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Para efeito de fato gerador e cobrança de taxa, considera-se regular o exercício do poder de polícia quando desempenhado por orgão competente, nos limites da lei aplicável, com observância do processo administrativo e, tratando-se de atividade que a lei tenha como vinculada, sem abuso ou desvio de poder.");
            question.setComentario(" Errado.\nO art. 78, CTN, traz o conceito de poder de polícia, e o seu §único dispõe de que forma podemos considerar esse exercício do poder de polícia como “regular”:\n“Art. 78. Considera-se poder de polícia atividade da administração pública que, limitando ou disciplinando direito, interesse ou liberdade, regula a prática de ato ou abstenção de fato, em razão de interesse público concernente à segurança, à higiene, à ordem, aos costumes, à disciplina da produção e do mercado, ao exercício de atividades econômicas dependentes de concessão ou autorização do Poder Público, à tranqüilidade pública ou ao respeito à propriedade e aos direitos individuais ou coletivos”.\n“§único. Considera-se regular o exercício do poder de polícia quando desempenhado pelo órgão competente nos limites da lei aplicável, com observância do processo legal e, tratando-se de atividade que a lei tenha como discricionária, sem abuso ou desvio de poder”.\nDesta forma, identificam-se dois erros na questão: o primeiro é que deve-se observar o processo legal e não o processo administrativo; e o segundo é que a atividade do poder de polícia, para que seja exercida sem abuso ou desvio de poder, é preciso que a atividade seja discricionária, e não vinculada.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(193L);
            question.setTema("Direito Tributário");
            question.setEnunciado("É condição, para que possa haver incidência da taxa de serviços, que o serviço seja suscetível de utilização, separadamente, por parte de cada um dos seus usuários.");
            question.setComentario(" Correto.\nEssa é a definição de serviço divisível. Além desse requisito, o art. 145, II, CF/88, também impõe a especificidade.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(194L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Tributo exigido em virtude de serviços públicos postos à disposição do contribuinte, mas não utilizados por ele, constitui taxa de serviço.");
            question.setComentario(" Correto.\nÉ o caso de serviço público potencial, em que embora não seja utilizado efetivamente pelo contribuinte, poderá ser cobrada a taxa por estar a disposição dele.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(195L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A autorização para que loja coloque anúncio luminoso na porta externa, concedida (a autorização) pela administração municipal, pode ensejar a cobrança, pelo Município, de uma taxa fundada no seu poder de polícia.");
            question.setComentario("Correta. Uma das hipóteses da taxa é o exercício regular do poder de polícia.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(196L);
            question.setTema("Direito Tributário");
            question.setEnunciado("As taxas poderão ter base de cálculo própria de impostos mas não de contribuição de melhoria.");
            question.setComentario(" Errado.\nAs taxas não podem ter bases de cálculo próprias dos impostos (art. 145, §2º, CF/88).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(197L);
            question.setTema("Direito Tributário");
            question.setEnunciado("As únicas pessoas políticas autorizadas a cobrar taxas, em razão do exercício do poder de polícia ou pela utilização, efetiva ou potencial, de serviços públicos específicos e divisíveis, prestados ao contribuinte ou postos a sua disposição, são os Estados e os Municípios.");
            question.setComentario(" Errado.\nTodos os entes políticos (União, Estados, DF e Municípios) podem cobrar taxas de acordo com as atribuições de cada um (art. 145, II, CF/88).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(198L);
            question.setTema("Direito Tributário");
            question.setEnunciado("As taxas são instituídas para suportar os custos da realização de obras públicas de que decorra a valorização imobiliária de particulares.");
            question.setComentario(" Errado.\nIsso é papel da contribuição de melhoria (art. 145, III, CF/88).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(199L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Os Municípios podem instituir taxas em razão do exercício do poder de polícia, com bases de cálculo diferentes das dos impostos.");
            question.setComentario(" Correto.\nPois, todos os entes podem instituir taxas, devendo elas terem base de cálculo diversa da dos impostos (art. 145, §2º, CF/88).");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(200L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Pode uma taxa de utilização de estradas ter por base de cálculo o valor de uma propriedade rural.");
            question.setComentario(" Errado.\nPois teria a mesma base de cálculo do ITR, o que é vedado pelo art. 145, §2º, CF/88.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(201L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Podemos afirmar que o fato gerador da taxa não é um fato do contribuinte, mas um fato do Estado; este exerce determinada atividade, e por isso cobra a taxa das pessoas que dela se aproveitam.");
            question.setComentario(" Correto.\nAs taxas, assim como as contribuições de melhoria, independem da atuação do contribuinte; elas têm seus fatos geradores a partir de uma atividade estatal, seja na prestação de serviços públicos específicos e divisíveis, seja no exercício regular do poder de polícia ou na execução de obra pública que acarrete valorização imobiliária para o contribuinte. Diferentemente, as demais espécies tributárias possuem como fatos geradores atividades ou situações próprias dos contribuintes, como, por exemplo: auferir renda; propriedade de imóvel urbano; importação de produtos estrangeiros etc.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(202L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A atuação estatal referível, que pode ensejar a cobrança de taxa, pode consistir no exercício regular do poder de polícia.");
            question.setComentario(" Correto.\nO exercício do poder de polícia, para que possa ensejar a cobrança de taxa, há de ser regular. O art. 78, §único, CTN, traz a definição do termo regular.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(203L);
            question.setTema("Direito Tributário");
            question.setEnunciado("As atividades gerais do Estado devem ser financiadas com os impostos, e não com as taxas.");
            question.setComentario(" Correto.\nO art. 167, IV, que veda a vinculação da receita de impostos, nada fala acerca das taxas. Estas, diferentemente daqueles, são tributos com finalidade específica que, consequentemente, irá determinar o destino do seu produto. Ainda que a lei instituidora da taxa não vincule expressamente o produto de sua arrecadação com a atividade que lhe dá fundamento, ela será presumida. O STF já pronunciou nesse sentido, ao determinar que “a vinculação das taxas judiciárias e dos emolumentos a entidades privadas ou mesmo a serviços públicos diversos daqueles a que tais recursos se destinam subverte a finalidade institucional do tributo” (ADI 2.040-4).");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(204L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A atuação estatal referível, que pode ensejar a cobrança de taxa, pode consistir na prestação ao contribuinte, ou na colocação à disposição deste, de serviço público específico, divisível ou não.");
            question.setComentario(" Errado.\nO serviço público, para que possa ensejar a cobrança de taxa, há de ser, necessariamente, específico e divisível (art. 145, II, CF/88).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(205L);
            question.setTema("Direito Tributário");
            question.setEnunciado("O poder de polícia, que enseja a cobrança de taxa, considera-se regular quando desempenhado pelo órgão competente e nos limites da lei aplicável, com observância do processo legal e, tratando-se de atividade que a lei tenha como discricionária, sem abuso ou desvio de poder.");
            question.setComentario(" Correto.\nÉ exatamente o que dispõe o art. 78, §único, CTN.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            //Parei na 206


            question = new Question();
            question.setId(206L);
            question.setTema("Direito Tributário");
            question.setEnunciado("As contribuições sociais decorrem da realização de obras públicas que promovam a valorização imobiliária privada.");
            question.setComentario(" Errado.\nSão as contribuições de melhoria, que nada têm a ver com contribuições sociais (art. 145, III, CF/88).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(207L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A obra pública de que resulte valorização de imóvel do particular pode ser custeada mediante a instituição e cobrança da contribuição de melhoria.");
            question.setComentario(" Correto.\nA valorização imobiliária é condição sine qua non para que haja a cobrança do referido tributo (art. 145, III, CF/88).");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(208L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A contribuição de melhoria, decorrente de obras públicas, poderá ser cobrada pelo ente executor da obra da qual os contribuintes tenham-se beneficiado, ou, no caso de omissão deste, pela União.");
            question.setComentario(" Errado.\nSó o ente executor da obra pode efetuar a cobrança; sua inércia não autoriza a cobrança por nenhum outro ente, nem mesmo pela União (art. 8º, CTN).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(209L);
            question.setTema("Direito Tributário");
            question.setEnunciado("É vedado aos Estados instituírem contribuição de melhoria.");
            question.setComentario(" Errado.\nTodos os entes podem instituir contribuição de melhoria (art. 145, III, CF/88).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(210L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Em caso de imóvel alugado, o locatário é responsável solidário pelo pagamento da contribuição de melhoria.");
            question.setComentario(" Errado.\nO contribuinte é o proprietário do imóvel e apenas quem adquirir o seu domínio é que poderá se tornar responsável pelo pagamento. É o proprietário do imóvel que se beneficiará da valorização imobiliária, logo nada mais justo do que ele sofra a justa exação.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(211L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A contribuição de melhoria tem como limite individual o acréscimo de valor que da obra resultar para o imóvel beneficiado.");
            question.setComentario(" Correto.\nA contribuição de melhoria possui dois limites (art. 81, CTN):\n\uF0A7 Limite geral: despesa realizada com a obra.\n\uF0A7 Limite individual: acréscimo do valor do imóvel obtido com a obra.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(212L);
            question.setTema("Direito Tributário");
            question.setEnunciado("O texto constitucional (art. 145, III) deixou de se referir expressamente à valorização imobiliária, ao cogitar de contribuição de melhoria. Com isso, o acréscimo do valor do imóvel localizado nas áreas beneficiadas direta ou indiretamente por obras públicas ainda figura como fato gerador da contribuição.");
            question.setComentario(" Correto.\nO art. 145, III, CF/88, limitou-se a dispor que poderá ser cobrada contribuição de melhoria decorrente de obras públicas; ou seja, disse menos do que deveria. Dada essa omissão, devemos recorrer ao art. 81, CTN, que prevê a necessidade desta valorização.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(213L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A contribuição de melhoria é o tributo cuja obrigação tem por fato gerador uma situação independente de qualquer atividade estatal específica, relativa ao contribuinte.");
            question.setComentario(" Errado.\nEsse tributo é o imposto. As contribuições de melhoria é o tributo cuja contraprestação estatal é mais evidente. Seu fato gerador está vinculado a uma obra pública de que decorra valorização impobiliária (art. 145, III, CF/88, c/c art. 81, CTN).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(214L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A contribuição de melhoria é o tributo cujo fundamento ético-jurídico é o não enriquecimento injusto.");
            question.setComentario(" Correto.\nPor isso a contribuição de melhoria só poderá ser cobrada a quando ocorrer valorização imobiliária decorrente de obra pública (art. 81, CTN). É o princípio do não enriquecimento injusto ou vedação do enriquecimento sem causa.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(215L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A contribuição de melhoria é instituída em face de obras públicas ou privadas, que valorizem ou depreciem o imóvel do administrado.");
            question.setComentario(" Errado.\nSó poderá ser instituída em face de obras públicas e se houver valorização do imóvel (art. 81, CTN).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(216L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A contribuição de melhoria é devida em função da prestação de serviços públicos divisíveis.");
            question.setComentario(" Errado.\nServiços públicos ensejam taxas. A contribuição de melhoria é devida por obras públicas.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(217L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A Constituição de 1988 não estabelece que o limite total da contribuição de melhoria seja o valor da despesa realizada pela obra pública que lhe deu causa.");
            question.setComentario(" Correto.\nSomente o CTN entrou nesse mérito (art. 81, CTN); a Constituição se limitou a dizer que a contribuição será devida em virtude de obras públicas (art. 145, III, CF/88).");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(218L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Se houver impugnação ao edital de notificação referente à contribuição de melhoria, fica suspenso o início ou prosseguimento das obras.");
            question.setComentario(" Errado.\nAs impugnações referentes ao tributo não tem efeito algum sobre o início ou prosseguimento da obra (art. 82, CTN).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(219L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Somente a União e os Estados podem instituir contribuições de melhoria.");
            question.setComentario(" Errado.\nTodos os entes podem instituir contribuição de melhoria (art. 145, III, CF/88).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(220L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Sempre que o Município realizar a construção de pontes e viadutos nasce para os proprietários dos imóveis que se situam nas áreas vizinhas a obrigação de pagar contribuição de melhoria.");
            question.setComentario(" Errado.\nÉ condição sine qua non para que haja a cobrança da contribuição de melhoria a valorização imobiliária decorrente de obra pública (art. 81, CTN).");
            question.setGabarito(R.id.e);
            lquestion.add(question);



            question = new Question();
            question.setId(221L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A contribuição de melhoria tem como limite individual o acréscimo de valor que da obra resultar para o imóvel beneficiado.");
            question.setComentario(" Correto.\nO art. 81, CTN, estabelece como limite total a despesa realizada e como limite individual o acréscimo de valor que da obra resultar para cada imóvel beneficiado.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(222L);
            question.setTema("Direito Tributário");
            question.setEnunciado("O lançamento da contribuição de melhoria só pode ser feito quando executada totalmente a obra pública que justifica sua cobrança.");
            question.setComentario(" Errado.\nEm regra, só se faz o lançamento após executada a obra em sua totalidade, porém, admite-se o lançamento no caso de já concluída parte suficiente para beneficiar determinados imóveis.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(223L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A instituição de empréstimos compulsórios só pode ser feita por lei complementar.");
            question.setComentario(" Correto.\nÉ o que dispõe o art. 148, caput, CF/88.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(224L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Os empréstimos compulsórios, espécie de tributo da competência da União, podem ser instituídos para atender a despesas extrordinárias decorrentes de calamidade pública.");
            question.setComentario(" Correto.\nEsta hipótese está prevista no art. 148, I, CF/88.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(225L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Os empréstimos compulsórios podem ser instituídos para o custeio de investimento público de caráter urgente.");
            question.setComentario(" Correto.\nEsta hipótese está prevista no art. 148, II, CF/88.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(226L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Em relação aos empréstimos compulsórios, é correto afirmar que é espécie de confisco, como ocorreu com a retenção dos saldos de depósitos a vista, cadernetas de poupança e outros ativos financeiros, por ocasião do chamado “Plano Collor” (Lei n. 8.024/90).");
            question.setComentario(" Errado.\nOs empréstimos compulsórios não são e nem podem ser espécie de confisco, por expressa vedação do art. 150, IV, CF/88. A retenção compulsória dos ativos financeiros, em cruzados novos, determinada pela Lei 8.024/90, com a promessa de restituição, nos prazos nela previstos, foi concebida com o intuito de ser Empréstimo Compulsório. Todavia, diversos julgados de TRF’s acabaram por declará-lo inconstitucional, com base nos seguintes fundamentos:\na) Não ter sido instituído por Lei Complementar;\nb) Não apresentar nenhuma das hipóteses autorizativas, previstas nos incisos I e II, do art. 148, CF/88; e\nc) Não respeitar o princípio da anterioridade tributária, previsto no art. 150, III, b, CF/88.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(227L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Em relação aos empréstimos compulsórios, a aplicação dos recursos provenientes da sua arrecadação será integralmente vinculada à despesa que tenha fundamentado a sua instituição.");
            question.setComentario(" Correto.\nÉ o que dispõe o art. 148, §único, CF/88.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(228L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Os empréstimos compulsórios poderão, ou não, sujeitar-se ao princípio constitucional da anterioridade (conforme a hipótese que tenha motivado a sua instituição).");
            question.setComentario(" Correto.\nExistem duas modalidades de empréstimos compúlsórios no art. 148, CF/88:\nI – imprevisível: Despesas extraordinárias, calamidade pública, guerra externa ou sua iminência;\nII – previsível: Investimento público de caráter urgente e de relevante interesse nacional.\nA hipótese do inciso I, por ser imprevisível, não se submete nem à anterioridade nem à noventena.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(229L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A aplicação dos recursos provenientes de empréstimos compulsórios será preferencialmente vinculada à despesa que fundamentou sua instituição.");
            question.setComentario(" Errado.\nO erro está no termo “preferencialmente”; o empréstimo compulsório, obrigatoriamente, deve ter o produto de sua arrecadacão vinculado à despesa que fundamentou sua instituição ( art. 148, §único, CF/88).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(230L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A União, somente, possui a competência para a instituição de duas diferentes modalidades de empréstimos compulsórios, sendo necessário, para ambas, a edição de lei complementar.");
            question.setComentario(" Correto.\nA ESAF considerou cada inciso do art. 148, CF/88, como sendo uma hipótese; mas na realidade temos 3 hipóteses:\n1) Despesas extraordinárias decorrentes de:\n    a. calamidade pública; e\n    b. Guerra externa ou sua iminência.\n2) Investimento público urgente e de relevante interesse nacional.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(231L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Os Estados e o Distrito Federal não têm competência para instituir empréstimo compulsório, ainda que se destine ao atendimento de despesas extraordinárias de caráter urgente que decorram de calamidade pública.");
            question.setComentario(" Correto.\nSó a União detém a competência para instituir empréstimos compulsórios (art. 148, caput, CF/88).");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(232L);
            question.setTema("Direito Tributário");
            question.setEnunciado("No Brasil, persiste controvérsia doutrinária sobre se, por meio de leis delegadas, podem ser instituídos tributos. A Constituição Federal, todavia, veda expressamente a utilização de tais normas jurídicas para a criação de empréstimos compulsórios.");
            question.setComentario(" Correto.\nO art. 68, CF/88, estabelece:\n“Art. 68 - As leis delegadas serão elaboradas pelo Presidente da República, que deverá solicitar a delegação ao Congresso Nacional.\n§ 1º - Não serão objeto de delegação (...) a matéria reservada à lei complementar(...)”\nAssim posto, fica fácil perceber que a CF/88 expressamente proibiu que Lei Delegada verse sobre empréstimo compulsório, que está no rol das matérias reservadas à Lei Complementar.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(233L);
            question.setTema("Direito Tributário");
            question.setEnunciado("No caso de investimento público de caráter urgente e de relevante interesse nacional, a União está autorizada a instituir empréstimo compulsório e cobrá-lo a partir do ano em que for publicada a lei complementar que o criar.");
            question.setComentario(" Errado.\nNo caso de empréstimo compulsório para investimento público de caráter urgente e de relevante interesse nacional, é necessário que se respeite a anterioridade, ou seja, só é possível iniciar a cobrança do tributo no exercício seguinte ao da publicação da lei (art. 148, II, c/c art. 150, III, b, CF/88).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(234L);
            question.setTema("Direito Tributário");
            question.setEnunciado("É permitida a edição de medida provisória para instituir empréstimo compulsório, no caso de comprovada necessidade de atendimento a despesas extraordinárias que decorram de calamidade pública ou de guerra externa.");
            question.setComentario(" Errado.\nPara instituir empréstimos compulsórios necessita-se de Lei Complementar, além do que o art. 62, CF/88, estabelece:\n“Art. 62 - Em caso de relevância e urgência, o Presidente da República poderá adotar medidas provisórias, com força de lei, devendo submetê-las de imediato ao Congresso Nacional. § 1º - É vedada a edição de medidas provisórias sobre matéria:\n(...)\nIII - reservada a lei complementar”.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(235L);
            question.setTema("Direito Tributário");
            question.setEnunciado("O empréstimo compulsório, no caso de investimento público de caráter urgente e de relevante interesse nacional, poderá ser instituído mediante lei ordinária, mas sua cobrança só poderá ocorrer no exercício financeiro subseqüente ao de publicação da lei que o instituir.");
            question.setComentario(" Errado.\nPrecisa-se de lei complementar. A segunda parte, entretanto, está correta, pois realmente só poderá ser cobrado no exercício seguinte (art. 148, II, CF/88).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(236L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A instituição de empréstimos compulsórios requer lei complementar da União, dos Estados ou do Distrito Federal, conforme competência que a Constituição confere a cada um desses entes da Federação.");
            question.setComentario(" Errado.\nSomente a União detém a competência para instituir empréstimos compulsórios (art. 148, caput, CF/88).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(237L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Um dos fundamentos possíveis do empréstimo compulsório é a calamidade pública.");
            question.setComentario(" Correto.\nÉ o que dispõe o art. 148, I, CF/88.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(238L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A simples iminência de guerra externa pode justificar a instituição de empréstimos compulsórios.");
            question.setComentario(" Correto.\nÉ o que dispõe o art. 148, I, CF/88. Saliente-se que as convulsões sociais internas não justificam a imposição de empréstimos compulsórios. O entrevero há ser externo.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(239L);
            question.setTema("Direito Tributário");
            question.setEnunciado("No caso de investimento público de relevante interesse nacional e de caráter urgente não se aplica o princípio da anterioridade.");
            question.setComentario(" Errado.\nDada a previsibilidade do investimento público, é plenamente justificável a observância do princípio da anteriordade (art. 148, II, CF/88).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(240L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Os recursos provenientes de empréstimo compulsório só podem ser aplicados para atender à despesa que tiver fundamentado a sua instituição.");
            question.setComentario(" Correto.\nÉ o que dispõe o art. 148, §único, CF/88. Saliente-se que eventual desvio do produto da arrecadação de empréstimo compulsório não afeta a validade da sua imposição, devendo, sim, desencadear a responsabilidade civil, penal e administrativa dos responsáveis.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(241L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Os empréstimos compulsórios, em todos os casos admitidos pela Constituição, poderão ser instituídos somente mediante lei complementar.");
            question.setComentario(" Correto.\nÉ o que dispõe o art. 148, I, CF/88.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(242L);
            question.setTema("Direito Tributário");
            question.setEnunciado("O empréstimo compulsórios é o tributo cuja obrigação tem por fato gerador uma situação independente de qualquer atividade estatal específica, relativa ao contribuinte.");
            question.setComentario(" Errado.\nEssa é a definição de “impostos”.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(243L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Para atender a despesas extraordinárias, decorrentes de calamidade pública, a União pode instituir imposto extraordinário.");
            question.setComentario(" Errado.\nImposto extraordinário só poderá ser instituído na hipótese de guerra externa ou sua iminência (art. 154, I, CF/88), sendo um tributo não restituível. No caso de calamidade pública, deve ser instituído empréstimo compulsório, que é um tributo restituível (art. 148, I, CF/88).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(244L);
            question.setTema("Direito Tributário");
            question.setEnunciado("O empréstimo compulsório não é uma espécie de tributo, não estando sujeito à exigência de prévia autorização orçamentária.");
            question.setComentario(" Errado.\nO empréstimo compulsório é tributo pois atende a todos os requisitos do art. 3º, CTN. Um pouco de história: Até 1965, o entendimento do STF, consolidado na súmula 418, era que o empréstimo compulsório não possuia natureza tributária:\n“O empréstimo compulsório não é tributo, e sua arrecadação não está sujeita à exigência constitucional da prévia autorização orçamentária”. Com a EC 18/65, todavia, tal instituto foi incluído no Sistema Tributário Nacional, restando, então, superado o entendimento esposado pelo STF à época.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(245L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Cabe à lei complementar definir as hipóteses excepcionais para instituição de empréstimos compulsórios.");
            question.setComentario(" Errado.\nNão existem hipóteses excepcionais para instituição de empréstimos compulsórios, apenas as previstas no art. 148, I e II, CF/88.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(246L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Aos empréstimos compulsórios aplicam-se as disposições constitucionais relativas aos tributos e às normas gerais de Direito Tributário.");
            question.setComentario(" Correto.\nO empréstimo compulsório é tributo e deve ser tratado como tal.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(247L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A competência para instituir empréstimos compulsórios é da União, podendo ser excepcionalmente atribuída ao Distrito Federal.");
            question.setComentario(" Errado.\nCompetência tributária segundo o art. 7º, CTN, é indelegável, e a Constituição atribuiu competência apenas à União para instituir empréstimos compulsórios.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(248L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Compete ao Senado Federal, mediante Resolução, aprovada pela maioria absoluta de seus membros: fixar as alíquotas máxima e mínima dos impostos sobre a importação e a exportação.");
            question.setComentario(" Errado.\nO Senado atua fixando alíquotas apenas em impostos estaduais (vide art. 155, §1º, IV; art 155, §2º, IV e V; e art. 155, §6º, I, CF/88) .");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(249L);
            question.setTema("Direito Tributário");
            question.setEnunciado("O Imposto sobre Importação de Produtos Estrangeiros tem fato gerador instantâneo.");
            question.setComentario(" Correto.\nO fato gerador é instantâneo pois ocorre no momento da entrada do produto no Território Nacional. É diferente do imposto de renda, que tem fato gerador complexo, ou seja, que incide ao longo de um período (no caso, o IR incide durante o ano) e não em um momento único.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(250L);
            question.setTema("Direito Tributário");
            question.setEnunciado("É na data do registro da declaração de importação de mercadoria submetida a despacho para consumo que se considera ocorrido o fato gerador do imposto de importação.");
            question.setComentario(" Correto.\nEste é o chamado momento do fato gerador, que, no caso do II, é considerado o momento do registro da “DI” (art. 23, DL 37/66)");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(251L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Como o CTN dispõe que, quando o valor tributário esteja expresso em moeda estrangeira, no lançamento far-se-á sua conversão em moeda nacional ao câmbio do dia da ocorrência do fato gerador da obrigação, para efeito de cálculo do imposto os valores expressos em moeda estrangeira deverão ser convertidos em moeda nacional à taxa de câmbio vigente na data da entrada do bem em águas territoriais nacionais.");
            question.setComentario(" Errado.\nRealmente a conversão em moeda nacional se faz no lançamento tributário, utilizando o câmbio do dia da ocorrência do fato gerador. A dúvida é saber o momento que se considera para efeito de ocorrência do fato gerador. Vimos que o DL 37/66 , a fim de simplificar o aspecto temporal do II, estabeleceu como data do fato gerador aquela em que se registrou a declaração de importação (DI). Em relação a outros impostos incidentes sobre produtos estrangeiros, como IPI e ICMS, o fato gerador dar-se-á no momento do desembaraço aduaneiro.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(252L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Segundo a legislação própria, considera-se estrangeira e, salvo disposição em contrário, pode, sobre ela, incidir o imposto de importação mercadoria nacional que retornar ao País.");
            question.setComentario(" Correto.\nO DL 37/66, em seu art. 1º, § 1º, dispõe que, para fins de incidência do imposto, considerar-se-á também estrangeira a mercadoria nacional ou nacionalizada exportada que retornar ao País. Todavia, o mesmo DL 37/66 também estabeleceu algumas exceções a esse retorno de mercadorias nacionais, que não serão consideradas estrangeiras, não incidindo, portando, o II. São as mercadorias:\na) enviadas em consignação e não vendida no prazo autorizado;\nb) devolvidas por motivo de defeito técnico, para reparo ou substituição;\nc) por motivo de modificações na sistemática de importação por parte do país importador;\nd) por motivo de guerra ou calamidade pública;\ne) por outros fatores alheios à vontade do exportador.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(253L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Segundo a legislação própria, considera-se estrangeira e, salvo disposição em contrário, pode, sobre ela, incidir o imposto de importação mercadoria restituída pelo importador estrangeiro, por motivo de modificações na sistemática de importação por parte do país importador.");
            question.setComentario(" Errado.\nA respota desta questão encontra-se no art. 1º, § 1º, c, DL 37/66, que dispõe que o retorno de mercadoria por motivo de mudança na sistemática de importação do país importador não se equipara à importação.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(254L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Segundo a legislação própria, considera-se estrangeira e, salvo disposição em contrário, pode, sobre ela, incidir o imposto de importação, mercadoria enviada em consignação e não vendida no exterior no prazo autorizado, quando retorna ao País.");
            question.setComentario(" Errado.\nTal hipótese, conforme o art. 1º, § 1º, a, DL 37/66, também não se equipara à importação.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(255L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Segundo a legislação própria, considera-se estrangeiro e, salvo disposição em contrário, pode, sobre ele, incidir o imposto de importação, produto devolvido do exterior por motivo de defeito técnico, para reparo ou substituição.");
            question.setComentario(" Errado.\nTal hipótese, conforme o art. 1º, § 1º, b, DL 37/66, também não se equipara à importação.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(256L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Segundo a legislação própria, considera-se estrangeiro e, salvo disposição em contrário, pode, sobre ele, incidir o imposto de importação, produto estrangeiro em trânsito aduaneiro de passagem acidentalmente destruído no País.");
            question.setComentario(" Errado.\nTambém não se considera tal hipótese como importação, pois a destruição acidental é motivo alheio à vontade do importador (art. 1º, § 1º, e, DL 37/66). O art 1º, § 4º, II, da mesma lei, também determina que o imposto não incidirá sobre mercadoria estrangeira “em trânsito aduaneiro de passagem, acidentalmente destruída”.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(257L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A alíquota incidente sobre as importações de mercadorias entradas em território nacional é definida pela norma vigente no momento em que se efetivou o registro da declaração apresentada pelo importador à repartição alfandegária competente.");
            question.setComentario(" Correto.\nOs elementos materiais do lançamento são definidos pela lei vigente à época do fato gerador do imposto. Como o fato gerador do II é o momento do registro da DI (declaração de importação), será este o momento que deverá ser considerado para fins de aplicação da lei (art. 23, DL 37/66).");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(258L);
            question.setTema("Direito Tributário");
            question.setEnunciado("O fato gerador do imposto de importação é a data da celebração, no Brasil ou no exterior, do contrato de compra e venda relativo aos produtos importados, ou, se conhecido, o instante em que são embarcadas as mercadorias adquiridas no estrangeiro.");
            question.setComentario(" Errado.\no FG do II ocorre no momento do registro da DI (art. 23, DL 37/66).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(259L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Haverá incidência do Imposto de Importação na devolução de dois aparelhos de ultrasonografia nacionalizados, por motivo de defeito técnico e que retornaram ao País para substituição.");
            question.setComentario(" Errado.\nO DL 37/66, em seu art. 1º, § 1º, dispõe que, para fins de incidência do imposto, considerar-se-á também estrangeira a mercadoria nacional ou nacionalizada exportada que retornar ao País. Todavia, o mesmo DL 37/66 também estabeleceu algumas exceções a esse retorno de mercadorias nacionais, que não serão consideradas estrangeiras, não incidindo, portando, o II. São as mercadorias:\na) enviadas em consignação e não vendida no prazo autorizado;\nb) devolvidas por motivo de defeito técnico, para reparo ou substituição;\nc) por motivo de modificações na sistemática de importação por parte do país importador;\nd) por motivo de guerra ou calamidade pública;\ne) por outros fatores alheios à vontade do exportador.\nAssim, por constar expressamente na alínea “b”, o retorno de aparelho por motivo de defeito para substituição não sofrerá a incidência do II.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(260L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Haverá incidência do Imposto de Importação no retorno ao País de veículo de fabricação nacional, adquirido no mercado interno, por empresa nacional de engenharia e exportado para execução de obra contratada no exterior.");
            question.setComentario(" Correto.\nNesta caso cairá na regra geral de que mercadoria nacional em retorno é considerada estrangeira (art. 1º, § 1º, DL 37/66).");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(261L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Haverá incidência do Imposto de Importação no retorno ao Brasil de peças de artesanato, sob a alegação de que não correspondia à amostra apresentada ao importador estrangeiro pelo representante da cooperativa de artesãos.");
            question.setComentario(" Errado.\nA mercadoria que retornar ao país por motivo de devolução se enquadrará na hipótese do art. 1º, § 1º, b, DL 37/66, não incidindo, portanto, o imposto.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(262L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Com relação ao imposto sobre importação de produtos estrangeiros, terá suas alíquotas graduadas de acordo com o grau de essencialidade do produto, de modo a se tributar com alíquotas mais elevadas os produtos considerados supérfluos, e com alíquotas inferiores os produtos tidos como essenciais.");
            question.setComentario(" Errado.\nNão há previsão, na CF/88, de aplicação da seletividade relativamente ao Imposto de Importação.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(263L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A base de cálculo do imposto sobre a importação de produtos estrangeiros, quando a alíquota seja específica, é o preço normal que o produto, ou seu similar, alcançaria, ao tempo da importação, em uma venda em condições de livre concorrência, para entrega no porto ou lugar de entrada do produto no País.");
            question.setComentario(" Errado.\nDe acordo com o art. 20, CTN, bem como o art. 1º, §4º, DL 37/66, o imposto de importação possui duas bases de cálculo:\na) Alíquota específica: quantidade de mercadoria, expressa na unidade de medida adotada pela lei tributária;\nb) Aíquota ad valorem: preço normal que o produto, ou seu similar, alcançaria, ao tempo da importação, em uma venda em condições de livre concorrência, para entrega no porto ou lugar de entrada do produto no país.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(264L);
            question.setTema("Direito Tributário");
            question.setEnunciado("É facultado ao Poder Executivo, nas condições e nos limites estabelecidos em lei, alterar as alíquotas ou as bases de cálculo do imposto sobre a importação de produtos estrangeiros.");
            question.setComentario(" Errado.\nEmbora ainda conste no CTN essa previsão de alteração da alíquota e base de cálculo por parte do Poder Executivo, a CF/88, em seu art. 153, 1º, faculta ao Poder Executivo apenas a alteração das alíquotas do imposto de importação.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(265L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A base de cálculo do imposto de importação quando a alíquota for ad-valorem, será o valor aduaneiro definido no artigo VII do Acordo Geral sobre Tarifas e Comércio (GATT), no qual o Brasil é parte.");
            question.setComentario(" Correto.\nA base de cálculo do imposto de importação quando a alíquota for ad valorem, prevista no art. 20, II, CTN, e art. 1º, §4º, DL 37/66, corresponde exatamente ao conceito de “valor aduaneiro”, definido pelo GATT, em seu artigo VII.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(266L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Segundo a Constituição, é possível ao Presidente da República, mediante decreto, e sem consulta ao Congresso Nacional, alterar as alíquotas do imposto de importação, do imposto de exportação e do imposto sobre produtos industrializados (IPI).");
            question.setComentario(" Correto.\nA alteração de alíquotas dos impostos regulatórios (II, IE, IPI e IOF) é uma exceção ao princípio da legalidade, podendo ser feita diretamente por ato do Poder Executivo (art. 153, §1º, CF/88).");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(267L);
            question.setTema("Direito Tributário");
            question.setEnunciado("O pagamento do Imposto de Exportação será realizado na forma e momento fixados pelo Ministro da Fazenda, que poderá determinar sua exigibilidade antes da efetiva saída do território aduaneiro da mercadoria a ser exportada.");
            question.setComentario(" Correto.\nÉ a literalidade do disposto no art. 4º, DL 1.578/77, que regulamenta o imposto de exportação.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(268L);
            question.setTema("Direito Tributário");
            question.setEnunciado("O Imposto de Exportação incide sobre mercadorias nacionais ou nacionalizadas, relacionadas pela CAMEX.");
            question.setComentario(" Correto.\nO imposto de exportação tem seu campo de incidência muito restrito, incidindo apenas sobre as mercadorias nacionais ou nacionalizadas arroladas pela CAMEX. Ele possui uma finalidade extrafiscal; geralmente é usado com o objetivo de evitar desabastecimento interno de alguma mercadoria ou como inibidor da circulação de bens não-meritórios.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(269L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Com relação ao imposto sobre importação de produtos estrangeiros, somente se deve considerar entrada e importada aquela mercadoria estrangeira que ingressa no território nacional para uso comercial ou industrial e consumo, não aquela em trânsito, destinada a outro país.");
            question.setComentario(" Correto.\nMercadoria em trânsito no Brasil não se considera importada; apenas está de passagem, com destino a outro país. Ainda que venha a ser destruída nessa passagem, mesmo assim não haverá incidência do imposto de importação, por expressa determinação do art. 1º, §4º, II, DL 37/66.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(270L);
            question.setTema("Direito Tributário");
            question.setEnunciado("É vedado ao Poder Executivo Federal aumentar, por meio de alteração de alíquotas, imposto sobre operações relativas a valores mobiliários.");
            question.setComentario(" Errado.\nOs impostos ditos regulatórios – II, IE, IPI e IOF – poderão, sim, ter suas alíquotas alteradas mediante ato do Poder Executivo (art. 153, §1º, CF/88).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(271L);
            question.setTema("Direito Tributário");
            question.setEnunciado("O IOF deve ter a característica de não-cumulatividade, podendo ser seletivo em função de critério de essencialidade.");
            question.setComentario(" Errado.\nO imposto que possui essas características é o ICMS (art. 155, §2 º, I e III, CF/88). Atenção: o ICMS “poderá” ser seletivo; já o IPI “será” obrigatoriamente seletivo (art. 153, §2º, I, CF/88).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(272L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Ainda que atendidas as condições e os limites estabelecidos em lei, é vedado ao Poder Executivo alterar as alíquotas do imposto sobre operações de crédito, câmbio e seguro, ou relativas a títulos ou valores mobiliários.");
            question.setComentario(" Errado.\nA alteração de alíquotas dos impostos regulatórios (II, IE, IPI e IOF) é uma exceção ao princípio da legalidade, podendo ser feita diretamente por ato do Poder Executivo (art. 153, §1º, CF/88).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(273L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Nos termos do Código Tributário Nacional, constitui base de cálculo do IOF, quanto às operações de seguro, o montante do valor contratado que a seguradora deverá pagar ao segurado na hipótese de ocorrência de sinistro.");
            question.setComentario(" Errado.\nA base de cálculo do IOF, relativamente às operações de seguro, será o montante do prêmio (art. 64, IV, CTN).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(274L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Nos termos do Código Tributário Nacional, constitui base de cálculo do IOF, quanto às operações relativas a títulos e valores mobiliários, na emissão, o valor nominal do título menos o deságio, se houver.");
            question.setComentario(" Errado.\nSegundo o art. 64, IV, a, CTN, a base de cálculo do IOF, relativamente às operações relativas a títulos e valores mobiliário (mercado financeiro) será o valor nominal mais o ÁGIO, se houver.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(275L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Nos termos do Código Tributário Nacional, constitui base de cálculo do IOF, quanto às operações relativas a títulos e valores mobiliários, na transmissão, o preço ou o valor nominal, ou o valor da cotação em Bolsa, conforme determinar decreto do Poder Executivo.");
            question.setComentario(" Errado.\nSegundo o art. 64, IV, b, CTN, a base de cálculo será o preço ou o valor nominal, ou o valor da cotação em Bolsa, como determinar “a lei”, e não o Poder Executivo.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(276L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Operações de câmbio são negócios jurídicos de compra e venda de moeda estrangeira ou nacional, ou, ainda, os negócios jurídicos consistentes na entrega de uma determinada moeda a alguém em contrapartida de outra moeda recebida.");
            question.setComentario(" Correto.\nÉ exatamente o que dispõe o art. 63, II, CTN.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(277L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Nos termos do Código Tributário Nacional, constitui base de cálculo do IOF, quanto às operações de crédito, o montante da obrigação, exclusive os juros.");
            question.setComentario(" Errado.\nSegundo o art. 64, I, CTN, a base de cálculo será o montante da obrigação, compreendendo o principal e os juros.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(278L);
            question.setTema("Direito Tributário");
            question.setEnunciado("O ouro, quando definido em lei como ativo financeiro ou ativo cambial, sujeita-se apenas a um imposto de competência da União, devido na operação de origem.");
            question.setComentario(" Correto.\nO ouro como mercadoria sujeita-se ao ICMS, porém, se ele for utilizado como ativo financeiro ou instrumento cambial nenhum outro IMPOSTO poderá incidir sobre ele que não seja o IOF de competência da União. Veja que nada impede que incida contribuição; a vedação é apenas para outros impostos (art. 153, §5º, CF/88).");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(279L);
            question.setTema("Direito Tributário");
            question.setEnunciado("O imposto sobre grandes fortunas, de competência da União, pode ser instituído nos termos de lei ordinária, a exemplo do que ocorre, em regra, com os demais impostos.");
            question.setComentario(" Errado.\nSegundo o art. 153, VII, CF/88, o imposto sobre grandes fortunas será instituído nos termos de lei complementar, e não lei ordinária. Muitos autores defendem que a lei complementar não será a instituidora do IGF, devendo apenas prever seus termos. A ESAF, entretanto, adota a outra corrente, para a qual o IGF deve ser instituído mediante lei complementar.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(280L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A instituição do Imposto sobre grandes fortunas dependerá de lei complementar e de resolução do Senado, fixando as alíquotas mínima e máxima.");
            question.setComentario(" Errado.\nDepende somente de lei complementar. Lembramos que resolução do Senado fixando alíquotas só ocorre para os impostos estaduais.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(281L);
            question.setTema("Direito Tributário");
            question.setEnunciado("O imposto sobre produtos industrializados - IPI está sujeito ao princípio da nãocumulatividade, em função da essencialidade do produto.");
            question.setComentario(" Errado.\nA não-cumulatividade significa compensar nas operações futuras aquilo que já se pagou anteriormente. A essencialidade dos produtos embasa outra característica do IPI, que é a seletividade, segundo a qual quanto mais essencial for uma mercadoria, menor será a sua alíquota; é esse princípio que tributa os produtos tidos como supérfluos com uma carga tributária maior que os produtos tidos como essenciais ou de primeira necessidade. É importante destacar que, em relação ao IPI, a seletividade “será” aplicada (é uma obrigação); já em relação ao ICMS, a seletividade “poderá” ser aplicada (é uma faculdade).");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(282L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A legislação do IPI esclarece que o fato gerador desse imposto (sobre produtos industrializados) é o desembaraço aduaneiro, quando de procedência estrangeira, considerando-se ocorrido esse desembaraço relativamente à mercadoria que constar como tendo sido importada e cujo extravio seja verificado pela autoridade fiscal.");
            question.setComentario(" Correto.\nPerceba um detalhe importante: Enquanto o fato gerador do II é definido como sendo a “entrada” no país, o fato gerador do IPI é o próprio desembaraço aduaneiro.");
            question.setGabarito(R.id.c);
            lquestion.add(question);



            question = new Question();
            question.setId(283L);
            question.setTema("Direito Tributário");
            question.setEnunciado("O princípio constitucional da seletividade é aplicado obrigatoriamente ao Imposto Sobre Produtos industrializados.");
            question.setComentario(" Correto.\nÉ importante nortarmos que enquanto o IPI DEVE ser seletivo, o ICMS PODE ser seletivo, mas não há obrigatoriedade para este.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(284L);
            question.setTema("Direito Tributário");
            question.setEnunciado("O campo de incidência do Imposto sobre Produtos Industrializados abrange todos os produtos relacionados na TIPI, com alíquota, mesmo os com alíquota zero.");
            question.setComentario(" Correto.\nAlíquota zero é hipótese de incídência tributária, mas nada se paga devido a alíquota estar zerada; a incidência existe, mas não haverá ônus para o contribuinte.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(285L);
            question.setTema("Direito Tributário");
            question.setEnunciado("O campo de incidência do Imposto sobre Produtos Industrializados abrange todos os produtos relacionados na TIPI.");
            question.setComentario(" Errado.\nExistem tributos relacionados na TIPI que possuem a sigla “NT” – não tributável – assim, somente os tributos com alíquota, ainda que esta seja “zero”, é que sofrerão a incidência do imposto.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(286L);
            question.setTema("Direito Tributário");
            question.setEnunciado("O Imposto sobre Produtos Industrializados (IPI), de competência da União, constitui exceção ao princípio da legalidade, eis que é facultado ao Poder Executivo, atendidas as condições e os limites da lei, alterar suas alíquotas.");
            question.setComentario(" Correto.\nEle pertence ao grupo dos chamados “impostos regulatórios” – II, IE, IPI e IOF (art. 153, §1º, CF/88).");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(287L);
            question.setTema("Direito Tributário");
            question.setEnunciado("O Imposto sobre Produtos Industrializados (IPI), de competência da União, poderá incidir sobre produtos industrializados destinados ao exterior.");
            question.setComentario(" Errado.\nTrata-se de imunidade tributária conferida pela Constituição Federal em seu art. 153, §3º, III.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(288L);
            question.setTema("Direito Tributário");
            question.setEnunciado("O Imposto sobre Produtos Industrializados (IPI), de competência da União, terá reduzido seu impacto sobre a aquisição de bens de capital pelo contribuinte do imposto, mediante ato do Poder Executivo.");
            question.setComentario(" Errado.\nO IPI realmente terá o seu impacto reduzido sobre a aquisição de bens de capital, porém será na forma da lei, e não mediante ato do Poder Executivo. É o que dispõe o art. 153, §3º, IV, CF/88.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(289L);
            question.setTema("Direito Tributário");
            question.setEnunciado("O Imposto sobre Produtos Industrializados (IPI), de competência da União, poderá ser seletivo, em função da essencialidade do produto.");
            question.setComentario(" Errado.\nEle será seletivo (art. 153, §3º, I, CF/88), ou seja, trata-se de uma norma impositiva.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(290L);
            question.setTema("Direito Tributário");
            question.setEnunciado("O Imposto sobre Produtos Industrializados (IPI), de competência da União, poderá ser não-cumulativo, compensando-se o que for devido em cada operação com o montante cobrado nas anteriores.");
            question.setComentario(" Errado.\nEle será não-cumulativo (art. 153, 3º, II, CF/88).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(291L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A União pode exigir o imposto sobre produtos industrializados antes de decorridos noventa dias da data de publicação da lei que o majorar.");
            question.setComentario(" Errado.\nO IPI, embora seja exceção à anterioridade e à legalidade, deve respeitar a noventena (art 150, §1º e art 153, §1º, CF/88).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(292L);
            question.setTema("Direito Tributário");
            question.setEnunciado("O Imposto sobre Produtos Industrializados não incide sobre produtos industrializados destinados ao exterior, excluídos os semi-industrializados definidos em lei complementar.");
            question.setComentario(" Errado.\nEm se tratando de exportação, sempre ocorre imunidade ao IPI, não se admitindo quaisquer ressalvas (art. 153, §3º, III, CF/88).");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(293L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Para ser caracterizado como tal, o estabelecimento industrial deve exercer uma, ou mais, das operações a seguir: transformação, beneficiamento, montagem, acondicionamento ou recondicionamento e renovação ou restauração, e que destas operações resulte produto tributado, ainda que de alíquota zero.");
            question.setComentario(" Correto.\nEsta é a definição de estabelecimento industrial segundo o art. 8º, do Regulamento do IPI – RIPI.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(294L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Os encargos cambiais pagos pelo importador ou dele exigíveis não se incluem na base de cálculo do imposto sobre produtos industrializados, no caso de importação de produto de procedência estrangeira.");
            question.setComentario(" Errado.\nDe acordo com o art. 47, I, c, CTN, os encargos cambiais pagos pelo importador incluem-se na base de cálculo do IPI.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(295L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A base de cálculo do imposto sobre produtos industrializados, em se tratando de produto de procedência estrangeira apreendido ou abandonado e levado a leilão, é o preço da arrematação, acrescido do valor dos demais tributos exigíveis na importação regular do produto.");
            question.setComentario(" Errado.\nO art. 47, III, CTN, define como a base de cálculo do IPI, neste caso, apenas o preço de arrematação.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(296L);
            question.setTema("Direito Tributário");
            question.setEnunciado("O imposto de importação não integra a base de cálculo do imposto sobre produtos industrializados, no caso de importação de produto de procedência estrangeira.");
            question.setComentario(" Errado.\nO II é considerado na base de cálculo do IPI, de acordo com o art. 47, I, a, CTN.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(297L);
            question.setTema("Direito Tributário");
            question.setEnunciado("A Lei diz que o imposto sobre produtos industrializados (IPI) incide sobre produtos industrializados estrangeiros.");
            question.setComentario(" Correto.\nNão importa a procedência do produto para fins de incidência do IPI na importação; só existe imunidade na exportação.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(298L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Uma das alternativas da pessoa jurídica produtora e exportadora de mercadorias nacionais para o exterior é determinar o valor do crédito presumido do Imposto sobre Produtos Industrializados (IPI), como ressarcimento relativo às contribuições para os Programas de Integração Social e de Formação do Patrimônio do Servidor Público (PIS/PASEP) e para a Seguridade Social (COFINS).");
            question.setComentario(" Correto.\nTrata-se do crédito presumido do IPI que é autorizado pela lei 9363/96.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(299L);
            question.setTema("Direito Tributário");
            question.setEnunciado("Considerando a publicação de norma, em 15 de dezembro de 2009, visando à majoração de tributo, sem disposição expressa sobre a data de vigência, tratando-se de imposto sobre produtos industrializados, poderá ser expedido decreto presidencial, produzindo efeitos financeiros a partir de sua publicação.");
            question.setComentario(" Errado.\nO IPI respeita a anterioridade mínina ou nonagesimal, mas é uma das exceções à anterioridade geral, nos termos do art. 150, §1º, CF/88. Ou seja, no caso da questão, a majoração só produzirá efeitos a partir de 15 de Março de 2010. O IPI também constitui uma das exceções à legalidade tributária, podendo sua alíquota ser alterada por ato do Poder Executivo, conforme prevê o art. 153, §1º, CF/88.");
            question.setGabarito(R.id.e);
            lquestion.add(question);


            question = new Question();
            question.setId(300L);
            question.setTema("Direito Tributário");
            question.setEnunciado("O campo de incidência do IPI abrange os produtos com alíquota zero.");
            question.setComentario(" Correto.\nAlíquota zero é hipótese de incídência tributária, mas nada se paga devido a alíquota estar zerada; a incidência existe, mas não haverá ônus para o contribuinte.");
            question.setGabarito(R.id.c);
            lquestion.add(question);


            question = new Question();
            question.setId(301L);
            question.setTema("Direito Tributário");
            question.setEnunciado("O IPI deverá, obrigatoriamente, ter as características de seletividade, em função da essencialidade e de não-cumulatividade.");
            question.setComentario(" Correto.\nPara o IPI essas duas características são obrigatórias (art. 153, §3º, I e II, CF/88).");
            question.setGabarito(R.id.c);
            lquestion.add(question);
        }
        return lquestion;
    }
}