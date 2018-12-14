package com.preparaxcursos.direitocomentado.ListViews;

import com.preparaxcursos.direitocomentado.Models.Question;
import com.preparaxcursos.direitocomentado.R;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Moises on 05/03/17.
 */

public class LConst {
    private static List<Question> lquestion = new ArrayList<>();

    public static List<Question> getLquestion() {
        if (lquestion.isEmpty()) {
            Question question = new Question();
            question.setId(1L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("Somente o Poder Judiciário tem competência constitucional para julgar autoridades da República por crimes de responsabilidade. ");
            question.setComentario("Errado\nAlgumas autoridades, principalmente aquelas da mais alta cúpula, serão julgadas pelo Senado, como é o caso do Presidente da República, Ministros do STF, PGR entre outros. ");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("O procurador-geral da República deve ser ouvido previamente em todos os processos de competência do Supremo Tribunal, salvo naquele em que tiver sido o autor. ");
            question.setComentario("Errado\nSegundo o art. 103 § 1º da Constituição, o Procurador- Geral da República deverá ser previamente ouvido nas ações de inconstitucionalidade e em todos os processos de competência do Supremo Tribunal Federal. Assim, o PGR tem assento para oficiar junto ao supremo e deve ser ouvido em todos os processos, sem haver qualquer ressalva por parte da Constituição Federal, nem da LC 75/93 e nem do Regimento Interno do STF. ");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(3L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("No Brasil, a jurisdição constitucional concentrada é reconhecida a todos os componentes do Poder Judiciário e pode se dar mediante iniciativa popular. ");
            question.setComentario("Errado\nO controle concentrado é exercido somente no STF (quando seja em face da Constituição Federal) ou no TJ (quando exercido face a Constituição Estadual). O controle concentrado também não poderá ocorrer através de iniciativa popular, já que existem legitimados próprios para tal, arrolados no art. 103 da CF e de forma simétrica para os Estados/DF. ");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(4L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("Nas ações declaratórias de constitucionalidade, é obrigatória a atuação do Advogado-Geral da União no processo como curador da presunção de constitucionalidade da lei. ");
            question.setComentario("Errado\nEle será chamado apenas no caso de apreciação da inconstitucionalidade, pois deverá defender o dispositivo impugnado. ");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(5L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("Nas ações diretas de inconstitucionalidade, o autor deverá demonstrar a repercussão geral da questão discutida no caso, a fim de que o Tribunal examine a admissão da ação. ");
            question.setComentario("Errado\nIsto só é necessário no Recurso Extraordinário (CF, art.102, § 3º), não se aplica às ações diretas. ");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(6L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("O requerente não pode desistir da ação direta de inconstitucionalidade que haja proposto. ");
            question.setComentario("Correto\nSegundo a lei 9868/99, proposta a ação não se admitirá desistência ");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(7L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("Não há possibilidade de ser conhecida pelo Supremo Tribunal Federal uma ação direta de inconstitucionalidade na qual se discute a constitucionalidade de um decreto. ");
            question.setComentario("Errado\nRealmente, em regra, não se admite inconstitucionalidade de decretos, pois estes contrariam a Constituição somente de forma indireta, reflexa, ou seja, antes de serem considerados inconstitucionais, na verdade são ilegais, pois estão indo contra uma lei a qual eles regulamentam. Porém, no caso de decreto autônomo (CF, art. 84 VI) poderá ocorrer a arguição através de ADI, pois, este tipo de decreto retira sua competência diretamente da Constituição e não de uma lei, sendo assim considerado norma primária. ");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(8L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("O Presidente da República tem legitimidade para propor ação direta de inconstitucionalidade e ação declaratória de constitucionalidade. ");
            question.setComentario("Correto\nEle é legitimado pelo art. 103 da Constituição. ");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(9L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("A vedação aos membros do Ministério Público de exercerem atividade político-partidária admite exceções previstas em lei. ");
            question.setComentario("Errado\nEssa vedação foi incluída pela EC 45/04 e não admite exceções. ");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(10L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("Se o Ministério Público não encaminhar a respectiva proposta orçamentária dentro do prazo estabelecido na lei de diretrizes orçamentárias (LDO), o Poder Executivo considerará, para fins de consolidação da proposta orçamentária anual, os valores aprovados na lei orçamentária vigente, ajustados de acordo com os limites estipulados na LDO. ");
            question.setComentario("Correto\nIsso é o que acontece para todos os órgãos. Anualmente, deve-se encaminhar a proposta para o Executivo, senão encaminhá-la o Executivo irá considerar como proposta o orçamento vigente, ajustados conforme a LDO (CF, art. 127 §4º). ");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(11L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("A limitação do poder estatal foi um dos grandes desideratos do liberalismo, o qual exalta a garantia dos direitos do homem como razão de ser do Estado.");
            question.setComentario("Correto\nO pensamento liberal remonta o fim do século XVIII, quando tivemos a Revolução Francesa e a Independência dos Estados Unidos. Segundo os conceitos do liberalismo, o homem é naturalmente livre, então, buscou-se limitar-se o poder de atuação dos Estados para dotar de maior força a autonomia privada e deixar o Estado apenas como força de harmonização e consecução dos direitos. ");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(12L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("Carl Schmitt, principal protagonista da corrente doutrinária conhecida como decisionista, advertia que não há Estado sem Constituição, isso porque toda sociedade politicamente organizada contém uma estrutura mínima, por rudimentar que seja; por isso, o legado da Modernidade não é a Constituição real e efetiva, mas as Constituições escritas.");
            question.setComentario("Errado\nCarl Schmitt era defensor da corrente decisionista, porém, a Constituição escrita não era importante para ele, pois estava preocupado apenas com o conteúdo das normas.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(13L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("Carl Schmitt, principal protagonista da corrente doutrinária conhecida como decisionista, advertia que não há Estado sem Constituição, isso porque toda sociedade politicamente organizada contém uma estrutura mínima, por rudimentar que seja; por isso, o legado da Modernidade não é a Constituição real e efetiva, mas as Constituições escritas.");
            question.setComentario("Errado\nCarl Schmitt era defensor da corrente decisionista, porém, a Constituição escrita não era importante para ele, pois estava preocupado apenas com o conteúdo das normas.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(14L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("A Constituição Federal de 1988 é costumeira, rígida e analítica");
            question.setComentario("Errado\nRealmente ela é rígida e analítica, mas não é costumeira e sim dogmática, já que se manifesta através de um documento escrito, que traduz a realidade presente em um determinado momento da sociedade e não algo que foi lentamente consolidado.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(15L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("Segundo a doutrina, não há relação entre a rigidez constitucional e o princípio da supremacia da constituição.");
            question.setComentario("Errado\nO princípio da supremacia da Constituição decorre diretamente da rigidez constitucional, já que somente uma Constituição rígida é capaz de se impor às demais normas");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(16L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("O Poder Constituinte Originário é ilimitado e autônomo, pois é a base da ordem jurídica.");
            question.setComentario("Errado\nErrou-se na definição das características. O PCO é ilimitado e autônomo pois não sofre limitação alguma para seu exercício. O fato se ser a base da ordem jurídica está relacionado com a sua característica de ser inicial.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(17L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("Do poder constituinte dos Estados-membros é possível dizer que é inicial, limitado e condicionado.");
            question.setComentario("Errado\nTrata-se de um poder decorrente, ou seja, não é inicial. Ele é instituído no art. 25 da Constituição e no art. 11 ADCT.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(18L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("São constitucionais as normas que dizem respeito aos limites, e atribuições respectivas dos poderes políticos, e aos direitos fundamentais. As demais disposições que estejam na Constituição podem ser alteradas pelo quórum exigido para a aprovação das leis ordinárias.");
            question.setComentario("Errado\nSe ocorresse o descrito no enunciado, teríamos uma constituição semi-rígida. A nossa constituição é totalmente rígida, não havendo qualquer distinção ou hierarquia entre normas constitucionais, independente do conteúdo que elas veiculam. Trata-se da visão jurídica que olha apenas para o aspecto formal da Constituição, não se importando com o aspecto material.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(19L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("Numa Constituição classificada como dirigente, não se encontram normas programáticas.");
            question.setComentario("Errado\nSegundo a doutrina, a Constituição dirigente é justamente aquela que possui normas programáticas, estabelecendo assim um plano de ação para o governo.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(20L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("Somente o Supremo Tribunal Federal – STF está juridicamente autorizado para interpretar a Constituição.");
            question.setComentario("Errado\nA interpretação constitucional é o entendimento sobre as normas constitucionais manifestado pelos membros do Poder Judiciário ao resolverem os casos que chegam até eles. Qualquer juiz pode interpretar a Constituição. Embora o STF seja o responsável constitucional pela 'guarda' da Constituição, a competência que é reservada unicamente ao STF é apenas a de julgar as ações diretas do controle de constitutcionalidade, mas a interpretação da Constituição não está restrita a este órgão.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(21L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("O método de interpretação hermenêutico-concretizador prescinde de uma pré-compreensão da norma a ser interpretada.");
            question.setComentario(" Errado.\nSegundo a doutrina, no método hermenêuticoconcretizador parte-se da pré-compreensão da norma abstrata e tenta-se imaginar a situação concreta. Agora temos a “primazia da norma sobre o problema”. Desta forma, ele pressupõe uma pré-compreensão da norma abstrata a se concretizar, logo, é errado dizer que prescinde (= dispensa).");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(22L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("Todo o poder emana do povo, que o exerce apenas por meio de representantes eleitos, nos termos da Constituição Federal.");
            question.setComentario("Errado\nO Brasil tem como regime político a democracia mista, ou seja, a regência do poder está nas mãos do povo, que o exerce por meio de seus representantes eleitos e também diretamente usando o plebiscito, o referendo e a iniciativa popular. (CF, art. 1°, parágrafo único e art. 14).");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(23L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("A Constituição brasileira determina a busca da implementação de um mercado comum das nações latinoamericanas.");
            question.setComentario("Errado\nTrata-se de uma busca de integração política,  econômica, social e cultural, e à formação de uma comunidade latino-americana de nações (CF, art. 4º, parágrafo único). Não trata da busca de um mercado comum.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(24L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("O Brasil admite a pena de morte.");
            question.setComentario("Correto\nEmbora em regra seja vedada a pena de morte (CF, art. 5º XLVII), é admissível no caso de guerra externa declarada. Recomendamos, em questões objetivas, sempre analisar todas as opções para averiguar se a questão está tentando buscar do candidato o conhecimento sobre as regras ou as exceções.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(25L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("Todo brasileiro é parte legítima para propor ação popular.");
            question.setComentario("Errado\nSomente o cidadão em sentido estrito, ou seja, o brasileiro em pleno gozo de direitos políticos (CF, art. 5º LXXIII)..");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(26L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("Pela ofensa à sua honra, a vítima pode receber indenização por dano moral, mas não por danos materiais.");
            question.setComentario("Errado\nA indenização por danos materiais também é assegurada (CF, art. 5º, X).");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(27L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("Segundo a Constituição de 1988, o lazer é um direito social.");
            question.setComentario("Correto\nEstá elencado na relação de direitos art. 6º da Constituição, o qual dispõe que são direitos sociais: a educação, a saúde, o trabalho, a moradia, o lazer, a segurança, a previdência social, a proteção à maternidade e à infância e a assistência aos desamparados..");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(28L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("Segundo a Constituição de 1988, a mulher é protegida quanto ao mercado de trabalho, mediante incentivos específicos.");
            question.setComentario("Correto\nRessalva-se que isso será 'nos termos da lei' (CF, art. 7º XX), assim, é arriscado o termo usado pela banca: 'é protegida'.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(29L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("Os cargos de Presidente e Vice-Presidente da República são privativos de brasileiros natos.");
            question.setComentario("Correto\nO cargo de Presidente da República e qualquer outro  que possa vir a substituir o Presidente será privativo de brasileiro nato (art. 12 §3º da CF).");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(30L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("É uma forma de participação popular na esfera pública a participação nas deliberações sobre políticas públicas por meio de organizações representativas em colegiados.");
            question.setComentario("Correto\nTrata-se de instrumentos como conselhos gestores, orçamentos participativos, fóruns temáticos que servem para aproximar o cidadão das políticas públicas.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(31L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("É vedado aos Estados manter relação de aliança com representantes de cultos religiosos ou igrejas, resguardando-se o interesse público.");
            question.setComentario("Correto\nSomente pode haver cooperação entre entes estatais e entidades religiosas quando se tratar de interesse público (CF,art. 19).");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            //Apostila 4 inicio em Qestao 1

            question = new Question();
            question.setId(32L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("O conceito de Estado possui " +
                    "basicamente quatro elementos: nação, território, governo e " +
                    "soberania. Assim, não é possível que haja mais de uma nação " +
                    "em um determinado Estado, ou mais de um Estado para a " +
                    "mesma nação.");
            question.setComentario("Errado\nA nação é um conceito sociológico, refere-se a uma idéia " +
                    "de união, um vínculo que o povo adquire por diversos fatores " +
                    "como etnia, religião, costumes... O Estado é a nação política e " +
                    "juridicamente organizada. Assim, dentro de um Estado pode " +
                    "haver várias nações (vários grupos vinculados), ou mesmo, esta " +
                    "nação pode estar espalhada por vários Estados, mas que continua mantendo este sentimento histórico de união, exemplo " +
                    "clássico disso é a nação judaica.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(33L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("A idéia de Estado de Direito, " +
                    "desde os primórdios da construção desse conceito, está " +
                    "associada à de contenção dos cidadãos pelo Estado.");
            question.setComentario("Errado\nÉ justamente o contrário. Estado de direito é o estado " +
                    "que se submete às leis, ou seja, é uma contenção do poder " +
                    "estatal e não dos cidadãos.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(34L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("A soberania do Estado, no " +
                    "plano interno, traduz-se no monopólio da edição do direito " +
                    "positivo pelo Estado e no monopólio da coação física legítima, " +
                    "para impor a efetividade das suas regulações e dos seus " +
                    "comandos.");
            question.setComentario("Correto\nSoberania é o poder supremo que um Estado exerce " +
                    "dentro de seu território não reconhecendo qualquer outro " +
                    "equivalente ou superior. Deste modo, a soberania será " +
                    "empregada para introduzir o ordenamento jurídico e impor os " +
                    "limites da convivência em sociedade, inclusive através da coação " +
                    "física legítima, como é o caso do poder exercido pela polícia " +
                    "judiciária.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(35L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("Os tradicionais elementos " +
                    "apontados como constitutivos do Estado são: o povo, a " +
                    "uniformidade lingüística e o governo.");
            question.setComentario("Errado\nO correto seria: Povo, Território e Governo (soberano).");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(36L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("Os fenômenos globalização, " +
                    "internacionalização e integração interestatal puseram em franca " +
                    "ascendência o modelo de Estado como unidade política " +
                    "soberana.");
            question.setComentario("Errado\nA globalização rompe com o conceito de Estado " +
                    "“isolado”, assim, enfraquece o modelo de unidade política devido " +
                    "à busca por grupos de interesse comum, como caso da União " +
                    "Européia, Mercosul, etc. Desta forma, tais institutos colocam em " +
                    "descendência e não em ascensão o modelo de unidade soberana.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(37L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("O vocábulo nação é bastante " +
                    "adequado para expressar tanto o sentido de povo, quanto o de " +
                    "Estado.");
            question.setComentario("Errado\nO conceito de Estado é jurídico, enquanto o de nação é " +
                    "sociológico e se refere a um vínculo de costumes, língua, e etc.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(38L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("A vontade do Estado é manifestada " +
                    "por meio dos Poderes Executivo, Legislativo e Judiciário, os " +
                    "quais, no exercício da atividade administrativa, devem " +
                    "obediência às normas constitucionais próprias da administração " +
                    "pública.");
            question.setComentario("Correto\nO poder do Estado é uno, mas se manifesta em três " +
                    "funções: a executiva, a legislativa e a judiciária. Este poder só é " +
                    "legítimo porque possui um respaldo de uma Constituição que " +
                    "organiza e limita as condições de seu exercício.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(39L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("O Estado constitui a nação " +
                    "politicamente organizada, enquanto a administração pública corresponde à atividade que estabelece objetivos do Estado, " +
                    "conduzindo politicamente os negócios públicos.");
            question.setComentario("Errado\nDizer que o Estado constitui a nação politicamente " +
                    "organizada está correto, já que o Estado é formado pelas " +
                    "relações entre os governantes e governados, organizados por " +
                    "uma Constituição e que visam o alcance de um bem comum. " +
                    "Dizer, porém, que a administração pública corresponderia a uma " +
                    "atividade unicamente política, organizatória está completamente " +
                    "errôneo, já que a administração pública englobaria todos os " +
                    "negócios de gestão da coisa pública, não apenas os políticos, " +
                    "organizadores.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(40L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("A origem do " +
                    "constitucionalismo remonta à antiguidade clássica, " +
                    "especificamente ao povo hebreu, do qual partiram as primeiras " +
                    "manifestações desse movimento constitucional em busca de uma " +
                    "organização política fundada na limitação do poder absoluto.");
            question.setComentario("Correto\nEste tema não é pacífico já que muitos doutrinadores " +
                    "advertem que não existe um constitucionalismo e sim vários " +
                    "constitucionalismos. A resposta escolhida pela banca, porém, foi " +
                    "a de aceitar a tese de que a antiga civilização hebraica já " +
                    "mostrava um constitucionalismo primitivo regulando as relações " +
                    "entre o povo. Era o chamado 'constitucionalismo antigo' que " +
                    "existiu na civilização hebraica e, posteriormente, também pode " +
                    "ser verificado na civilização grega.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(41L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("O neoconstitucionalismo é " +
                    "caracterizado por um conjunto de transformações no Estado e " +
                    "no direito constitucional, entre as quais se destaca a prevalência " +
                    "do positivismo jurídico, com a clara separação entre direito e " +
                    "valores substantivos, como ética, moral e justiça.");
            question.setComentario("Errado\nO neoconstitucionalismo, ou constitucionalismo " +
                    "contemporâneo, se constitui justamente em uma doutrina que " +
                    "tenta transcender ao positivismo, chega-se então ao conceito de " +
                    "pós-positivismo. Para os defensores do neoconstitucionalismo o " +
                    "direito deve ter como foco a Constituição e esta, na verdade, " +
                    "seria um 'bloco constitucional' onde os aspectos principiológicos " +
                    "e os valores se tornam tão importantes quanto as regras " +
                    "insculpidas no texto constitucional. Desta forma, erra o " +
                    "enunciado ao mencionar as expressões 'prevalência do " +
                    "positivismo' e 'separação entre direito e valores substantivos'.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(42L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("O neoconstitucionalismo " +
                    "caracteriza-se pela mudança de paradigma, de Estado " +
                    "Legislativo de Direito para Estado Constitucional de Direito, em " +
                    "que a Constituição passa a ocupar o centro de todo o sistema " +
                    "jurídico.");
            question.setComentario("Correto\nO neoconstitucionalismo não é apenas uma nova " +
                    "roupagem para algo antigo, mas sim um novo repensar do " +
                    "direito onde a Constituição deixa de ser uma 'carta de intenções' " +
                    "e realmente se torna um 'norma jurídica' devendo, assim, ser " +
                    "concretizada. Dessa forma, deixa-se de lado o foco nas leis, para " +
                    "se colocar o foco na Constituição, buscando concretizar o " +
                    "ordenamento jurídico de acordo com o pensamento do legislador " +
                    "constituinte.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(43L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("O constitucionalismo " +
                    "moderno representa uma técnica específica de limitação do " +
                    "poder com fins garantidores.");
            question.setComentario("Correto\nVemos pelas questões que o CESPE claramente está " +
                    "adotando a tese de constitucionalismo dividido em:\nConstitucionalismo Antigo - Manifestado primeiramente na " +
                    "civilização hebraica (que era teocrática) onde o poder era " +
                    "limitado pela 'Lei do Senhor' e posteriormente na civilização " +
                    "grega onde havia um inclusive uma escolha de cidadãos para os " +
                    "cargos públicos;\nConstitucionalismo da Idade Média - Marcado pela Magna " +
                    "Carta de 1215 onde o rei João 'sem terra' teve de assinar uma " +
                    "carta de limitações de seu poder para que não fosse deposto " +
                    "pelos barões;\nConstitucionalismo Moderno - Marcado pela Revolução " +
                    "Francesa e pela Independência dos Estados Unidos, onde o povo " +
                    "realmente passava a legitimar a Constituição e exigir um rol de " +
                    "garantias perante o Estado.\nDesta forma, encontra-se correta a questão, já que realmente foi " +
                    "no Constitucionalismo moderno que efetivamente temos uma " +
                    "limitação do poder com finalidade de garantir as liberdades " +
                    "particulares face ao Estado. É importante salientar que alguns " +
                    "autores não reconhecem como constitucionalismo aqueles que " +
                    "apareceram antes da Revolução Francesa, e assim não utilizam " +
                    "tal classificação mostrada. Eles dividem o constitucionalismo em " +
                    "'clássico' e 'moderno', o primeiro começa na Revolução " +
                    "Francesa e na Independência dos Estados Unidos (Séc. XVIII) e é " +
                    "superado pelo segundo no pós-guerra (início do séc. XX).");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(44L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("As constituições do " +
                    "pósguerra promoveram inovações por meio da incorporação " +
                    "explícita, em seus textos, de anseios políticos, como " +
                    "a redução de desigualdades sociais, e de valores como a " +
                    "promoção da dignidade humana e dos direitos fundamentais.");
            question.setComentario("Correto\nAs Constituições do pós-guerra são marcadas por fazer " +
                    "a passagem de um Estado Liberal para um Estado Social, ou " +
                    "seja, percebe-se que não é suficiente apenas garantir liberdades, " +
                    "mas o Estado deve agir proativamente para prover os direitos ao " +
                    "seu povo. Temos então a constitucionalização dos direitos " +
                    "sociais, econômicos e culturais (direitos de segunda-geração) " +
                    "principalmente na Constituição Mexicana de 1917 e na " +
                    "Constituição de Weimar (Alemanha) em 1919.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(45L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("A expressão " +
                    "bloco de constitucionalidade pode ser entendida como o " +
                    "conjunto normativo que contém disposições, princípios e valores " +
                    "materialmente constitucionais fora do texto da CF formal.");
            question.setComentario("Correto\nÉ uma expressão típica do neoconstitucionalismo, onde " +
                    "existe uma preocupação maior com os princípios e valores da " +
                    "sociedade do que com a efetiva letra fria da norma escrita.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(46L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("O conceito de constituição " +
                    "moderna corresponde à idéia de uma ordenação sistemática e " +
                    "racional da comunidade política por meio de um documento " +
                    "escrito no qual se declaram as liberdades e os direitos e se fixam " +
                    "os limites do poder político. Esse conceito de constituição é " +
                    "também conhecido como conceito oriental de constituição.");
            question.setComentario("Errado\nSegundo a doutrina, o constitucionalismo moderno " +
                    "legitimou o aparecimento da chamada constituição moderna que " +
                    "é justamente definida como sendo a organização da comunidade " +
                    "política em um documento escrito no qual se asseguram as " +
                    "liberdades e os direitos e se fixam os limites do poder " +
                    "político (atenção a estas características por nós grifadas). Esse é " +
                    "o chamado conceito ocidental de constituição ou conceito ideal " +
                    "de constituição.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(47L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("O ponto central do " +
                    "movimento constitucionalista inglês foi a revolução gloriosa " +
                    "(1688-89), quando então se iniciou o movimento político-jurídico " +
                    "de limitação dos poderes do rei, por meio de instrumentos " +
                    "jurídicos do tipo Magna Carta, que possuem a mesma natureza " +
                    "jurídica de uma constituição.");
            question.setComentario("Errado\nDiferentemente de muitos países como a França, o " +
                    "movimento constitucional na Inglaterra não teve seu início " +
                    "marcado por uma revolução, foi um movimento histórico. Assim, " +
                    "embora não possamos ignorar as contribuições trazidas pelas " +
                    "revoluções deste país, que de fato foram muito importantes, não " +
                    "podemos elencá-las como o marco inicial do movimento inglês " +
                    "que já se inicia em momentos muito anteriores, como o caso da " +
                    "Magna Carta de 1215 que já era um instrumento limitador do " +
                    "poder Estatal.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(48L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("Com o movimento " +
                    "constitucionalista francês, a partir da Revolução Francesa, " +
                    "sedimentou-se a visão de direitos individuais do homem, em " +
                    "oposição à visão do homem como integrante de um segmento " +
                    "estamental, adotada pelo movimento constitucionalista inglês.");
            question.setComentario("Correto\nA Revolução Francesa foi um marco do chamado " +
                    "“Estado Liberal” já que fortaleceu as limitações do Poder Estatal " +
                    "face aos cidadãos solidificando os direitos individuais.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(49L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("O constitucionalismo pode ser " +
                    "corretamente definido como um movimento que visa limitar o " +
                    "poder e estabelecer um rol de direitos e garantias individuais, o " +
                    "que cria a necessidade de se instituir uma carta, em regra " +
                    "escrita, que possa juridicizar essa relação entre Estado e " +
                    "cidadão, de forma a se gerar mais segurança jurídica.");
            question.setComentario("Correta. Trata-se de um perfeito retrato da concepção moderna " +
                    "de constitucionalismo, que surgiu com a Revolução Francesa e a " +
                    "independência dos EUA.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(50L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("No sentido sociológico defendido por " +
                    "Ferdinand Lassale, a Constituição é fruto de uma decisão " +
                    "política.");
            question.setComentario("Errado\nO sentido defendido por Lassale era o sentido " +
                    "sociológico. Quem defendia o sentido político da Constituição era " +
                    "Carl Schimitt.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(51L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("No sentido jurídico, a Constituição não " +
                    "tem qualquer fundamentação sociológica, política ou filosófica.");
            question.setComentario("Correto\nO defensor do sentido jurídico era Hans Kelsen, para ele " +
                    "a norma se origina na própria norma, a Constituição é norma " +
                    "pura, o chamado puro 'dever ser', ou seja, o mundo hipotético " +
                    "fruto do pensamento racional do ser humano, aquilo que o " +
                    "homem deseja para a organização do poder. O que importa no " +
                    "sentido jurídico é a formalidade, a rigidez da constituição, sua " +
                    "característica de ser superior às demais normas e servir de " +
                    "ponto de partida para todas as outras, ser a norma fundamental " +
                    "do ordenamento, independente do assunto tratado. Desta forma, " +
                    "não há qualquer fundamentação sociológica, política ou " +
                    "filosófica já que a Constituição é normativa e não um mero " +
                    "convite aos poderes públicos.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(52L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("Concebido por Ferdinand Lassale, o " +
                    "princípio da força normativa da CF é aquele segundo o qual os " +
                    "aplicadores e intérpretes da Carta, na solução das questões " +
                    "jurídicoconstitucionais, devem procurar a máxima eficácia do " +
                    "texto constitucional.");
            question.setComentario("Errado\nFerdinand Lassale não tinha nada haver com força " +
                    "normativa da Constituição, pelo contrário, ao pregar o sentido " +
                    "sociológico da Constituição, onde a constituição real era aquela " +
                    "formada pelos fatores reais de poder da sociedade, dizia que a " +
                    "constituição poderia ser completamente ignorada pela sociedade. " +
                    "A força normativa da Constituição foi concebida por Konrad " +
                    "Hesse, jurista da doutrina positivista, que defendia o sentido " +
                    "jurídico da Constituição aplicando os ensinamentos de Hans " +
                    "Kelsen.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(53L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("No sentido " +
                    "sociológico, a constituição seria distinta da lei constitucional, " +
                    "pois refletiria a decisão política fundamental do titular do poder " +
                    "constituinte, quanto à estrutura e aos órgãos do Estado, aos " +
                    "direitos individuais e à atuação democrática, enquanto leis " +
                    "constitucionais seriam todos os demais preceitos inseridos no " +
                    "documento, destituídos de decisão política fundamental.");
            question.setComentario("Errado\nEste seria o sentido político defendido por Carl Schimitt, " +
                    "onde teríamos de forma bem distinta: a Constituição, que seria " +
                    "formada pelas normas que organizam o Estado e limitam o poder " +
                    "estatal, e as demais normas que formariam meras 'leis " +
                    "constitucionais' já que não veiculariam conteúdos essenciais a " +
                    "uma Constituição.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(54L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("Segundo " +
                    "Kelsen, a CF não passa de uma folha de papel, pois a CF real " +
                    "seria o somatório dos fatores reais do poder. Dessa forma, " +
                    "alterando-se essas forças, a CF não teria mais legitimidade.");
            question.setComentario("Errado\nKelsen defende o sentido jurídico, a Constituição como " +
                    "norma fundamental impositiva. Quem defendia a CF escrita " +
                    "como mera folha de papel era Lassale - sentido sociológico -, " +
                    "para ele a Constituição real seria aquilo que está acontecendo na " +
                    "sociedade, ou seja, o somatório dos fatores reais de poder.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(55L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("Considere a seguinte definição, " +
                    "elaborada por Kelsen e reproduzida, com adaptações, de José " +
                    "Afonso da Silva (Curso de Direito Constitucional Positivo. São " +
                    "Paulo: Atlas,p. 41...). A constituição é considerada norma pura. " +
                    "A palavra constituição tem dois sentidos: lógico-jurídico e " +
                    "jurídico-positivo. De acordo com o primeiro, constituição " +
                    "significa norma fundamental hipotética, cuja função é servir de " +
                    "fundamento lógico transcendental da validade da constituição " +
                    "jurídico-positiva, que equivale à norma positiva suprema, " +
                    "conjunto de normas que regula a criação de outras normas, lei " +
                    "nacional no seu mais alto grau. É correto afirmar que essa " +
                    "definição denota um conceito de constituição no seu sentido " +
                    "jurídico.");
            question.setComentario("Correto\nO sentido jurídico proposto por Kelsen traz com ele 2 " +
                    "desdobramentos:\n1. Sentido lógico-jurídico: É a Constituição hipotética que foi " +
                    "imaginada na hora de escrever seu texto.\n2. Sentido jurídico-positivo: É a norma suprema em si, " +
                    "positiva, que efetivamente se formou e que servirá de base para " +
                    "as demais do ordenamento.\nAssim, diz-se que a norma em sentido lógico-jurídico é o " +
                    "fundamento de validade que legitima a feitura da norma " +
                    "jurídico-positiva.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(56L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("Uma Constituição do tipo cesarista se " +
                    "caracteriza, quanto à origem, pela ausência da participação " +
                    "popular na sua formação.");
            question.setComentario("Errado\nA constituição cesarista é apontada com um 'meio " +
                    "termo' entre as constituições outorgadas (impostas) e as " +
                    "promulgadas. Ela é caracterizada por ser uma constituição que é " +
                    "outorgada pelo governante, mas que, posteriormente, a submete " +
                    "ao crivo popular.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(57L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("A CF vigente, quanto à sua alterabilidade, " +
                    "é do tipo semiflexível, dada a possibilidade de serem " +
                    "apresentadas emendas ao seu texto; contudo, com quorum " +
                    "diferenciado em relação à alteração das leis em geral.");
            question.setComentario("Errado\nEsse fato faz com que a CF seja uma constituição rígida. " +
                    "A constituição semiflexível é aquela que possui uma parte em " +
                    "que sequer precisa-se de um procedimento especial para ser " +
                    "alterada, bastam simples leis ordinárias.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(58L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("A CF de 1988, quanto à origem, é " +
                    "promulgada, quanto à extensão, é analítica e quanto ao modo de " +
                    "elaboração, é dogmática.");
            question.setComentario("Correto\nA constituição pode ser quanto a origem: promulgada " +
                    "ou outorgada, será outorgada quando for imposta, o que não é o " +
                    "nosso caso. A CF brasileira é promulgada. Quanto a extensão " +
                    "pode ser analítica ou sintética, esta é aquela que trata somente " +
                    "de assuntos essenciais a uma constituição, não é o nosso caso, " +
                    "temos uma constituição extensa, analítica, até mesmo prolixa.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(59L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("Uma Constituição classificada como " +
                    "semiflexível ou semirrígida significa que ela é tanto rígida como " +
                    "flexível, com matérias que exigem um processo de alteração mais " +
                    "dificultoso do que o exigido para alteração de leis " +
                    "infraconstitucionais.");
            question.setComentario("Errado\nPreliminarmente a banca considerou o item como " +
                    "correto, porém, percebeu o equívoco cometido no final do " +
                    "enunciado. Nas palavras do próprio CESPE ao justificar a " +
                    "mudança foi dito: '...deveria ter sido afirmado que algumas " +
                    "regras poderão ser alteradas pelo processo legislativo ordinário, " +
                    "enquanto outras só podem ser alteradas por um processo " +
                    "legislativo especial e mais dificultoso'.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(60L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("Segundo a classificação da doutrina, a " +
                    "CF é um exemplo de constituição rígida.");
            question.setComentario("Correto\nÉ uma constituição que só pode ser modificada por um " +
                    "processo especial, mais dificultoso que o de elaboração de leis " +
                    "ordinárias, daí possuir a chamada 'rigidez'.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(61L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("A Carta outorgada em 10 de " +
                    "novembro de 1937 é exemplo de texto constitucional colocado a " +
                    "serviço do detentor do poder,para seu uso pessoal. É a máscara " +
                    "do poder. É uma Constituição que perde normatividade, salvo " +
                    "nas passagens em que confere atribuições ao titular do poder. " +
                    "Numerosos preceitos da Carta de 1937 permaneceram no " +
                    "domínio do puro nominalismo, sem qualquer aplicação e " +
                    "efetividade no mundo das normas jurídicas - Raul Machado " +
                    "Horta. Direito constitucional. 2.a ed. Belo Horizonte: Del Rey, " +
                    "1999, p. 54-5 (com adaptações). Considerando a classificação " +
                    "ontológica das constituições,a Constituição de 1937, conforme a " +
                    "descrição anterior pode ser classificada como constituição " +
                    "outorgada.");
            question.setComentario("Errado\nKarl Loewenstein, desenvolveu o chamado conceito " +
                    "ontológico de constituição. Para ele, as Constituições se " +
                    "classificariam em:\na) Constituição normativa – é a Constituição que é " +
                    "efetivamente aplicada, normatiza o exercício do poder e obriga " +
                    "realmente a todos.\nb) Constituição nominal ou nominativa – é aquela que é " +
                    "ignorada pelos governantes.\nc) Constituição semântica – é aquela que serve apenas para " +
                    "justificar a dominação daqueles que exercem o poder político. " +
                    "Ela sequer tenta regular o poder.\nDesta forma, está Errada a questão, já que o conceito referido " +
                    "seria o de Constituição 'semântica'. Veja que ela era uma " +
                    "constituição outorgada, mas não se pediu na questão a " +
                    "classificação quanto à origem e sim a classificação ontológica.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(62L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("De acordo com a doutrina, " +
                    "constituição semântica é aquela cuja interpretação depende do " +
                    "exame de seu conteúdo significativo, sob o ponto de vista " +
                    "sociológico, ideológico e metodológico, de forma a viabilizar " +
                    "maior aplicabilidade político-normativo-social de seu texto.");
            question.setComentario("Correto\nA questão é maldosa já que o termo 'constituição " +
                    "semântica' pode ser enxergado de dois diferentes prismas:\n1º - Segundo a classificação ontológica de Karl Loewenstein, " +
                    "constituição semântica seria aquela que não se preocupa em " +
                    "limitar o poder dos governantes, pelo contrário, trata-se de uma " +
                    "verdadeira carta elaborada somente para legitimar os seus " +
                    "autoritarismos.\n2º - O segundo enfoque, que foi o cobrado pela questão, seria " +
                    "colocar a constituição semântica como aquela cuja interpretação " +
                    "'depende da valoração de seu conteúdo significativo, sociológico, " +
                    "visando uma maior aplicabilidade político-normativa-social do " +
                    "seu texto'. Tal modo, iria contrariamente ao conceito de " +
                    "constituição nominalista, esta, por sua vez seria a constituição " +
                    "que já traria normas para direcionar o aplicador ao se deparar " +
                    "com o caso concreto, assim, a bastaria a aplicação pura e " +
                    "simples das normas constitucionais, através de uma " +
                    "interpretação gramatical-literal para que o problema fosse " +
                    "resolvido.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(63L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("Quanto ao modo de " +
                    "elaboração, a constituição dogmática decorre do lento processo " +
                    "de absorção de ideias, da contínua síntese da história e das " +
                    "tradições de determinado povo.");
            question.setComentario("Errado\nA constituição dogmática é marcada justamente por " +
                    "expor em um papel aquela idéia presente em um determinado " +
                    "momento da sociedade. Deve ser necessariamente escrita, pois, " +
                    "diferentemente das constituições histórica, seus dogmas ainda " +
                    "não estão solidamente arraigados na sociedade, pois não foram " +
                    "formados lentamente através de uma evolução histórica.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(64L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("Sob o ponto de vista da " +
                    "extensão, a constituição analítica consubstancia apenas normas " +
                    "gerais de organização do Estado e disposições pertinentes aos " +
                    "direitos fundamentais.");
            question.setComentario("Errado\nEste é o conceito justamente oposto ao de analítica, ou " +
                    "seja, o de constituição sintética.A constituição concisa, ou " +
                    "sintética, que é aquela que positiva apenas as normas essenciais a uma constituição e, assim, não se preocupa com detalhes e " +
                    "prolixidades deixando isto para a legislação infraconstitucional.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(65L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("No tocante à estabilidade, " +
                    "consideram-se rígidas as constituições que apresentam um " +
                    "processo legislativo diferenciado e exigências formais especiais " +
                    "quanto à modificação das suas normas, distanciando-se, " +
                    "portanto, do processo legislativo previsto para a alteração das " +
                    "normas infraconstitucionais.");
            question.setComentario("Correto\nAs constituições rigidas são as que exigem um " +
                    "procedimento especial para serem alteradas, É o caso da nossa " +
                    "Constituição que só pode ser alterada por emendas " +
                    "constitucionais, que possuem um rito de votação diferenciado " +
                    "em relação às demis leis do ordenamento.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(66L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("Na acepção " +
                    "formal, terá natureza constitucional a norma que tenha sido " +
                    "introduzida na lei maior por meio de procedimento mais " +
                    "dificultoso do que o estabelecido para as normas " +
                    "infraconstitucionais, desde que seu conteúdo se refira a regras " +
                    "estruturais do Estado e seus fundamentos.");
            question.setComentario("Errado\nQuando o enunciado fala a palavra 'conteúdo' já está " +
                    "fora do conceito de constituição formal, pois a nesta " +
                    "classificação é totalmente irrelevante a matéria tratada pela " +
                    "norma, importando tão somente a formalidade das normas.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(67L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("Considerando o " +
                    "conteúdo ideológico das constituições, a vigente Constituição " +
                    "brasileira é classificada como liberal ou negativa.");
            question.setComentario("Errado\nConstituição negativa, ou liberal, ou ainda constituição " +
                    "garantia, é aquela que se limita tão somente a garantir as " +
                    "liberdades do povo face ao Estado. Trata-se das primeiras " +
                    "constituições formais do séc. XVIII. Com o passar dos anos, " +
                    "percebeu-se que não poderia a constituição se limitar a ser " +
                    "negativa, devendo então agir positivamente, para que o povo " +
                    "pudesse ter acesso a outros direitos, como os direitos sociais, " +
                    "econômicos, culturais e os direitos da coletividade. Desta forma, " +
                    "a Constituição atual é uma constituição dirigente.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(68L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("Quanto à " +
                    "correspondência com a realidade, ou critério ontológico, o " +
                    "processo de poder, nas constituições normativas, encontra-se de " +
                    "tal modo disciplinado que as relações políticas e os agentes do " +
                    "poder se subordinam às determinações de seu conteúdo e do seu " +
                    "controle procedimental.");
            question.setComentario("Correto\nPelo critério ontológico, diferentemente do que ocorre " +
                    "nas constituições nominalistas, quando estamos diante de uma " +
                    "constituição normativa, o poder consegue ser realmente " +
                    "regulado pela constituição, esta não é ignorada pelos " +
                    "governantes.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(69L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("Constituição " +
                    "rígida é aquela que não pode ser alterada.");
            question.setComentario("Errado\nEsta seria uma constituição imutável. A constituição " +
                    "rígida pode ser alterada, só que de uma maneira mais complexa.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(70L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("A constituição de determinado " +
                    "país constitui sua lei fundamental, a qual prevê normas relativas: a estruturação do Estado, formação dos poderes, " +
                    "forma de governo, aquisição do poder, distribuição de " +
                    "competências, direitos, garantias e deveres dos cidadãos. " +
                    "Portanto, para ser considerado como constituição, é " +
                    "imprescindível que haja um único documento escrito contendo " +
                    "tais regras.");
            question.setComentario("Errado\nConstituição não é necessariamente escrita em um " +
                    "único documento, temos casos das chamadas constituições " +
                    "legais, em que existem vários documentos de status " +
                    "constitucional, embora não sejam comuns. Constituições de " +
                    "alguns países sequer são escritas. Embora o conceito ideal de " +
                    "constituição , formado a partir da revolução francesa, indique " +
                    "que as constituições devam ser escritas, temos países " +
                    "consuetudinários como a Inglaterra, onde a matéria " +
                    "constitucional é mais importante do que a forma.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(71L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("As constituições rígidas não " +
                    "podem, em nenhuma hipótese, serem alteradas.");
            question.setComentario("Errado\nConstituição que não pode ser alterada é a imutável. A " +
                    "constituição rígida pode ser alterada, só que de uma maneira " +
                    "mais complexa.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(72L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("A constituição material contém " +
                    "um conjunto de regras escritas, constantes de um documento " +
                    "solene estabelecido pelo chamado poder constituinte originário.");
            question.setComentario("Errado\nConstituição escrita é a constituição formal. Em " +
                    "constituições materiais, não importa se a norma é escrita ou " +
                    "não, o que importa é o conteúdo que elas veiculam.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(73L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("A constituição de determinado " +
                    "país pode não ser escrita, já que tem por fundamento costumes, " +
                    "jurisprudência, leis esparsas e convenções, cujas regras não se " +
                    "encontram consolidadas em um texto solene.");
            question.setComentario("Correto\nSeria o caso de constituições materiais.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(74L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("As constituições outorgadas " +
                    "decorrem da participação popular no processo de elaboração.");
            question.setComentario("Errado\nA outorgada é uma constituição imposta, as " +
                    "constituições que são legitimadas pelo povo são as promulgadas, " +
                    "também chamada de populares.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(75L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("A Constituição da República " +
                    "Federativa do Brasil de 1988 (CF) caracteriza-se por ser rígida e " +
                    "material.");
            question.setComentario("Errado\nEla é formal e não material.O importante é a sua forma " +
                    "escrita e rígida, independente do conteúdo tratado.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(76L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("'Art. 242 § 2.º – O Colégio Pedro II, " +
                    "localizado na cidade do Rio de Janeiro, será mantido na órbita " +
                    "federal'. A normas contida no dispositivo transcrito pode ser " +
                    "caracterizada como materialmente constitucionais, porquanto " +
                    "traduz a forma como o direito social à educação será " +
                    "implementado no Brasil.");
            question.setComentario("Errado\nEste é um exemplo clássico de norma meramente " +
                    "formal, sem nenhum conteúdo que seria indispensável a uma " +
                    "Constituição, já que nem é responsável por organizar o poder, " +
                    "nem limitar a atuação do Estado. É simplesmente um retrato da " +
                    "prolixidade da Constituição brasileira de 1988.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(77L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("Os dispositivos constitucionais relativos " +
                    "à composição e ao funcionamento da ordem política exprimem o " +
                    "aspecto formal da Constituição.");
            question.setComentario("Errado\nOs dispositivos que servem para organizar o poder e " +
                    "limitar a atuação do Estado são tratados como essenciais a uma " +
                    "Constituição. Desta forma, traduzem o aspecto material " +
                    "(conteúdo).");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(78L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("A distinção entre o que é constitucional " +
                    "só na esfera formal e aquilo que o é em sentido substancial só se " +
                    "produz nas constituições escritas.");
            question.setComentario("Correto\nEm constituições não-escritas, ou a norma é " +
                    "constitucional (tem matéria essencial a uma constituição) ou a " +
                    "norma não é constitucional, não há normas consideradas " +
                    "constitucionais sem que veiculem matérias próprias a uma " +
                    "constituição. Somente nas constituições escritas é que podemos " +
                    "ter normas inseridas no corpo de uma constituição sem " +
                    "qualquer essencialidade, e nem por isso irão deixar de ser " +
                    "constitucionais.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(79L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("O parágrafo 2.º do art. 242 da CF - O " +
                    "Colégio Pedro II, localizado na cidade do Rio de Janeiro, será " +
                    "mantido na órbita federal -, por trazer comando típico de " +
                    "legislação infraconstitucional, poderá ser alterado por meio do " +
                    "mesmo procedimento legislativo utilizado para a alteração das " +
                    "leis ordinárias, uma vez que a CF é classificada, quanto à " +
                    "estabilidade, como semirrígida.");
            question.setComentario("Errado\nAs semi-rígidas são aquelas que possuem uma parte " +
                    "flexível, podendo ser alterada sem nenhum procedimento especial e uma parte que para ser alterada precisaria de um rito " +
                    "especial tal qual o das emendas constitucionais previstas na " +
                    "Constituição Brasileira de 88. O erro está no fato de que a CF " +
                    "atual é uma constituição rígida, não há qualquer parte flexível " +
                    "em seu texto. O dispositivo do enunciado, mostra a prolixidade " +
                    "da Constituição e não a sua flexibilidade.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(80L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("'Art. 242 § 2.º – O Colégio Pedro II, " +
                    "localizado na cidade do Rio de Janeiro, será mantido na órbita " +
                    "federal'. O dispositivo constitucional em destaque demonstra " +
                    "que a CF pode ser classificada, quanto à extensão, como prolixa. " +
                    "Diante disso, é correto concluir que, no Brasil, há uma maior " +
                    "estabilidade do arcabouço constitucional que em países como os " +
                    "Estados Unidos da América.");
            question.setComentario("Errado\nRealmente o dispositivo caracteriza a Constituição como " +
                    "prolixa, porém, neste tipo de Constituição ocorre uma menor " +
                    "estabilidade, já que a norma está constantemente sendo " +
                    "alterada. Em constituições sintéticas como a dos EUA, existem " +
                    "poucas coisas para se modificar, desta forma, ela consegue se " +
                    "manter inalterada por muito mais tempo.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(81L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("Na Constituição, a dinâmica " +
                    "do processo político não se adapta às suas normas, embora ela " +
                    "conserve, em sua estrutura, um caráter educativo, com vistas ao " +
                    "futuro da sociedade. Seria uma Constituição prospectiva, isto é, " +
                    "voltada para um dia ser realizada na prática. Mas, enquanto não " +
                    "realizar todo o seu programa, continuaria a desarmonia entre os " +
                    "pressupostos formais nela insculpidos e sua aplicabilidade. É " +
                    "como se fosse uma roupa guardada no armário que será vestida " +
                    "futuramente, quando o corpo nacional tiver crescido. - Uadi " +
                    "Lammêgo Bulos. Constituição Federal anotada, 8.ª ed., São " +
                    "Paulo. Saraiva, 2008, p. 32. A espécie de constituição apontada " +
                    "no texto é definida como constituição nominal.");
            question.setComentario("Correto\nA classificação ontológica de Karl Loewenstein levava " +
                    "em consideração a correlação da constituição com a realidade. " +
                    "Quando uma constituição não conseguia impor as suas normas " +
                    "à vida política da sociedade, era chamada pelo autor de uma " +
                    "constituição nominal ou nominalista.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(82L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("Se o art. X da Constituição Y " +
                    "preceituar, na parte relativa às emendas à Constituição, que só é " +
                    "constitucional o que diz respeito aos limites, e atribuições " +
                    "respectivas dos poderes políticos, e aos direitos políticos, e " +
                    "individuais dos cidadãos, e que tudo o que não é constitucional " +
                    "pode ser alterado, sem as formalidades referidas, pelas " +
                    "legislaturas ordinárias, nessa hipótese, a Constituição Y será " +
                    "uma constituição flexível.");
            question.setComentario("Errado\nTrata-se de uma constituição semi-rígida ou semiflexível. " +
                    "Este tipo de constituição possui uma parte flexível, " +
                    "podendo ser alterada sem nenhum procedimento especial e uma " +
                    "parte que para ser alterada precisaria de um rito especial. " +
                    "Exemplo desta espécie de constituição foi a CF de 1824 no " +
                    "Brasil.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(83L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("No âmbito brasileiro, a " +
                    "Constituição Imperial de 1824 pode ser classificada como " +
                    "flexível, com base no que prescrevia seu art. 178: 'É só " +
                    "Constitucional o que diz respeito aos limites e atribuições " +
                    "respectivas dos poderes políticos, e aos direitos políticos e individuais dos cidadãos. Tudo o que não é Constitucional pode " +
                    "ser alterado sem as formalidades referidas, pelas legislaturas " +
                    "ordinárias.'");
            question.setComentario("Errado\nRealmente a Constituição Brasileira de 1824 possuia em " +
                    "seu art. 178, o texto: 'É só Constitucional o que diz respeito aos " +
                    "limites e atribuições respectivas dos poderes políticos, e aos " +
                    "direitos políticos e individuais dos cidadãos. Tudo o que não é " +
                    "Constitucional pode ser alterado sem as formalidades referidas, " +
                    "pelas legislaturas ordinárias'. Porém este fato, faz com que a " +
                    "Constituição se torne “semi-rígida”, ou seja, possui uma parte " +
                    "flexível e outra parte rígida, e não como flexível.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(84L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("Segundo a doutrina, quanto ao " +
                    "critério ontológico, que busca identificar a correspondência entre " +
                    "a realidade política do Estado e o texto constitucional, é possível " +
                    "classificar as constituições em normativas, nominalistas e " +
                    "semânticas.");
            question.setComentario("Correto\nKarl Loewenstein, desenvolveu o chamado conceito " +
                    "ontológico de constituição. Para ele, as Constituições se " +
                    "classificariam em:\na) Constituição normativa – é a Constituição que é " +
                    "efetivamente aplicada, normatiza o exercício do poder e obriga " +
                    "realmente a todos.\nb) Constituição nominal ou nominativa – é aquela que é " +
                    "ignorada pelos governantes.\nc) Constituição semântica – é aquela que serve apenas para " +
                    "justificar a dominação daqueles que exercem o poder político. " +
                    "Ela sequer tenta regular o poder.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(85L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("Toda constituição é " +
                    "necessariamente escrita e representada por um texto solene e " +
                    "codificado.");
            question.setComentario("Errado\nExistem as constituições consuetudinárias (costumeiras) " +
                    "que não se manifestam em um texto único elevado ao status " +
                    "constitucional.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(86L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("Nos crimes comuns, o presidente " +
                    "da República não está sujeito à prisão enquanto não for " +
                    "proferida sentença condenatória.");
            question.setComentario("Correto\nVersa a Constituição em seu art. Art. 86 § 3º que " +
                    "enquanto não sobrevier sentença condenatória, nas infrações " +
                    "comuns, o Presidente da República não estará sujeito a prisão. " +
                    "Ou seja, trata-se de uma imunidade formal que impede a prisão " +
                    "cautelar ou preventiva do Presidente da República.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(87L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("A Constituição da " +
                    "República Federativa do Brasil de 1988 (CF) não pode ser " +
                    "classificada como uma constituição popular, uma vez que se " +
                    "originou de um órgão constituinte composto de representantes " +
                    "do povo, e não da aprovação dos cidadãos mediante referendo.");
            question.setComentario("Errado\nEla é popular ou promulgada, justamente porque os " +
                    "legisladores constituintes eram representantes do povo.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            //parei na 56

            question = new Question();
            question.setId(88L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("O poder constituinte originário esgota-se " +
                    "quando é editada uma constituição, razão pela qual, além de ser " +
                    "inicial, incondicionado e ilimitado, ele se caracteriza pela " +
                    "temporariedade.");
            question.setComentario("Errado\nO Poder Constituinte Originário é caracterizado pela " +
                    "permanência, já que é o poder político que o povo possui para " +
                    "organizar o Estado e essa titularidade não se exaure no tempo.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(89L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("De acordo com " +
                    "entendimento do STF, as normas constitucionais provenientes " +
                    "da manifestação do poder constituinte originário têm, via de " +
                    "regra, retroatividade máxima.");
            question.setComentario("Errado\nElas são dotadas de retroatividade mínima ou " +
                    "temperada, já que só retroagem para alcançar os efeitos futuros " +
                    "dos casos passados. A doutrina divide os efeitos da " +
                    "retroatividade das normas, geralmente em 3 modos:\n- Máxima – Quando atinge inclusive os fatos passados já " +
                    "consolidados. Ex. As prestações que já venceram e que já foram " +
                    "pagas.\n- Média – Quando atinge os fatos passados apenas se estes " +
                    "estiverem pendentes de consolidação.Ex. As prestações já " +
                    "vencidas mas que não foram pagas.\n- Mínima – Quando não atinge os fatos passados, mas apenas " +
                    "os efeitos futuros que esses fatos puderem vir a manifestar. Essa " +
                    "é a teoria adotada no Brasil. Ex. As prestações que ainda irão " +
                    "vencer.\nImportante salientar que: esta é a regra que acontece caso a " +
                    "Constituição não diga nada a respeito. Já que, como o PCO é um " +
                    "poder ilimitado, ele poderá inclusive retroagir completamente, " +
                    "desde que faça isso de forma expressa no texto.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(90L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("O poder constituinte " +
                    "derivado decorrente deve observar, entre outros, os princípios " +
                    "constitucionais estabelecidos, que integram a estrutura da " +
                    "Federação brasileira, como, por exemplo, a forma de investidura " +
                    "em cargos eletivos, o processo legislativo e os orçamentos");
            question.setComentario("Errado\nNeste caso, seriam princípios extensíveis e não " +
                    "princípios estabelecidos. Os entes da federação ao se autoorganizarem " +
                    "devem respeitar basicamente 3 espécies de " +
                    "princípios:\n1- Os princípios sensíveis - são aqueles presentes no art. 34, " +
                    "VII da Constituição Federal, que se não respeitados poderão " +
                    "ensejar a intervenção federal.\n2- Os princípios federais extensíveis - são aqueles princípios " +
                    "federais que são aplicáveis pela simetria federativa aos demais " +
                    "entes políticos, como por exemplo, as diretrizes do processo " +
                    "legislativo, dos orçamentos e das investiduras nos cargos " +
                    "eletivos.\n3- Os princípios estabelecidos - são aqueles que estão " +
                    "expressamente ou implicitamente no texto da Constituição " +
                    "Federal limitando o poder constituinte do Estado-membro.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(91L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("No tocante ao poder " +
                    "constituinte originário, o Brasil adotou a corrente positivista, de " +
                    "modo que o referido poder se revela ilimitado, apresentando " +
                    "natureza pré-jurídica.");
            question.setComentario("Correto\nÉ uma oposição à corrente jusnaturalista, que " +
                    "considerava que o poder constituinte originário estaria limitado " +
                    "a um direito natural de existência pré-constitucional. Esta " +
                    "corrente não foi adotada no Brasil que seguiu a doutrina " +
                    "positivista.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(92L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("Da mesma forma que o poder " +
                    "constituinte originário, o poder de reforma não está submetido a " +
                    "qualquer limitação de ordem formal ou material, sendo que a CF " +
                    "apenas estabelece que não será objeto de deliberação a proposta " +
                    "de emenda tendente a abolir a forma federativa de Estado, o voto " +
                    "direto, secreto, universal e periódico, a separação de poderes e " +
                    "os direitos e garantias individuais.");
            question.setComentario("Errado\nO art. 60 da Constituição traz diversas limitações " +
                    "materiais (cláusulas pétreas), além de limitações formais " +
                    "(procedimentos) e circunstanciais (momentos em que a CF não " +
                    "estará sujeita à reforma).");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(93L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("O poder " +
                    "constituinte originário não se esgota quando se edita uma " +
                    "constituição, razão pela qual é considerado um poder " +
                    "permanente.");
            question.setComentario("Correto\nO Poder Constituinte Originário é caracterizado pela " +
                    "permanência, já que é o poder político que o povo possui para " +
                    "organizar o Estado e essa titularidade não se exaure no tempo.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(94L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("Respeitados os " +
                    "princípios estruturantes, é possível a ocorrência de mudanças " +
                    "na constituição, sem alteração em seu texto, pela atuação do " +
                    "denominado poder constituinte difuso.");
            question.setComentario("Correto\nO Poder Constituinte Difuso é o poder que os agentes " +
                    "políticos possuem para promover a chamada 'mutação " +
                    "constitucional', ou seja, atribuir novas interpretações à " +
                    "Constituição para que ela consiga se adequar à realidade da " +
                    "sociedade sem que seja necessário alterar o texto formal da " +
                    "norma. A mutação constitucional, não é irrestrita. Este poder " +
                    "deve respeitar certos limites como os princípios estruturantes do " +
                    "Estado e a impossibilidade de se subverter a literalidade de " +
                    "norma que não dê margem a interpretações diversas.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(95L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("Pelo critério " +
                    "jurídico-formal, a manifestação do poder constituinte derivado " +
                    "decorrente mantém-se adstrita à atuação dos estados-membros " +
                    "para a elaboração de suas respectivas constituições, não se " +
                    "estendendo ao DF e aos municípios, que se organizam mediante " +
                    "lei orgânica.");
            question.setComentario("Correto\nSegundo a doutrina, devido ao fato de a lei orgânica não " +
                    "se revestir na forma de uma constituição, ela não pode ser " +
                    "considerada fruto de um poder constituinte derivado decorrente, " +
                    "embora seja o passo principal da auto-organização do " +
                    "Municípios. É importante salientar, porém, que em se tratando " +
                    "da Lei Orgânica do DF, isso não é de todo verdade, pois o STF " +
                    "reconhece o seu status constitucional na parte que versa sobre " +
                    "matérias reservadas aos Estados-membros, sendo, então, " +
                    "admitido inclusive controle de constitucionalidade de leis face à " +
                    "Lei Orgânica do DF.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(96L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("O poder " +
                    "constituinte originário pode autorizar a incidência do fenômeno " +
                    "da desconstitucionalização, segundo o qual as normas da " +
                    "constituição anterior, desde que compatíveis com a nova ordem " +
                    "constitucional, permanecem em vigor com status de norma " +
                    "infraconstitucional.");
            question.setComentario("Correto\nEm regra, não existe desconstitucionalização. A teoria " +
                    "aceita no Brasil é a da revogação do ordenamento constitucional " +
                    "anterior. Porém, o poder constituinte originário é ilimitado. Caso " +
                    "este poder expressamente preveja o instituto da " +
                    "desconstitucionalização, não haverá qualquer impedimento para " +
                    "tal.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(97L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("As normas produzidas pelo " +
                    "poder constituinte originário são passíveis de controle " +
                    "concentrado e difuso de constitucionalidade.");
            question.setComentario("Errado\nNo Brasil não se aceita a tese da inconstitucionalidade " +
                    "de normas originárias já que o poder constituinte originário é " +
                    "ilimitado, autônomo e incondicionado.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(98L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("A CF pode ser alterada, a " +
                    "qualquer momento, por intermédio do chamado poder " +
                    "constituinte derivado reformador e também pelo derivado " +
                    "revisor.");
            question.setComentario("Errado\nO Poder Constituinte Derivado Revisor é o responsável " +
                    "pela revisão constitucional, procedimento mais simples de " +
                    "alteração do texto constitucional que existiu somente em 1993 e " +
                    "após isso se extinguiu. Outro erro é o fato de que existem " +
                    "algumas circunstâncias que impedem o uso, inclusive, do poder " +
                    "reformador, é o caso de estarmos em uma intervenção federal, " +
                    "estado de sítio ou estado de defesa. Desta forma, não pode-se " +
                    "falar de forma alguma em 'a qualquer tempo'.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(99L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("No que se refere ao poder " +
                    "constituinte originário, o Brasil adotou a corrente jusnaturalista, " +
                    "segundo a qual o poder constituinte originário é ilimitado e " +
                    "apresenta natureza pré-jurídica.");
            question.setComentario("Errado\nA questão possui dois erros. O primeiro é que o Brasil " +
                    "adota a corrente positivista. O segundo erro é que as características de 'ilimitado' e natureza 'pré-jurídica' são " +
                    "também características delineadas pela corrente positivista, e " +
                    "não pela jusnaturalista, segundo a qual o PCO estaria limitado " +
                    "por um direito de ordem pré-constitucional, o direito natural, de " +
                    "status supranacional.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(100L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("O preâmbulo, por estar " +
                    "na parte introdutória do texto constitucional e, portanto, possuir " +
                    "relevância jurídica, pode ser paradigma comparativo para a " +
                    "declaração de inconstitucionalidade de determinada norma " +
                    "infraconstitucional.");
            question.setComentario("Errado\nO STF já decidiu pela ausência de força jurídica do " +
                    "preâmbulo da Constituição. Assim, ele não pode ser usado para " +
                    "tornar normas infraconstitucionais como inconstitucionais.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(101L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("O ADCT tem natureza " +
                    "jurídica de norma constitucional, semelhante às normas " +
                    "inseridas no bojo da CF, não havendo desníveis ou " +
                    "desigualdades entre as normas do ADCT e os preceitos " +
                    "constitucionais quanto à intensidade de sua eficácia ou a " +
                    "prevalência de sua autoridade.");
            question.setComentario("Correto\nOs ADCT fazem parte da Constituição, não há qualquer " +
                    "hierarquia da parte dita por 'dogmática' em relação a parte " +
                    "transitória.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(102L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("A norma constitucional que " +
                    "estabelece que as associações só poderão ser compulsoriamente " +
                    "dissolvidas ou ter suas atividades suspensas por decisão judicial " +
                    "exigindo-se, no primeiro caso, o trânsito em julgado, tem " +
                    "aplicação imediata.");
            question.setComentario("Correto\nEsta é a regra trazida pelo art. 5º XIX da Constituição " +
                    "Federal.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(103L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("A competência da União para elaborar e " +
                    "executar planos nacionais e regionais de ordenação do território " +
                    "e de desenvolvimento econômico e social constitui exemplo de " +
                    "norma constitucional programática.");
            question.setComentario("Correto\nNorma programática é aquela norma que estabelece um " +
                    "programa para atuação do governo. É uma norma cuja eficácia " +
                    "não se dá imediatamente, mas somente quando posto em prática " +
                    "o 'programa' estabelecido.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(104L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("O preceito constitucional que assegura " +
                    "a liberdade de exercício de qualquer trabalho, ofício ou profissão, " +
                    "atendidas as qualificações profissionais estabelecidas em lei, " +
                    "constitui norma de eficácia limitada.");
            question.setComentario("Errado\nTrata-se de norma de eficácia contida, já que tão logo a " +
                    "Constituição entrou em vigor já foi assegurada tal liberdade, " +
                    "podendo, no entanto, uma norma infraconstitucional " +
                    "superveniente, conter o alcance desta garantia.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(105L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("Normas constitucionais supereficazes " +
                    "ou com eficácia absoluta são aquelas que contêm todos os " +
                    "elementos imprescindíveis para a produção imediata dos efeitos " +
                    "previstos; elas não requerem normatização subconstitucional " +
                    "subsequente, embora sejam suscetíveis a emendas.");
            question.setComentario("Errado\nEsta classificação é oriunda da prof. Maria Helena Diniz, " +
                    "que assim define as normas que estão gravadas como " +
                    "'cláusulas pétreas', não podendo assim serem abolidas por " +
                    "emendas constitucionais. A questão é doutrinária, porém, a " +
                    "jurisprudência admite emenda às cláusulas pétreas, desde que " +
                    "seja para fortalecê-las e não para aboli-las.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(106L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("As normas constitucionais " +
                    "que alteram a competência de tribunais possuem, de acordo com " +
                    "o entendimento do STF, eficácia imediata, devendo ser aplicado, " +
                    "de pronto, o dispositivo que promova a alteração.");
            question.setComentario("Correto\nÉ pacífico no STF o entendimento no sentido de que as " +
                    "normas constitucionais que alteram competência de Tribunais " +
                    "possuem eficácia imediata, devendo ser aplicado, de pronto, o " +
                    "dispositivo que promova esta alteração. Assim, quando a EC " +
                    "45/04, por exemplo, retirou do STF a competência para " +
                    "conceder o exequatur às cartas rogatórias, e a transferiu ao STJ, " +
                    "este dispositivo deveria ser aplicado tão logo entrasse em vigor a " +
                    "referida emenda. Assumiria assim o STJ a competência para o " +
                    "feito, inclusive sobre aquelas que já estariam sendo julgadas no " +
                    "STF que ficariam prejudicadas por incompetência superveniente, " +
                    "se tornando insubsistentes os votos já proferidos.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(107L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("Consoante entendimento do " +
                    "STF, a norma constitucional segundo a qual não há prisão civil " +
                    "por dívida, salvo a do responsável pelo inadimplemento " +
                    "voluntário e inescusável de obrigação alimentícia e a do " +
                    "depositário infiel, não é de eficácia restringível.");
            question.setComentario("Errado\nNas palavras do Supremo, 'a norma que se extrai do " +
                    "inciso LXVII do artigo 5º da Constituição Federal é de eficácia " +
                    "restringível. Pelo que as duas exceções nela contidas podem ser " +
                    "aportadas por lei, quebrantando, assim, a força protetora da " +
                    "proibição, como regra geral, da prisão civil por dívida'. Desta " +
                    "forma, temos a regra: Não cabe prisão civil por dívida. Essa " +
                    "proibição pode ser relativizada por lei: caso de inadimplemento " +
                    "voluntário e inescusável de obrigação alimentícia e a do " +
                    "depositário infiel. Se a lei prever a prisão nestes casos, estará " +
                    "restringindo a proibição da norma.\nEm Dezembro de 2009, o STF julgou que não ser cabível a prisão " +
                    "do depositário infiel, pois reconheceu o pacto de San Jose da " +
                    "Costa Rica (assinado pelo Brasil) com status supralegal, e neste pacto proibia-se a prisão por dívida. Desta forma, tornaram-se " +
                    "inaplicáveis as leis que permitiam a prisão do depositário infiel. " +
                    "Por terem se tornado inaplicáveis, elas não possuem mais força " +
                    "para conter a norma constitucional neste ponto.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(108L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("As normas constitucionais " +
                    "de eficácia limitada têm por fundamento o fato de que sua " +
                    "abrangência pode ser reduzida por norma infraconstitucional, " +
                    "restringindo sua eficácia e aplicabilidade.");
            question.setComentario("Errado\nEssa é a definição de eficácia contida. As normas de " +
                    "eficácia limitada sequer conseguem ser aplicáveis caso não " +
                    "exista lei para mediar os seus efeitos.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(109L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("Segundo a " +
                    "doutrina, os elementos orgânicos da constituição são aqueles " +
                    "que limitam a ação dos poderes estatais, estabelecem as balizas " +
                    "do estado de direito e consubstanciam o rol dos direitos " +
                    "fundamentais.");
            question.setComentario("Errado\nEstes seriam os limitativos. Os orgânicos são os que " +
                    "organizam a estrutura do Estado. A doutrina divide os elementos " +
                    "da Constituição em 5 grupos:\n1- Orgânicos: Normas que regulam a estrutura do Estado e do " +
                    "Poder; Organizam a estruturação do Estado;\n2- Limitativos: Limitam a atuação do poder do Estado, como os " +
                    "direitos e gatantias fundamentais (exceto os direitos sociais = " +
                    "eles são sócio-ideológicos)\n3- Sócio-ideológicos: Tratam do compromisso entre o Estado " +
                    "individualista, que protege a autonomia das vontades, com o " +
                    "Estado Social, onde as pessoas fazem parte de uma coletividade " +
                    "a ser respeitada como um todo.\n4- De Estabilização Constitucional: São os elementos que " +
                    "tratam da solução de conflitos constitucionais, defesa do Estado, " +
                    "Constituição e instituições democrátitcas como o Controle de " +
                    "Constitucionalidade, os procedimentos de reforma, o estado de " +
                    "sítio, estado de defesa e a intervenção federal.\n5- Formais de aplicabilidade: Regras de aplicação da " +
                    "Constituição, como o ADCT e normas como o art. 5º §1º - “As " +
                    "normas dos Dir. Fundamentais têm aplicação imediata.”");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(110L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("Segundo Pedro " +
                    "Lenza, os elementos limitativos da CF estão consubstanciados " +
                    "nas normas constitucionais destinadas a assegurar a solução de " +
                    "conflitos constitucionais, a defesa da Constituição, do Estado e " +
                    "das instituições democráticas.");
            question.setComentario("Errado\nOs elementos limitativos, servem para limitar a atuação " +
                    "do poder do Estado, como os direitos e gatantias fundamentais. " +
                    "Quando falamos em solução de conflitos, defesa da Constituição " +
                    "e etc. estamos falando em elementos de estabilização " +
                    "constitucional.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(111L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("O preâmbulo, o dispositivo " +
                    "que estabelece cláusulas de promulgação e as disposições " +
                    "transitórias são exemplos de elementos de estabilização " +
                    "constitucional.");
            question.setComentario("Errado\nSeriam classificados como elementos formais de " +
                    "aplicabilidade, já que os elementos de estabilização " +
                    "constitucional são os elementos que tratam da solução de conflitos constitucionais, defesa do Estado, Constituição e " +
                    "instituições democrátitcas como o Controle de " +
                    "Constitucionalidade, os procedimentos de reforma, o estado de " +
                    "sítio, estado de defesa e a intervenção federal.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(112L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("Os direitos individuais e " +
                    "suas garantias, os direitos de nacionalidade e os direitos " +
                    "políticos são considerados elementos limitativos das " +
                    "constituições.");
            question.setComentario("Correto\nA doutrina os classificam como elementos limitativos " +
                    "pois são responsáveis por limitar a atuação do Estado face aos " +
                    "particulares.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(113L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("Os denominados elementos " +
                    "formais de aplicabilidade das constituições são consagrados nas " +
                    "normas destinadas a garantir a solução de conflitos " +
                    "constitucionais, a defesa da Constituição, do Estado e das " +
                    "instituições democráticas.");
            question.setComentario("Errado\nEstes seriam os elementos de estabilização " +
                    "constitucional. Os elementos formais de aplicabilidade são as " +
                    "regras de aplicação da Constituição, como o preâmbulo, ADCT e " +
                    "normas como o art. 5º §1º - “As normas dos Dir. Fundamentais " +
                    "têm aplicação imediata.”");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(114L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("O STF admite a teoria da " +
                    "inconstitucionalidade superveniente de ato normativo produzido " +
                    "antes da nova constituição e perante o novo dispositivo " +
                    "paradigma, nela inserido.");
            question.setComentario("Errado\nNeste caso estaríamos diante de uma revogação e não de " +
                    "uma inconstitucionalidade superveniente. Esta não é aceita no " +
                    "Brasil, já que adota-se a teoria da inconstitucionalidade " +
                    "congênita, ou seja, para a norma ser inconstitucional ela deve " +
                    "nascer inconstitucional. Uma norma nunca se 'torna' " +
                    "inconstitucional ao longo do tempo.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(115L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("No fenômeno da recepção, " +
                    "são analisadas as compatibilidades formais e materiais da lei em " +
                    "face da nova constituição.");
            question.setComentario("Errado\nPara a recepção importa tão somente a compatibilidade " +
                    "material.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(116L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("Pelo princípio da supremacia da " +
                    "Constituição, constata-se que as normas constitucionais estão " +
                    "no vértice do sistema jurídico nacional, e que a elas compete, " +
                    "entre outras matérias, disciplinar a estrutura e a organização " +
                    "dos órgãos do Estado.");
            question.setComentario("Correto\nA Constituição é um instrumento de organização " +
                    "política do Estado e de limitação do poder estatal face aos " +
                    "particulares. Desta forma, está perfeito se falar que cabe à " +
                    "constituição, entre outras coisas, disciplinar a estrutura e a " +
                    "organização dos órgãos do Estado.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(117L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("O STF admite a " +
                    "teoria da inconstitucionalidade superveniente de ato normativo " +
                    "editado antes da nova constituição e perante o novo paradigma " +
                    "estabelecido.");
            question.setComentario("Errado\nNeste caso estaríamos diante de uma revogação e não de " +
                    "uma inconstitucionalidade superveniente. Esta não é aceita no " +
                    "Brasil, já que adota-se a teoria da inconstitucionalidade " +
                    "congênita, ou seja, para a norma ser inconstitucional ela deve " +
                    "nascer inconstitucional. Uma norma nunca se 'torna' " +
                    "inconstitucional ao longo do tempo.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(118L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("A disposição constitucional que prevê o " +
                    "direito dos empregados à participação nos lucros ou resultados " +
                    "da empresa constitui norma de eficácia limitada.");
            question.setComentario("Correto\nA Constituição assegura em seu art. 7º, XI, a " +
                    "participação nos lucros, ou resultados, desvinculada da " +
                    "remuneração, e, excepcionalmente, participação na gestão da empresa, conforme definido em lei. Se não tivermos uma lei " +
                    "disciplinando como serão estas participações, elas não poderão " +
                    "ser aplicáveis. Assim, está correto dizer que trata-se de norma de " +
                    "eficácia limitada.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(119L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("A norma constitucional que estabelece a " +
                    "liberdade quanto ao exercício de qualquer trabalho, ofício ou " +
                    "profissão constitui norma de eficácia plena.");
            question.setComentario("Errado\nSeria uma norma de eficácia contida, já que a " +
                    "Constituição prevê que é livre o exercício de qualquer trabalho, " +
                    "ofício ou profissão, atendida às qualificações profissionais que " +
                    "a lei estabelecer (CF, art. 5º, XIII. Ou seja, As pessoas podem " +
                    "exercer de forma plena qualquer trabalho, ofício ou profissão, " +
                    "salvo se vier uma norma estabelecendo certos requisitos para " +
                    "conter essa plena liberdade.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(120L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("A regra constitucional que determina o " +
                    "limite máximo de remuneração e subsídio na administração " +
                    "pública não é autoaplicável.");
            question.setComentario("Errado\nTrata-se de uma norma de eficácia plena, pois " +
                    "estabelece de forma direta limites a serem observados para a " +
                    "remuneração (vide CF, art. 37, XI). Desta forma, ela possui " +
                    "aplicabilidade imediata.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(121L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("O dispositivo constitucional " +
                    "que afirma que a finalidade da ordem econômica é assegurar a " +
                    "todos uma existência digna, conforme os ditames da justiça " +
                    "social, seria um exemplo de norma programática.");
            question.setComentario("Correto\nExistem autores que consideram este tipo de norma, " +
                    "não só uma norma programática como uma norma utópica, pois " +
                    "o Estado é apenas direcionado no sentido desta busca, mas em " +
                    "nenhum momento é compelido a tomar ações concretas para tal.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

           // Pular 91 92 93

            question = new Question();
            question.setId(122L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("Norma constitucional de " +
                    "eficácia contida é aquela que, sendo auto-aplicável, autoriza a " +
                    "posterior restrição por parte do legislador infraconstitucional.");
            question.setComentario("Correto\nA norma de eficácia contida possui aplicação imediata, " +
                    "tal qual às plenas. A diferença reside no fato de as primeiras " +
                    "poderem ser restringidas por comandos posteriores, geralmente " +
                    "de ordem infraconstitucional.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(123L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("O preâmbulo da " +
                    "Constituição Federal constitui uma norma central e, portanto, " +
                    "tem força normativa.");
            question.setComentario("Errado\nSegundo a Jurisprudência do STF, o preâmbulo não se " +
                    "constitui uma norma central da Constituição, não possuindo " +
                    "força jurídica para se impor sobre o resto do ordenamento, nem " +
                    "se constituindo como de reprodução obrigatória nas " +
                    "Constituições Estaduais.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(124L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("No tocante à aplicabilidade, de " +
                    "acordo com a tradicional classificação das normas " +
                    "constitucionais, são de eficácia limitada aquelas em que o " +
                    "legislador constituinte regula suficientemente os interesses " +
                    "concernentes a determinada matéria, mas deixa margem à " +
                    "atuação restritiva por parte da competência discricionária do " +
                    "poder público, nos termos em que a lei estabelecer ou na forma " +
                    "dos conceitos gerais nela previstos.");
            question.setComentario("Errado\nEssa é a definição de eficácia contida. As normas de " +
                    "eficácia limitada sequer conseguem ser aplicáveis caso não " +
                    "exista lei para mediar os seus efeitos. Já as contidas possuem " +
                    "aplicabilidade imediata, porém podem futuramente serem " +
                    "restringidas pelo legislador.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(125L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("Mutações constitucionais são alterações " +
                    "no texto da CF decorrentes de novos cenários na ordem " +
                    "econômica, social e cultural do país.");
            question.setComentario("Errado\nA mutação é um processo informal de mudança do teor " +
                    "constitucional que é oriundo de novas interpretações que os " +
                    "aplicadores da norma passam a dar para o seu texto, sem, no " +
                    "entanto, modificá-lo.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(126L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("O princípio da máxima efetividade visa " +
                    "interpretar a CF no sentido de atribuir à norma constitucional a " +
                    "maior efetividade possível, ou seja, deve-se atribuir a uma norma " +
                    "constitucional o sentido que lhe dê maior eficácia.");
            question.setComentario("Correto\nO princípio da máxima efetividade deriva do princípio " +
                    "da força normativa da Constituição, considerado por alguns até " +
                    "mesmo como um sub-princípio. Este princípio orienta o " +
                    "intérprete a tornar a norma constitucional mais densa, " +
                    "alcançando ao máximo sua efetiva aplicação.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(127L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("O princípio da unidade da Constituição " +
                    "considera essa Carta em sua totalidade, buscando harmonizá-la " +
                    "para uma visão de normas não isoladas, mas como preceitos " +
                    "integrados em um sistema unitário de regras e princípios.");
            question.setComentario("Correto\nPor tal princípio, não há contradições no texto " +
                    "constitucional, já que ele forma um corpo único, assim, o que " +
                    "ocorre são apenas 'aparentes' contradições, que devem ser " +
                    "dissipadas pelo intérprete ao analisar o texto em conjunto.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(128L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("A corrente que nega a possibilidade de o " +
                    "juiz, na interpretação constitucional, criar o direito e, valendo-se " +
                    "de valores substantivos, ir além do que o texto lhe permitir é " +
                    "chamada pela doutrina de não-interpretativista.");
            question.setComentario("Errado\nEmbora o nome possa induzir ao contrário, na corrente " +
                    "interpretativista é onde o juiz possui menor autonomia para " +
                    "exercer a atividade interpretativa, ele não pode transcender os " +
                    "limites do texto legal. Já na corrente não-interpretativista, é " +
                    "onde o juiz possui uma maior autonomia para ir além texto e " +
                    "empregar valores pessoais, substantivos, na atividade " +
                    "interpretativa.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(129L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("O princípio do efeito integrador " +
                    "estabelece que, havendo lacuna na CF, o juiz deve recorrer a outras normas do ordenamento jurídico para integrar o vácuo " +
                    "normativo.");
            question.setComentario("Errado\nIsso que está descrito no enunciado é o uso da técnica " +
                    "da integração e não interpretação. Usar o princípio de " +
                    "interpretação do efeito integrador é interpretar a norma de modo " +
                    "que favoreça a integração política e social e reforce a unidade " +
                    "política.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(130L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("Segundo o princípio da unidade da " +
                    "constituição, cada país só pode ter uma constituição em vigor, " +
                    "de modo que a aprovação de nova constituição implica a " +
                    "automática revogação da anterior.");
            question.setComentario("Errado\nO princípio da unidade da Constituição, a Constituição " +
                    "deve ser entendida como uma norma única, não existindo assim " +
                    "contradições em seu texto. Assim, não há nenhuma relação com " +
                    "o descrito no enunciado.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(131L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("O princípio da máxima efetividade " +
                    "estabelece que o intérprete deve atribuir às normas " +
                    "constitucionais o sentido que lhes dê maior efetividade, evitando, " +
                    "sempre que possível, soluções que impliquem a " +
                    "nãoaplicabilidade da norma.");
            question.setComentario("Correto\nEsta é a perfeita definição do referido princípio, ele " +
                    "significa que o juiz deve tentar evitar ao máximo que a " +
                    "Constituição se transforme em uma letra morta.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(132L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("O princípio da conformidade funcional " +
                    "visa impedir, na concretização da CF, a alteração da repartição " +
                    "das funções constitucionalmente estabelecidas.");
            question.setComentario("Correto\nO princípio da conformidade ou correição funcional está " +
                    "estritamente ligado à repartição das competências feita pela " +
                    "Constituição. Assim, a sua observância impede que haja uma " +
                    "deturpação do que foi constitucionalmente estabelecido.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(133L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("A interpretação conforme com redução " +
                    "de texto tem aplicação quando o STF exclui da norma " +
                    "questionada interpretação incompatível com a CF, reduzindo seu " +
                    "alcance valorativo.");
            question.setComentario("Errado\nRealmente a interpretação conforme, ou interpretação " +
                    "conforme à Constituição, é a técnica onde o STF declara como " +
                    "inconstitucional apenas uma forma de interpretar a norma, " +
                    "interpretação esta que estava indo contra o disposto na CF. " +
                    "Porém, da forma que se expôs no enunciado, trata-se de uma " +
                    "interpretação conforme 'sem' redução de texto.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(134L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("De acordo com o princípio interpretativo " +
                    "da máxima efetividade ou da eficiência das normas " +
                    "constitucionais, devem ter prioridade, quando da resolução de " +
                    "problemas jurídico-constitucionais, critérios que favoreçam a " +
                    "integração política e social.");
            question.setComentario("Errado\nEste seria o princípio do efeito integrador. O princípio da " +
                    "máxima efetividade visa interpretar a CF no sentido de atribuir " +
                    "à norma constitucional a maior efetividade possível, ou seja, " +
                    "devese atribuir a uma norma constitucional o sentido que " +
                    "lhe dê maior eficácia.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(135L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("Pelo método de interpretação " +
                    "hermenêutico-concretizador, a análise da norma constitucional " +
                    "não se fixa na sua literalidade, mas decorre da realidade social e " +
                    "dos valores insertos no texto constitucional, de modo que a " +
                    "constituição deve ser interpretada considerando-se seu " +
                    "dinamismo e constante renovação, no compasso das " +
                    "modificações da vida da sociedade.");
            question.setComentario("Errado\nA questão tenta induzir o candidato ao erro, colocando " +
                    "um excesso de informações que nada tem haver com o referido " +
                    "princípio. As informações estão associadas ao chamado método " +
                    "científico-espiritual. Usar o método hermenêutico-concretizador " +
                    "significa partir de uma pré-compreensão da norma em abstrato, " +
                    "e depois desta pré-compreensão buscar concretizá-la para se " +
                    "alcançar o caso concreto da realidade.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(136L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("Pelo princípio da " +
                    "concordância prática ou harmonização, os órgãos encarregados " +
                    "de promover a interpretação da norma constitucional não podem " +
                    "chegar a resultado que altere o esquema organizatório-funcional constitucionalmente estabelecido pelo legislador constituinte " +
                    "originário.");
            question.setComentario("Errado\nEste seria o princípio da conformidade funcional. " +
                    "Concordância prática ou harmonização seria a situação em que, " +
                    "ocorrendo colisão entre princípios, eles deverão ser ponderados, " +
                    "assim, um deverá sobressair sobre o outro no caso concreto, " +
                    "sem que, porém, se anulem.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(137L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("De acordo com " +
                    "o princípio da força normativa da constituição, defendida por " +
                    "Konrad Hesse, as normas jurídicas e a realidade devem ser " +
                    "consideradas em seu condicionamento recíproco. A norma " +
                    "constitucional não tem existência autônoma em face da " +
                    "realidade. Para ser aplicável, a CF deve ser conexa à realidade " +
                    "jurídica, social e política, não sendo apenas determinada pela " +
                    "realidade social, mas determinante em relação a ela.");
            question.setComentario("Correto\nDiz-se que Konrad Hesse reviu as teorias de Lassale e " +
                    "apontou uma flexibilização a elas. Segundo Hesse a Constituição " +
                    "não poderia ser ignorada, ela tem a sua força normativa e " +
                    "embora fosse condicionada pela sociedade, também se deveria se " +
                    "impor sobre ela.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(138L);
            question.setTema("Direito Constitucional");
            question.setEnunciado("A interpretação conforme a Constituição " +
                    "determina que, quando o aplicador de determinado texto legal se " +
                    "encontrar frente a normas de caráter polissêmico ou, até mesmo, " +
                    "plurissignificativo, deve priorizar a interpretação que possua um " +
                    "sentido em conformidade com a Constituição. Por conseguinte, " +
                    "uma lei não pode ser declarada inconstitucional,quando puder " +
                    "ser interpretada em consonância com o texto constitucional.");
            question.setComentario("Correto\nA interpretação conforme a Constituição, ou " +
                    "simplesmente 'interpretação conforme' é uma maneira de salvar " +
                    "uma lei aparentemente inconstitucional. Ou seja, fixa-se um " +
                    "interpretação à norma para que o sentido esteja de acordo com o " +
                    "texto constitucional, e impede-se também que a norma seja " +
                    "aplicada de uma forma inconstitucional. A interpretação " +
                    "conforme só pode ser aplicada quando estivermos diante de uma " +
                    "norma polissêmica, ou seja, que admite vários significados. Não " +
                    "se pode dar interpretação conforme a normas de sentido " +
                    "unívoco.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            //Parei na 110 Apostila 4
        }
        return lquestion;
    }
}

