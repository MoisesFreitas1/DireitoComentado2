package com.preparaxcursos.direitocomentado.ListViews;

import com.preparaxcursos.direitocomentado.Models.Question;
import com.preparaxcursos.direitocomentado.R;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Moises on 05/03/17.
 */

public class LAdm {
    private static List<Question> lquestion = new ArrayList<>();

    public static List<Question> getLquestion() {
        if (lquestion.isEmpty()) {
            Question question = new Question();
            question.setId(1L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Quando se fala em vedação de imposição de obrigações, restrições e sanções em medida superior àquelas estritamente necessárias ao atendimento do interesse público, está-se referindo ao princípio da proporcionalidade.");
            question.setComentario("Correto\n O princípio da proporcionalidade exige da Administração Pública o exercício moderado da competência, observados os limites do ordenamento em face da realidade social. De acordo com o referido princípio, ao praticar determinada conduta, o agente público deve tornar concreto o máximo de direitos fundamentais, evitando o sacrifício desnecessário de qualquer prerrogativa assegurada ao cidadão pelo ordenamento vigente. A proporcionalidade se desdobra nos postulados da necessidade, adequação e proporcionalidade em sentido restrito. Para que a medida seja necessária, o Poder Público deverá escolher a conduta que implicar menor restrição aos direitos daquele que for atingido pelo comportamento estatal. Há adequação quando uma determinada medida consiste no meio certo para levar à finalidade almejada. Por fim, a proporcionalidade em sentido restrito é a ponderação que deve haver entre o gravame imposto e o benefício trazido, ou seja, deve haver um equilíbrio entre os eventuais danos causados ao cidadão e as vantagens decorrentes do atingimento da finalidade pública. Portanto, correta a questão ao definir o princípio da proporcionalidade como aquele que veda imposição de obrigações, restrições e sanções em medida superior àquelas estritamente necessárias ao atendimento do interesse público.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O ato do Presidente da República que atentar contra a probidade na administração constitui crime de responsabilidade.");
            question.setComentario("Correto\n A probidade está ligada a idéia de honestidade na Administração Pública. Não basta a legalidade formal, restrita, da atuação administrativa, é preciso também a observância de princípios éticos, de lealdade, de boa-fé, de regras que assegurem a boa administração e a disciplina interna na Administração Pública. A Carta Magna prevê como crime de responsabilidade os atos do Presidente da República que atentem contra a probidade na Administração, fato que enseja sua destituição do cargo (CF/1988, art. 85, V).");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(3L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O dever de prestar contas abrange a prestação de contas aos munícipes das atividades particulares do administrador público.");
            question.setComentario("Errado\n O dever de prestar contas é inerente à Administração Pública, pois tem um caráter de um múnus público, ou seja, de um encargo assumido pelo gestor de bens e interesses em relação à comunidade. Desse encargo, surge o dever de todo administrador público prestar contas de sua gestão administrativa. Essa prestação de contas abrange não só dinheiros públicos, mas todos os atos do governo e da administração. Atinge tanto os administradores de entidades e órgãos públicos, como também os de entes paraestatais e os particulares que recebem subvenções estatais para aplicação determinada (CF/1988, art. 70, parágrafo único). A Carta Magna prevê que essa prestação de contas seja feita ao órgão legislativo de cada Estado- membro, através do seu respectivo Tribunal de Contas, órgão auxiliar do Poder Legislativo. O erro da questão está em asseverar que a prestação de contas abrange as atividades particulares do administrador público quando, na verdade, abrange apenas as suas atividades públicas.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(4L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A obrigação do administrador público de agir com retidão, lealdade, justiça e honestidade, diz respeito ao dever de eficiência.");
            question.setComentario("Errado\n A obrigação do administrador público de agir com retidão, lealdade, justiça e honestidade, diz respeito ao dever de probidade, boa-fé e moralidade administrativa que é o princípio que orienta, dentro de um Estado de Direito, o agente a dirigir suas decisões administrativas de forma legítima ao interesse público, fundando-as impreterivelmente na Lei e na Ética Administrativa.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(5L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O dever da eficiência abrange a produtividade do ocupante do cargo ou função, mas não tem relação com a qualidade do trabalho desenvolvido.");
            question.setComentario("Errado\n A Emenda Constitucional nº 19/1988 alterou a redação do caput do art. 37 da Carta Magna e consagrou expressamente a eficiência como princípio vinculante da Administração Pública. Tal princípio vincula os comportamentos positivos da Administração em favor dos cidadãos, cabe ao Estado otimizar resultados e maximizar as vantagens de que se beneficiam os administrados, bem como uma maior produtividade e melhor qualidade nas atividades. Assim, O dever da eficiência abrange a produtividade do ocupante do cargo ou função, e tem relação com a qualidade do trabalho desenvolvido.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(6L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Pela inobservância do dever de probidade que caracterize improbidade administrativa, o administrador público está sujeito, dentre outras sanções, à perda da função pública, porém não à suspensão dos direitos políticos.");
            question.setComentario("Errado\n Em qualquer ato de improbidade o seu responsável estará sujeito à perda da função pública; perda dos bens ou valores acrescidos ilicitamente ao patrimônio e ressarcimento integral do dano. De acordo com a natureza do ato de improbidade praticado, o agente também estará sujeito à pagamento de multa civil; proibição de contratar com o Poder Público ou receber benefícios ou incentivos fiscais ou creditícios, direta ou indiretamente, ainda que por intermédio de pessoa jurídica da qual seja sócio majoritário e, ainda, à suspensão dos direitos políticos (Lei nº 8.429/92, art. 12). Com a tabela abaixo fica mais fácil memorizar as penalidades:");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(7L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O princípio da eficiência com o advento da Emenda Constitucional nº 19/98 ganhou acento constitucional, passando a sobrepor-se aos demais princípios gerais aplicáveis à Administração.");
            question.setComentario("Errado\n De fato, a Emenda Constitucional nº 19/1988 alterou a redação do caput do art. 37 da Carta Magna e consagrou expressamente a eficiência como princípio vinculante da Administração Pública. No entanto, a eficiência é princípio que se soma aos demais princípios impostos à Administração, não podendo sobrepor-se a nenhum deles, especialmente ao da legalidade, sob pena de sérios riscos à segurança jurídica e ao próprio Estado de Direito.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(8L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O princípio da moralidade é considerado um princípio prevalente e a ele se subordinam o princípio da legalidade e o da eficiência.");
            question.setComentario("Errado\n O princípio da moralidade se soma aos demais princípios impostos à Administração, não podendo sobrepor-se a nenhum deles, especialmente ao da legalidade, sob pena de sérios riscos à segurança jurídica e ao próprio Estado de Direito.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(9L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Os princípios da Administração Pública se aplicam, em igual medida e de acordo com as ponderações determinadas pela situação concreta, a todas as entidades integrantes da Administração direta e indireta.");
            question.setComentario("Correto\n A administração pública direta (União, Estado, Município e DF) e indireta (Autarquia, Fundação, Sociedade de Economia Mista e Empresa Pública) de qualquer dos Poderes da União, dos Estados, do Distrito Federal e dos Municípios obedecerá aos princípios de legalidade, impessoalidade, moralidade, publicidade e eficiência (CF/1988, art. 37, caput).");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(10L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Os princípios da Administração Pública se aplicam também às entidades integrantes da Administração indireta, exceto àquelas submetidas ao regime jurídico de direito privado.");
            question.setComentario("Errado\n Assevera a Carta Magna que A administração pública direta e indireta de qualquer dos Poderes da União, dos Estados, do Distrito Federal e dos Municípios obedecerá aos princípios de legalidade, impessoalidade, moralidade, publicidade e eficiência (CF/1988, art. 37, caput). Assim, não há uma distinção entre as entidades de direito público (Autarquias e Fundações Públicas) e as de direito privado (Empresas Públicas, Sociedades de Economia Mista e Fundações Públicasde Direito Privado). Dessa forma, todas indistintamente deverão obedecer aos princípios da Administração Pública.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(11L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Os princípios do contraditório e da ampla defesa aplicam-se nos processos administrativos, dentre outros casos, sempre que houver a possibilidade de repercussão desfavorável na esfera jurídica dos envolvidos.");
            question.setComentario("Correto\n Os princípios do contraditório e da ampla defesa saíram do âmbito do Direito Processual para o Direito Administrativo (Lei nº 9.784/99, art. 2º), considerando que a Carta Magna estabelece hoje expressamente esses princípios para o processo administrativo. Assevera a Carta Magna que em processo judicial ou administrativo, e aos acusados em geral são assegurados o contraditório e a ampla defesa, com os meios e recursos a ela inerentes (CF/1988, art. 5º, LIV). Aplicando tais princípios, a Administração Pública está obrigada a dar ciência da existência do processo e de seu conteúdo ao interessado, isso impede que o processo de tomada de decisão pelo Poder Público seja um procedimento arbitrário. O contraditório e a ampla defesa são necessários para garantir ao atingido o direito de participar, em especial quando a repercussão for desfavorável ao envolvido conforme aduz a assertiva.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(12L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O princípio constitucional da eficiência, que rege a Administração Pública, apresenta-se em nível materialmente superior ao princípio da legalidade, uma vez que autoriza a Administração Pública a adotar medidas formalmente em desacordo com a lei em prol do aumento de produtividade e agilidade.");
            question.setComentario("Errado\n A eficiência é princípio que se soma aos demais princípios impostos à Administração e não se encontra em nível superior a qualquer outro princípio, especialmente ao da legalidade, sob pena de sérios riscos à segurança jurídica e ao próprio Estado de Direito. Ademais, tal princípio não autoriza a Administração Pública a adotar medidas formalmente em desacordo com a lei uma vez que esta só pode fazer aquilo que a lei autoriza ou determina, instituindo-se um critério de subordinação à lei. Assim, a atividade administrativa deve não apenas ser exercida sem contraste com a lei, mas, inclusive, só pode ser exercida nos termos da autorização contida no sistema legal.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(13L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O princípio da supremacia do interesse público sobre o privado autoriza a Administração a impor restrições aos direitos dos particulares, independentemente de lei.");
            question.setComentario("Errado\n É em razão do interesse público que a Administração tem posição privilegiada em face dos administrados, com prerrogativas que não são extensíveis aos particulares. A desapropriação é um exemplo da forma de manifestação desse princípio, tal instituto permite que o Estado adquira a propriedade do particular, independentemente da sua vontade, tendo como fundamento uma razão de interesse público (CF/1988, art. 5º, XXIV). É interessante observar que por meio de tal princípio a Administração Pública atinge direitos individuais e impõe restrições aos particulares, mas sempre mediante lei uma vez que a validade da atividade administrativa fica condicionada à observância da norma legal.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(14L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O princípio da eficiência autoriza as sociedades de economia mista que atuam no domínioeconômico a contratarem seusempregados mediante processo seletivo simplificado, observados os parâmetros de mercado.");
            question.setComentario("Errado\n A eficiência exige que a atividade administrativa seja exercida com presteza, perfeição e rendimento funcional. Consiste na busca de resultados práticos de produtividade, de economicidade, com a conseqüente redução de desperdícios do dinheiro público. Diante disso, seria contraditório que tal princípio autorizasse a contratação de pessoal para qualquer ente da Administração Pública (direta ou indireta, prestador de serviço público ou explorador de atividade econômica) por meio de processo seletivo simplificado. O concurso público é uma exigência constitucional (CF/1988, art. 37, II) e deve ser observado por todos os entes que compõem a Administração Pública.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(15L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O princípio da publicidade obriga as entidades integrantes da Administração direta e indireta a publicarem extrato dos contratos celebrados.");
            question.setComentario("Correto\n O princípio da publicidade é a divulgação dos atos do Poder Público, com a finalidade do conhecimento público, se a Administração é pública, público deverão ser os seus atos. O ato administrativo, como todo ato jurídico, tem na sua publicação o início de sua existência no mundo jurídico, irradiando, a partir de então, seus efeitos legais, produzindo, assim, direitos e deveres. Assim, pode-se dizer que a publicidade é condição de eficácia do ato administrativo, este só goza de imperatividade e torna-se operante a partir da sua divulgação oficial, um exemplo claro disso é a regra trazida pela Lei de Licitações ao determinar que é condição indispensável de eficácia dos contratos administrativos, a publicação de seu extrato. Portanto, o contrato não publicado poderá até ser válido, mas não produzirá os seus efeitos enquanto não for publicado (Lei nº 8.666/93, art. 61, parágrafo único).");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(16L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O princípio da legalidade determina que todos os atos praticados pela Administração devem contar com autorização legal específica");
            question.setComentario("Errado\n Pelo princípio da legalidade o administrador só poderá fazer aquilo que a lei autoriza ou permite. No entanto, tal princípio não exclui a atividade discricionária do administrador uma vez que a Administração em certos casos terá que usar a discricionariedade para efetivamente atender à finalidade legal e, como conseqüência, atender ao princípio da legalidade. É interessante observar que discricionariedade não se confunde com arbitrariedade, esta é ilegal, ato praticado fora dos limites da lei. Já aquela é liberdade de ação dentro da lei.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(17L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O princípio da moralidade é subsidiário ao princípio da legalidade, de forma que uma vez atendido este último considera- se atendido também o primeiro.");
            question.setComentario("Errado\n Nenhum princípio é subsidiário do outros, todos têm existência autônoma. O princípio da moralidade nada tem de subsidiário, ao contrário. A importância dada a ele é tão grande que os atos que atentem aos deveres de honestidade e lealdade são tipificados como atos de improbidade, sujeitando o seu infrator às penas da Lei nº 8.429/92, tais como suspensão dos direitos políticos, perda do cargo ou função etc. É importante registrar que o fato de o administrador seguir a lei não significa, necessariamente, que agiu com moralidade. A conduta de acordo com o princípio da moralidade até se presume, mas não necessariamente praticar um ato dentro da legalidade implica dizer que ele também foi moral.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(18L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Dentre os princípios básicos da Administração, NÃO se inclui o da celeridade da duração do processo.");
            question.setComentario("Correto\n Os princípios básicos da Administração são aqueles expressos no caput do art. 37 da Constituição. Após a promulgação da EC 19/1998, cinco passaram a ser esses princípios, também chamados de explícitos, a saber: legalidade, impessoalidade, moralidade, publicidade e eficiência (este último acrescentado pela emenda referida). A EC nº45, chamada Reforma do Poder Judiciário, introduziu o inciso LXXVIII, ao art. 5º da Carta Magna, afirmando que “a todos, no âmbito judicial e administrativo, são assegurados a razoável duração do processo e os meios que garantam a celeridade da sua tramitação”. É interessante notar que o princípio da eficiência traz ínsita a idéia de celeridade e simplicidade, sem procrastinações, sem delongas, sem descumprimento de prazos, e outros meios que possam impedir que o processo cumpra sua finalidade, consubstanciada na prática do ato decisório final. Enfim, a celeridade é o sentido dado à eficiência quando da aplicação ao processo administrativo.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(19L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Dentre os princípios aos quais a Administração Pública deve obedecer, expressamente previstos na Lei nº 9.784/1999, NÃO se inclui o da obrigatoriedade.");
            question.setComentario("Correto\n Os princípios básicos da Administração são aqueles expressos no caput do art. 37 da Constituição. Após a promulgação da EC 19/1998, cinco passaram a ser esses princípios, também chamados de explícitos, a saber: legalidade, impessoalidade, moralidade, publicidade e eficiência (este último acrescentado pela emenda referida). A Lei nº 9.784/99, que trata dos processos administrativos no âmbito federal, também incluiu, em seu art. 2º, a eficiência no rol dos princípios que informam a Administração Pública, juntamente com os princípios da legalidade, da finalidade, da motivação, da razoabilidade, da proporcionalidade, da moralidade, da ampla defesa, do contraditório, da segurança jurídica e do interesse público.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(20L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A publicidade, como um dos princípios básicos da Administração, deve ser observada em todo e qualquer ato administrativo, sem exceção.");
            question.setComentario("Errado\n A publicidade, como princípio básico da Administração Pública, abrange toda a atuação estatal, seja no aspecto da divulgação oficial dos seus atos, seja na divulgação da conduta interna dos seus agentes. A desobediência ao dever de publicar os atos oficiais pode caracterizar improbidade administrativa (Lei nº 8.429/92, art. 11, IV). No entanto, a própria Carta Magna traz exceções a tal princípio, a saber: questões de segurança da sociedade e do Estado (art. 5º, XXXIII), intimidade das pessoas ou interesse social (art. 5º, X e LX). Um exemplo seria o art. 150, da Lei nº 8.112/90, que estatui que a comissão do processo disciplinar exerceráas suas atividades com independência e imparcialidade, assegurado o sigilo necessário à elucidação do fato ou exigido pelo interesse da Administração.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(21L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A publicidade, como um dos princípios básicos da Administração, é elemento formativo do ato.");
            question.setComentario("Errado\n A publicidade não é elemento formativo do ato administrativo, é condição de sua eficácia. Dessa forma, mesmo os atos irregulares não se convalidam com a publicação e nem os regulares a dispensam para a sua exeqüibilidade, quando a lei a exige.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(22L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A publicidade, como um dos princípios básicos da Administração, é a divulgação oficial do ato para conhecimento público e início de seus efeitos externos.");
            question.setComentario("Correto\n O princípio da publicidade é a exigência de publicação em órgão oficial como requisito de eficácia dos atos administrativos que devam produzir efeitos externos e dos atos que impliquem ônus para o patrimônio público. Assim, a publicidade não está ligada à validade do ato, mas à sua eficácia, isto é, enquanto não publicado, o ato não está apto a produzir os seus efeitos.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(23L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A publicidade, como um dos princípios básicos da Administração, é obrigatória apenas para os órgãos a Administração direta, sendo facultativa para as entidades da Administração indireta.");
            question.setComentario("Errado\n Os princípios básicos orientam toda a atividade da Administração Pública, assim, seja a Administração Pública Direta (União, Estado, Município, DF), seja a Administração Pública Indireta (Autarquia, Fundação, Sociedade de economia mista e empresa pública) deverão obedecer aos princípios previstos na CF/1988, art. 37, caput.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(24L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A publicidade, como um dos princípios básicos da Administração também pode ser usada para a promoção pessoal de autoridades ou servidores públicos, salvo no período eleitoral.");
            question.setComentario("Errado\n Não se deve confundir publicidade com propaganda pessoal, ademais, própria Carta Magna proíbe a publicidade que represente promoção pessoal do administrador “a publicidade dos atos, programas, obras, serviços em campanhas dos órgãos públicos deverá ter caráter educativo, informativo ou de orientação social, dela não podendo constar nomes, símbolos ou imagens que caracterizem promoção pessoal de autoridades ou servidores públicos” (art. 37, § 1º, CF). Assim, a possibilidade de vinculação do conteúdo da divulgação com o partido político a que pertença o titular do cargo público viola o princípio da impessoalidade e desnatura o seu caráter educativo, informativo ou de orientação que constam do comando constitucional.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(25L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("NÃO é situação que configura nepotismo, a sofrer a incidência da Súmula Vinculante nº 13, editada pelo Supremo Tribunal Federal, a nomeação de cônjuge de Governador para cargo de Secretário de Estado.");
            question.setComentario("Correto\n A súmula vinculante nº 13 do STF veda o nepotismo em todos os Poderes de quaisquer dos entes federativos: “A nomeação de cônjuge, companheiro ou parente em linha reta, colateral ou por afinidade, até o terceiro grau, inclusive, da autoridade nomeante ou de servidor da mesma pessoa jurídica, investido em cargo de direção, chefia ou assessoramento, para o exercício de cargo em comissão ou de confiança, ou, ainda, de função gratificada na Administração Pública direta e indireta, em qualquer dos Poderes da União, dos Estados, do Distrito Federal e dos Municípios, compreendido o ajuste mediante designações recíprocas, viola a Constituição”. Registre-se que o STF não estendeu os ditames da referida súmula aos agentes políticos, tendo em vista a natureza política do cargo exercido.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(26L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O princípio da eficiência, introduzido pela Emenda Constitucional nº 19/1998, é o mais moderno princípio da função administrativa e exige resultados positivos para o serviço público e satisfatório atendimento das necessidades da comunidade e de seus membros.");
            question.setComentario("Correto\n O princípio da eficiência vincula os comportamentos positivos da Administração em favor dos cidadãos, bem como sua atividade interna instrumental da consecução das atuações finalísticas. Cabe ao Estado otimizar resultados e maximizar as vantagens de que se beneficiam os administrados, mediante uma melhor utilização dos recursos públicos, substituição de mecanismos obsoletos, bem como uma maior produtividade e melhor qualidade nas atividades. Para tanto, é mister que haja uma gestão com efetiva participação democrática, capaz de, senão evitar, diminuir a burocratização e lentidão administrativas e, ao mesmo tempo, de obter um maior rendimento funcional e rentabilidade social, sem desperdício de material ou de recursos humanos.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(27L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Quanto ao princípio da motivação, não se admite a chamada motivação aliunde, consistente em declaração de concordância com fundamentos de anteriores pareceres,informações, decisões ou propostas.");
            question.setComentario("Errado\n A motivação aliunde é a declaração de concordância com fundamentos de anteriores pareceres, informações, decisões ou propostas, que, neste caso, serão parte integrante do ato. A Lei nº 9.784/99, art. 50, § 1º, permite expressamente a referida motivação.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(28L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A publicidade é elemento formativo do ato administrativo, ou seja, sua divulgação oficial para conhecimento público é requisito imprescindível à própria formação do ato e conseqüente produção de efeitos jurídicos.");
            question.setComentario("Errado\n A publicidade não é elemento formativo do ato administrativo, é condição de sua eficácia. Dessa forma, mesmo os atos irregulares não se convalidam com a publicação e nem os regulares a dispensam para a sua exeqüibilidade, quando a lei a exige.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(29L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("NÃO representa um dos princípios básicos da administração pública a pessoalidade.");
            question.setComentario("Correto\n É princípio básico da Administração a impessoalidade, e não, apessoalidade que é clara violação à Carta Magna. O respeito à impessoalidade impede que o ato administrativo seja praticando visando a interesses do agente ou de terceiros, devendo ater-se à vontade da lei, comando geral e abstrato em essência.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(30L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Reiteração dos julgamentos num mesmo sentido, influenciando a construção do Direito, sendo também fonte do Direito Administrativo, diz respeito à jurisprudência.");
            question.setComentario("Correto\n A jurisprudência é representada pelas reiteradas decisões judiciais em um mesmo sentido, é considerada fonte secundária do direito administrativo e influencia a construção e a consolidação deste.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(31L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O princípio da autotutela diz respeito ao controle que a Administração direta exerce sobre as entidades da Administração indireta.");
            question.setComentario("Errado\n O princípio da autotutela estabelece que a Administração Pública pode controlar os seus próprios atos, seja para anulá-los, quando ilegais ou revogá-los, quando inconvenientes ou inoportunos, independentemente de revisão pelo Poder Judiciário. Tal princípio está sedimentado nas súmulas nº 346 “A Administração pode anular os seus próprios atos, quando eivados de vícios que os tornem ilegais, porque deles não se originam direitos” e nº 473 “A Administração pode anular os seus próprios atos, quando eivados de vícios que os tornem ilegais, porque deles não se originam direitos; ou revogá-los, por motivo de conveniência ou oportunidade, respeitados os direitos adquiridos, e ressalvada, em todos os casos, a apreciação judicial”. Por fim, a Lei nº 9.784/99, em seu art. 54 afirma que “A Administração deve anular seus próprios atos, quando eivados de vício de legalidade, e pode revogá-los por motivo de conveniência ou oportunidade, respeitados os direitos adquiridos”.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(32L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Pelo princípio da finalidade, impõe-se à Administração Pública a prática, e tão só essa, de atos voltados para o interesse público.");
            question.setComentario("Correto\n O princípio da finalidade, considerado por muitos administrativistas como princípio da impessoalidade, impõe ao administrador público que só pratique o ato para o seu fim legal de forma impessoal. A finalidade de todo ato administrativo é sempre o interesse público, o ato que se apartar desse objetivo sujeitar-se-á a invalidação por desvio de finalidade, que a Lei de Ação Popular conceituou como o “fim diverso daquele previsto, explícita ou implicitamente, na regra de competência” do agente (Lei nº 4.717/65, art. 2º, parágrafo único, “e”).");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(33L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O princípio da supremacia do interesse público não significa que o interesse público deva prevalecer sobre o interesse privado.");
            question.setComentario("Errado\n Ao contrário do que afirma a questão, o princípio da supremacia do interesse público significa que este interesse prevalece sobre o interesse privado. Assegura-se com ele a prevalência do bem comum na hipótese de eventual conflito com interesses individuais de determinados grupos privados ou de um particular. A supremacia do interesse público viabiliza intervenções do Estado em relação ao exercício de direitos e liberdades individuais como ocorre, por exemplo, com a desapropriação, fundada no bem-estar geral. A superioridade aqui se refere ao interesse público fundado na utilidade social do comportamento ou omissão administrativa em questão.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(34L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Pelo princípio da publicidade é obrigatória a divulgação de atos, contratos e outros instrumentos celebrados pela Administração pública, mesmo que relacionados com a segurança nacional ou declarados sigilosos pela autoridade.");
            question.setComentario("Errado\n A publicidade torna possível o efetivo controle dos atos administrativos e assegura a transparência necessária para se tentar contornar os riscos inerentes ao sigilo. Outrossim, o agente público exerce poder de titularidade alheia, devendo à sociedade prestar contas da forma pela qual cumpriu o referido munus. Na seara administrativa, só se admite sigilo quando imprescindível à segurança da sociedade e do Estado. A CF/1988, art. 5º, XXXIII, fundamenta a ausência de publicidade em contratações que envolvam questões sigilosas como, por ex., é o caso da segurança nacional, quando há claramente outros interesses públicos concretamente envolvidos que transcendem o livre e amplo conhecimento dos atos administrativos, justificando a restrição ao princípio da publicidade.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(35L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Nenhum outro princípio deve ser observado pela Administração Pública além daqueles expressamente previstos na Constituição Federal.");
            question.setComentario("Errado\n Os princípios fundamentais orientadores de toda a atividade da Administração Pública encontram-se, explícita ou implicitamente, no texto da Carta Magna. Muitas leis citam ou enumeram princípios administrativos; todos encontram-se expressos ou são decorrência lógica das disposições constitucionais referentes à atuação da Administração Pública em geral. Portanto, encontramos princípios que deverão ser observados pelo Poder Público dentro e fora da Carta Magna,tais como razoabilidade, proporcionalidade, segurança jurídica, motivação expressos na Lei nº 9.784/99, art. 2º.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(36L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A regra geral de proibição de greve nos serviços públicos, a faculdade de a Administração utilizar equipamentos e instalações de empresa que com ela contrata, e a necessidade de institutos com a suplência, a delegação e a substituição, são consequências do princípio da continuidade do serviço público.");
            question.setComentario("Correto\n Por esse princípio entende-se que o serviço público, atividade da Administração Pública em sentido material, não pode parar. De tal princípio decorrem conseqüências importantes, tais como: limitações ao exercício do direito de greve no serviço público (CF/1988, art. 37, VII, determina que o direito de greve será exercido “nos termos e nos limites definidos em lei específica”); necessidade de institutos como a suplência, a delegação e a substituição para preencher as funções públicas temporariamente vagas; a impossibilidade, para quem contrata com a Administração, de invocar a exceptio non adimpleti contractus nos contratos que tenham por objeto a execução do serviço público; a faculdade que se reconhece à Administração de utilizar os equipamentos e instalações da empresa que com ela contrata, para assegurar a continuidade do serviço e, com o mesmo objetivo, a possibilidade de encampação da concessão de serviço público.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(37L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("São princípios da Administração Pública expressamente previstos na Constituição da República Federativa do Brasil, especialidade, moralidade e autotutela.");
            question.setComentario("Errado\n A Constituição de 1988 faz expressa menção a alguns princípios a que se submete a Administração Pública Direta e Indireta, a saber: legalidade, impessoalidade, moralidade, publicidade e eficiência. Assim, especialidade e autotutela não são princípios com previsão expressa na Carta Magna. A autotutela é uma decorrência do princípio da legalidade; se a Administração Pública está sujeita à lei, cabe-lhe, por conseqüência, o controle da legalidade. Tal princípio tem previsão nas súmulas nº 346 e 473, STF. Já o princípio da especialidade decorre dos princípios da indisponibilidade e da legalidade, ele está ligado à idéia da descentralização, ou seja, por meio desse fenômeno, a administração direta cria a administração indireta como forma de descentralizar a prestação de serviços e atividades, com vistas à especialização de função, assim, as pessoa da indireta ficam vinculadas às finalidades para as quais foram criadas.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(38L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A observância de medidas provisórias, pela Administração, ofende o princípio da legalidade porque elas não são consideradas lei formal.");
            question.setComentario("Errado\n Ao contrário do que foi afirmado na assertiva, a Administração Pública deverá obedecer às medidas provisórias, uma vez que elas perfazem no direito pátrio uma categoria especial de atos normativos primários emanados do Executivo, com força, eficácia e poder de lei. Assim, a medida provisória não pode ser considerada exceção à legalidade administrativa, ao contrário, trata-se de parte integrante do sistema jurídico vinculante do Poder Público e dos cidadãos, adequada às especificidades das realidades excepcionais em que incidirão.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(39L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A Administração poderá praticar os atos permitidos pela lei e, em caso de omissão, estará legitimada a atuar se for habilitada a tanto por decreto do Chefe do Poder Executivo.");
            question.setComentario("Errado\n A relação que o particular tem com a lei é de liberdade e autonomia da vontade, de modo que os ditames legais operam fixando limites negativos à atuação privada. Dessa forma, o silêncio da lei quanto ao regramento de determinada conduta é recebido na esfera particular como permissão para agir. Ao contrário, a relação do agente com a lei é de subordinação, assim, a ausência de disciplina legal sobre certo comportamento significa no âmbito da Administração Pública uma proibição de agir. De acordo com a CF/88, art. 84, IV, compete ao Presidente da República “sancionar, promulgar e fazer publicar as leis, bem como expedir decretos e regulamentos para a sua fiel execução”. Evidencia-se, destarte, que mesmo os decretos, inclusive quando expedem regulamentos, só podem ser produzidos para ensejar execução fiel da lei, ou seja, pressupõem sempre uma dada lei da qual sejam os fiéis executores.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(40L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A prática de atos por razões de conveniência e oportunidade é violadora do princípio da legalidade, uma vez que o mérito do ato administrativo nestes casos não é definido em lei.");
            question.setComentario("Errado\n A prática de atos por razões de conveniência e oportunidade, ou seja, atos discricionários, não é violadora do princípio da legalidade, uma vez que o mérito do ato administrativo apesar de não estar definido em lei, é limitado por ela. Ato discricionário não se confunde com ato arbitrário. Arbitrário é o ato praticado fora dos padrões da legalidade, exorbitando os limites de competência definidos pela lei. Já o ato discricionário, ao contrário, é exercido dentro dos limites da legalidade.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(41L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O controle de legalidade interno dos atos administrativos deve ser preocupação constante da Administração, como forma de atendimento do interesse público na preservação desta legalidade.");
            question.setComentario("Correto\n Pelo controle de legalidade verifica-se se o ato foi praticado em conformidade com o ordenamento jurídico. Faz-se o confronto entre uma conduta administrativa e uma norma jurídica, que pode estar na Constituição, na lei ou em outro ato normativo primário, ou mesmo em ato administrativo de conteúdo impositivo para a própria Administração. Fazer o controle de legalidade desses atos é um dever a ser seguido pela Administração Pública para preservar o interesse público e, por conseqüência, o princípio da legalidade.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(42L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O reconhecimento de circunstâncias excepcionais, como estado de sítio e estado de defesa, autoriza a Administração a praticar atos discricionários e arbitrários, isentos de controle jurisdicional.");
            question.setComentario("Errado\n A integral vigência do princípio da legalidade pode sofrer transitória constrição perante circunstâncias excepcionais mencionadas expressamente na Carta Magna. Isto sucede em hipóteses nas quais a Constituição faculta ao Presidente da República que adote providências incomuns e proceda na conformidade delas para enfrentar contingências excepcionais. É o caso das medidas provisórias (CF/88, art. 62, parágrafo único), estado de defesa (CF/88, art. 136) e estado de sítio (CF/88, art. 137 a 139). Tais atos são todos pautados pela legalidade e passíveis de correção judicial.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(43L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Determinado agente público, realizando fiscalização, verifica tratar-se de caso de aplicação de multa administrativa. Tal agente, de ofício, lavra o auto respectivo. Considerando essa situação à luz de princípios que regem a Administração Pública, é correto afirmar que, em nome do princípio da autotutela, a Administração pode anular a autuação, caso nela constate vícios quanto à legalidade.");
            question.setComentario("Correto\n O princípio da autotutela consagra o controle interno que a Administração Pública exerce sobre os seus próprios atos. Como conseqüência da sua independência funcional, a Administração não precisa recorrer ao Poder Judiciário para anular seus atos ilegais e revogar os inconvenientes que pratica. Consiste no poder-dever de retirada dos atos administrativos por meio da anulação e da revogação. Assim pela autotutela, a Administração anula os ilegais e revoga os inconvenientes e inoportunos. Por fim, convém lembrar que autotutela não se confunde com tutela administrativa ou tutela ministerial. Esta última é o poder de supervisão ministerial exercido pela Administração Direta sobre as entidades da Administração Indireta (Decreto-Lei nº 200/67, art. 19).");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(44L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O princípio ou regra da Administração Pública que determina que osatos realizados pela Administração Pública, ou por ela delegados, são imputáveis não ao funcionário que os pratica, mas ao órgão ou entidade administrativa em nome do qual age o funcionário é o da impessoalidade.");
            question.setComentario("Correto\n A atuação dos agentes públicos é imputada ao Estado, significando um agir impessoal da Administração. Assim, as realizações não devem ser atribuídas à pessoa física do agente público, mas à pessoa jurídica estatal a que estiver ligado. Assim, em regra, a responsabilidade pela reparação de danos causados no exercício regular da função administrativa é do Estado, e não do agente que realizou a conduta.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(45L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A aplicação dos princípios do devido processo legal e da ampla defesa na esfera administrativa estende-se aos processos administrativos, incluídos os disciplinares.");
            question.setComentario("Correto\n O princípio do contraditório e da ampla defesa tem amparo constitucional: “em processo judicial ou administrativo, e aos acusados em geral são assegurados o contraditório e a ampla defesa, com os meios e recursos a ela inerentes” (CF/88, art. 5º, LV). Assim, está consagrada a exigência de um processo formal regular, realizado conforme a previsão legal, não podendo a Administração Pública proceder contra outrem dentro de um processo administrativo (inclusive no disciplinar), sem oferecer-lhe contraditório e ampla defesa.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(46L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O Município instaurou processo administrativo contra determinado cidadão para cobrança de multa. Recusa-se o servidor municipal a conceder vista dos autos ao cidadão, que desconhece os motivos da autuação. A atitude do servidor é inconstitucional, na medida em que a concessão de vista está abrangida pelos princípios do contraditório e da ampla defesa, assegurados ao administrado no processo administrativo.");
            question.setComentario("Correto\n De acordo com os princípios do contraditório e da ampla defesa, a Administração Pública está obrigada a dar ciência da existência do processo e de seu conteúdo ao interessado. Não basta apenas intimar a parte para manifestar-se, é preciso também ouvi-la e permitir que ela faça a produção de suas provas o que só será possível se ela tiver vista dos autos, garantia também abrangida por tais princípios que têm previsão na Lei n º 9784/99, art. 2º e na CF/88, art. 5º, LIV e LV.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(47L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O mais recente princípio da Administração Pública Brasileira é o da eficiência.");
            question.setComentario("Correto\n O princípio da eficiência ganhou roupagem de princípio constitucional expresso por meio da EC nº 19/98, embora já existisse implicitamente na Lei Maior. Portanto, é o princípio mais recente da Administração Pública.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(48L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O servidor público quando instado pela legislação a atuar de forma ética, não tem que decidir somente entre o que é legal e ilegal, mas, acima de tudo entre o que é honesto ou desonesto.");
            question.setComentario("Correto\n A atividade administrativa, ainda que desempenhada conforme as prescrições legais, não se justifica quando motivada por razões outras que não encontram garantia no interesse público. A norma ou atividade pode estar perfeita do ponto de vista legal, mas moralmente deficiente, caso não represente atitude ética e boa-fé, não sendo útil a adoção desta norma ou atividade. A moralidade consiste, pois, na honestidade, na ética, na boa-fé e na probidade administrativa que devem governar os agentes públicos no trato e na gestão dos negócios coletivos.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(49L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("É necessária a divulgação oficial do ato administrativo para conhecimento público e início de seus efeitos externos.");
            question.setComentario("Correto\n Publicidade é a divulgação oficial do ato para conhecimento público e início de seus efeitos externos. A falta de publicidade, porém, não retira a validade do ato, uma vez que a publicidade não se encontra no campo da validade, mas da eficácia. Portanto, a publicidade representa condição de eficácia dos administrativos, marcando o início da produção de seus efeitos externos, já que ninguém está obrigado a cumprir um ato administrativo se desconhece a sua existência.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(50L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O administrador público está, em toda a sua atividade funcional, sujeito aos mandamentos da lei e às exigências do bem comum.");
            question.setComentario("Correto\n Pelo princípio da legalidade, o administrador público está, em toda a sua atividade funcional, sujeito aos mandamentos da lei. Dessa forma, tal princípio representa a subordinação da Administração Pública à vontade da lei. No mesmo sentido, o princípio da supremacia do interesse público exige que o administrador atue cumprindo às exigências do bem comum, já que o Poder Público é defensor dos interesses coletivos.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(51L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O administrador público deve justificar sua ação administrativa, indicando os fatos que ensejam o ato e os preceitos jurídicos que autorizam sua prática.");
            question.setComentario("Correto\n O motivo é requisito necessário à formação do ato administrativo e a motivação (dever que possui a Administração de justificar seus atos, apontando-lhes os fundamentos de direito e de fato), alçada à categoria de princípio, é obrigatória ao exame de legalidade, da finalidade e da moralidade administrativa.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(52L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Quando se afirma que o particular pode fazer tudo o que a lei não proíbe e que a Administração só pode fazer o que a lei determina ou autoriza, estamos diante do princípio da moralidade.");
            question.setComentario("Errado\n O princípio da moralidade administrativa exige respeito a padrões éticos, de boa-fé, decoro, lealdade, honestidade e probidade incorporados pela prática diária ao conceito de boa administração. Já o princípio da legalidade, afirma que na Administração Pública não há liberdade nem vontade pessoal. Enquanto na administração particular é lícito fazer tudo que a lei não proíbe, na Administração Pública só é permitido fazer o que a lei autoriza.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(53L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A imposição de que o administrador e os agentes públicos tenham sua atuação pautada pela celeridade, perfeição técnica e economicidade traduz o dever de eficiência.");
            question.setComentario("Correto\n Acrescentado no art. 37, caput, da Carta Magna pela EC nº 19/98, o princípio da eficiência foi um dos pilares da Reforma Administrativa que procurou implementar o modelo de administração pública gerencial voltada para um controle de resultados na atuação estatal. Economicidade, redução de desperdícios, qualidade, rapidez, produtividade e rendimento funcional são valores encarecidos pelo princípio da eficiência.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(54L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Em razão do princípio da moralidade o administrador público deve exercer as suas atividades administrativas com presteza, perfeição e rendimento funcional.");
            question.setComentario("Errado\n A questão faz referência ao princípio da eficiência, uma vez que é este que exige do administrador público dever de exercer as suas atividades administrativas com presteza, perfeição e rendimento funcional. Já o princípio da moralidade exige respeito a padrões éticos, de boa-fé, decoro, lealdade, honestidade e probidade.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(55L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Os princípios da segurança jurídica e da supremacia do interesse público não estão expressamente previstos na Constituição Federal.");
            question.setComentario("Correto\n O princípio da supremacia do interesse público e o da indiponibilidade do interesse público são considerados superprincípios, ou seja, deles derivam todos os demais princípios e normas do Direito Administrativo. Já o princípio da segurança jurídica, considerado viga mestra da ordem jurídica, tem previsão na Lei nº 9.784/99, art. 2º. Tais princípios, conforme assevera a assertiva, não têm previsão constitucional, ou seja, são princípios infraconstitucionais. No entanto, isso não significa menor importância diante dos princípios diretamente mencionados na Carta Magna, eles têm a mesma relevância sistêmica daqueles referidos no texto constitucional.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(56L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A publicidade é elemento formativo do ato e serve para convalidar ato praticado com irregularidade quanto à origem.");
            question.setComentario("Errado\n A publicidade é apenas um requisito de eficácia e moralidade do ato. Ela não é elemento formativo do ato. O ato irregular não se regulariza pela sua simples publicação e nem o ato regular dispensa sua publicação quando exigida esta por lei ou regulamento.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(57L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Por força do princípio da publicidade todo e qualquer ato administrativo, sem exceção, deve ser publicado em jornal oficial.");
            question.setComentario("Errado\n A própria Carta Magna traz exceção ao princípio da publicidade, estabelecendo, nesses casos, a garantia do sigilo: CF/88, art. 5º, X, estabelece que são invioláveis a intimidade, a vida privada, a honra e a imagem das pessoas, aplicando a quem as violar o dever de indenizar por danos materiais e morais causados; CF/88, art. 5º, XXXIII, garante o direito à informação, ressalvadas aquelas que sejam imprescindíveis à segurança da sociedade e do Estado, por fim, a CF/88, art. 5º, LX dispõe que a lei poderá restringir a publicidade dos atos processuais quando a defesa da intimidade ou o interesse social o exigirem.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(58L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O princípio da segurança jurídica permite a aplicação retroativa de nova interpretação de norma administrativa.");
            question.setComentario("Errado\n O princípio da segurança jurídica, também chamado de princípio da boa-fé ou proteção à confiança, proíbe a aplicação retroativa de novas interpretações de dispositivos legais e normas administrativas. Tal princípio, previsto na Lei nº 9.784/99, art. 2º, justifica-se pelo fato de ser comum, na esfera administrativa, haver mudança de interpretação de determinadas normas legais, com a conseqüente mudança de orientação, em caráter normativo, vendando, assim, aplicação retroativa. Diversos institutos jurídicos refletem a proteção da segurança jurídica, tais como: decadência, prescrição, preclusão, usucapião, direito adquirido, irretroatividade da lei, coisa julgada e manutenção dos atos praticados por funcionário de fato.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(59L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A aplicação do princípio da legalidade, expresso no artigo 37, caput, da Constituição Federal, traz como conseqüência a obrigatoriedade de lei para criação de cargos, mas não para a sua extinção, que, quando vagos, pode ser feita por decreto.");
            question.setComentario("Correto\n A criação dos cargos públicos deverá ser feita apenas mediante lei, no entanto, a extinção de cargos, quando vagos, poderá ser feita mediante decreto autônomo pelo Presidente da República (CF/88, art. 84, IV, b). Assim, a Carta Magna trouxe a possibilidade de serem editados decretos como atos primários, isto é, atos que decorrem diretamente do texto constitucional, decretos que não são expedidos em função de alguma lei ou de algum ato infraconstitucional. A disciplina dessa matéria pode ser objeto de delegação, pelo Presidente da República, a outras autoridades administrativas, nos termos do parágrafo único do art. 84 da Constituição.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(60L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A prática de atos administrativos, balizando-se pelo princípio da legalidade a que se encontra submetida a Administração Pública, traz como conseqüência a submissão da Administração à lei, sem importar, contudo, a supressão do juízo de conveniência e oportunidade para a prática de atos discricionários.");
            question.setComentario("Correto\n A Administração Pública tem a sua conduta pautada pela lei, todos os atos que ela pratica devem ser submetidos ao princípio da legalidade, no entanto, isso não impede a prática de atos com margem de liberdade que são os chamados atos discricionários. Tais atos dão a opção ao agente público de, no caso concreto, decidir qual a melhor maneira de agir. É interessante observar que os atos discricionários não se confundem com os atos arbitrários. Ato arbitrário é ato praticado fora dos padrões da legalidade, exorbitando os limites de competência definidos pela lei. Já o ato discricionário, ao contrário, é exercido dentro dos limites da legalidade.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(61L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O princípio da publicidade é absoluto, no sentido de que todo ato administrativo, sem exceção, deve ser publicado.");
            question.setComentario("Errado\n A própria Carta Magna traz exceção ao princípio da publicidade, estabelecendo, nesses casos, a garantia do sigilo: CF/88, art. 5º, X, estabelece que são invioláveis a intimidade, a vida privada, a honra e a imagem das pessoas, aplicando a quem as violar o dever de indenizar por danos materiais e morais causados; CF/88, art. 5º, XXXIII, garante o direito à informação, ressalvadas aquelas que sejam imprescindíveis à segurança da sociedade e do Estado, por fim, a CF/88, art. 5º, LX dispõe que a lei poderá restringir a publicidade dos atos processuais quando a defesa da intimidade ou o interesse social o exigirem. Regulamentando o art. 5º, XXXIII, a Lei nº 11.111/2005 disciplina o acesso aos documentos públicos de interesse particular, interesse coletivo ou interesse geral, ressalvadas as hipóteses em que o sigilo seja ou permaneça imprescindível à segurança da sociedade e do Estado (art. 2º).");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(62L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O princípio da impessoalidade tem dois sentidos: um relacionado à finalidade, no sentido de que ao administrador se impõe que só pratique o ato para o seu fim legal; outro, no sentido de excluir a promoção pessoal das autoridades ou servidores públicos sobre suas realizações administrativas.");
            question.setComentario("Correto\n O princípio da impessoalidade impõe ao administrador público que só pratique o ato para o seu fim legal. E o fim legal é unicamente aquele que a norma de Direito indica expressa ou virtualmente como objetivo do ato, de forma impessoal. O princípio da impessoalidade tem outro aspecto, que é a vedação da promoção pessoal de agentes ou autoridades, assim consagrado na Carta Magna: “a publicidade dos atos, programas, obras, serviços e campanhas dos órgãos públicos deverá ter caráter educativo, informativo ou de orientação social, dela não podendo constar nomes, símbolos ou imagens que caracterizem promoção pessoal de autoridades ou servidores públicos.” Dessa forma, a presença de nomes, símbolos ou imagens de agentes ou autoridades nas propagandas governamentais compromete o conceito de res publica e, por conseqüência, o princípio da impessoalidade.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(63L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Por força do princípio da segurança jurídica não é possível retroagir interpretação de lei a casos já decididos com base em entendimento anterior.");
            question.setComentario("Correto\n O princípio da segurança jurídica visa à proteção da confiança e a garantia da certeza e estabilidade das relações ou situações jurídicas. Dessa forma, deverá ser observado o critério de interpretação da norma administrativa de forma que melhor garanta o atendimento do fim público a que se dirige, vedada a aplicação retroativa de nova interpretação.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(64L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A necessidade de institutos como a suplência, a delegação e a substituição para preencher as funções públicas temporariamente vagas, é conseqüência do princípio da eficiência.");
            question.setComentario("Errado\n Como conseqüência do princípio da continuidade dos serviços públicos, existem os institutos da suplência, delegação e substituição, que visam ao preenchimento das funções públicas temporariamente vagas, como no caso de doenças, afastamentos legais e outros garantindo a manutenção contínua dos serviços públicos. Tal princípio é um dever da Administração Pública não só de prestar os serviços públicos, mas disponibilizá-los aos administrados continuamente, sem interrupções.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(65L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A aplicação retroativa de nova interpretação desfavorável aos interesses do particular encontra respaldo no princípio da segurança jurídica.");
            question.setComentario("Errado\n O princípio da segurança jurídica está relacionado à necessidade de respeito, pela Administração, à boa-fé dos administrados que com ela interagem, no sentido de que, quando esses têm um determinado direito reconhecido pela Administração, não podem vir a ser prejudicados, ulteriormente, por mudanças de entendimento da própria Administração sobre aquela matéria. Caso a posição da Administração pudesse, a qualquer tempo, ser por ela modificada, vindo a prejudicar o particular, haveria uma insegurança geral. Todos os administrados devem ter segurança ao procederem conforme a posição da Administração.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(66L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O princípio da supremacia do interesse público não precisa estar presente no momento da elaboração da lei, mas apenas quando da sua aplicação em concreto.");
            question.setComentario("Errado\n O princípio da supremacia do interesse público, também chamado de princípio da finalidade pública, deverá estar presente tanto no momento da elaboração da lei como no momento da sua execução em concreto pela Administração Pública. Ele inspira o legislador e vincula a autoridade administrativa em toda a sua atuação.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(67L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Os princípios da ampla defesa e do contraditório devem ser observados tanto nos processos administrativos punitivos como nos não punitivos.");
            question.setComentario("Correto\n Os princípios do contraditório e da ampla defesa estão previstos na Carta Magna, art. 5º, LV: “aos litigantes, em processo judicial ou administrativo, e aos acusados em geral são assegurados o contraditório e ampla defesa, com os meios e recursos a ela inerentes.” São corolários do princípio do devido processo legal, caracterizados pela possibilidade de resposta, da utilização de todos os meios de defesa em Direito admitidos e devem ser observados em todos os processos, punitivos ou não punitivos.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(68L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O princípio da motivação é exigível apenas nos atos discricionários.");
            question.setComentario("Errado\n Como regra, todos os atos administrativos, vinculados ou discricionários, devem ser motivados, para que haja uma transparência na atuação administrativa e como garantia ao particular, a fim de que este possa se defender contra atos ilegais ou abusivos. Excepcionalmente, pode haver determinadotipo de ato que, por suas próprias características, seja incompatível com a motivação, como ocorre com a exoneração de cargo em comissão. Nesse caso, como o cargo é definido em lei como de livre nomeação e livre exoneração, o motivo não precisará ser demonstrado, podendo constituir-se em simples vontade pessoal da autoridade que o nomeou, não havendo nenhum direito do servidor a ser reclamado.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(69L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O princípio da eficiência sobrepõe-se a todos os demais princípios da Administração.");
            question.setComentario("Errado\n O princípio da eficiência é princípio que se soma aos demais princípios impostos à Administração, não podendo sobrepor-se a nenhum deles, especialmente ao da legalidade, sob pena de sérios riscos à segurança jurídica e ao próprio Estado de Direito.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(70L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O art. 37 da Constituição Federal não é taxativo, pois, outros princípios existem, previstos em leis esparsas, ou, mesmo, não expressamente contemplados no direito objetivo, aos quais se sujeita a Administração Pública.");
            question.setComentario("Correto\n O rol de princípios constitucionais do Direito Administrativo não se esgota no art. 37, caput da Carta Magna. A Lei nº 9.784/99, art. 2º, faz referência a outros princípios, tais como, finalidade, motivação, razoabilidade, proporcionalidade, ampla defesa, segurança jurídica. Ademais, temos também princípios que ordenam a conduta do administrador mas que não estão expressamente contemplados no direito objetivo como o da supremacia do interesse público e o da indisponibilidade do interesse público.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(71L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Segundo o princípio da legalidade, a Administração pode fazer tudo o que a lei não proíbe.");
            question.setComentario("Errado\n Ao contrário do que afirma a assertiva, segundo o princípio da legalidade, a Administração só pode fazer o que a lei permite, autoriza. Em decorrência de tal princípio, a Administração Pública não pode, por simples ato administrativo, conceder direitos de qualquer espécie, criar obrigações ou impor vedações aos administrados; para tanto, ela depende de lei.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(72L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O princípio da especialidade é concernente à idéia da centralização administrativa.");
            question.setComentario("Errado\n Dos princípios da legalidade e da indisponibilidade do interesse público decorre, dentre outros, o da especialidade, concernente à idéia de descentralização administrativa, aplicado às pessoas integrantes da administração indireta. Quando o Estado cria pessoas jurídicas como forma de descentralizar a prestação de serviços públicos, com vistas à especialização de função, a lei que cria a entidade estabelece com precisão as finalidades que lhe incumbe atender, de tal modo que não cabe aos seus administradores afastar-se dos objetivos definidos em lei; isto pelo fato de não terem a livre disponibilidade do interesse público.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(73L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O princípio da autotutela significa o controle que a Administração exerce sobre outra pessoa jurídica por ela mesma instituída.");
            question.setComentario("Errado\n O princípio da tutela significa o controle que a Administração exerce sobre outra pessoa jurídica por ela instituída. Ao contrário, o principio da autotutela, decorrência da súmula 473, STF, significa o controle que a Administração faz dos seus próprios atos, anulando quando ilegais ou revogando quando forem inconvenientes e inoportunos.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(74L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O princípio da continuidade do serviço público é a possibilidade de reeleição dos chefes do poder executivo.");
            question.setComentario("Errado\n Pelo princípio da continuidade do serviço público o Estado deverá desempenhar as suas funções essenciais ou necessárias à coletividade de forma ininterrupta. Como conseqüência de tal princípio temos a necessidade de institutos como a suplência, a delegação e a substituição para preencher as funções públicas temporariamente vagas, a encampação da concessão de serviço público, a impossibilidade de quem contrata com a Administração, de invocar a exceptio non adimpleti contractus nos contratos que tenham por objeto a execução do serviço público etc.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(75L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O princípio da moralidade está ligado à idéia da probidade administrativa, do decoro e da boa-fé.");
            question.setComentario("Correto\n É nesse mesmo sentido que a Lei nº 9.784/99, parágrafo único, IV, define a moralidade nos processos administrativos como um dever de “atuação segundo padrões éticos de probidade, decoro e boafé”. E também a Lei nº 8.112/90, art. 166, II, elenca como deveres dos servidores públicos “ser leal às instituições que servir”. As exigências impostas pelo princípio da moralidade atingem os dois lados da relação jurídico-administrativa: além de vincular a Administração Pública, constitui dever imposto também aos administrados “proceder com lealdade, urbanidade e boa-fé” (Lei nº 9.784/99, art. 4º, II).");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(76L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O princípio da impessoalidade também é conhecido como princípio da finalidade.");
            question.setComentario("Correto\n O princípio da impessoalidade nada mais é do que o clássico princípio da finalidade, o qual impõe ao administrador público que só pratique o ato para o seu fim legal. Significa que a Administração não pode atuar com vistas a prejudicar ou beneficiar pessoas determinadas, uma vez que é sempre o interesse público que tem que nortear o seu comportamento. Ao agir visando a finalidade pública prevista em lei, a Administração Pública necessariamente imprime impessoalidade e objetividade na atuação, evitando tomar decisões baseadas em preferência pessoal ou sentimento de perseguição.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(77L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O princípio da publicidade apresenta dupla acepção: exigência de publicação dos atos administrativos em órgão oficial como requisito de eficácia e exigência de transparência da atuação administrativa.");
            question.setComentario("Correto\n O princípio da publicidade engloba o aspecto da transparência que é o dever da Administração Pública de prestar informações de interesse dos cidadãos e de não praticar condutas sigilosas e o aspecto da divulgação oficial dos atos administrativos, uma vez que é dever estatal a garantia da publicidade dos seus atos.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(78L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O princípio da impessoalidade tem por objetivo assegurar que os serviços públicos sejam prestados com adequação às necessidades da sociedade.");
            question.setComentario("Errado\n O princípio da impessoalidade exige que a atividade administrativa seja exercida de modo a atender a todos os administrados, ou seja, a coletividade, e não a certos membros em detrimento de outros, devendo apresentar-se, portanto, de forma impessoal. Tal princípio tem aplicação ao administrado e ao administrador. Outra aplicação desse princípio encontra-se em matéria de exercício de fato, quando se reconhece validade aos atos praticados por agente irregularmente investido n o cargo ou função, sob o fundamento de que os atos são do órgão, e não do agente público.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(79L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O princípio da legalidade traduz a idéia de que a Administração Pública somente tem possibilidade de atuar quando exista lei que a determine ou que a autorize.");
            question.setComentario("Correto\n O princípio da legalidade implica que a Administração Pública deve atuar de acordo com a lei e o Direito, de modo que a atuação administrativa esteja em compasso com ambos. Sabe-se que, no âmbito das relações privadas, vige a idéia de que tudo que não está proibido em lei está permitido. Já nas relações públicas, o princípio da legalidade envolve a idéia de que a Administração Pública só pode atuar enquanto autorizada ou permitida pela lei.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(80L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O princípio da autotutela significa que a Administração Pública exerce o controle sobre seus próprios atos, com a possibilidade de anular os ilegais e revogar os inconvenientes ou inoportunos, independentemente de recurso ao Poder Judiciário.");
            question.setComentario("Correto\n Enquanto pela tutela a Administração exerce controle sobre outra pessoa jurídica por ela mesma instituída, pela autotutela o controle se exerce sobre os seus próprios atos, com a possibilidade de anular os ilegais e revogar os inconvenientes ou inoportunos, independentemente de recurso ao Poder Judiciário. Esse poder é uma decorrência do princípio da legalidade e está consagrado nas súmulas do STF de nº 346: “a administração pública pode declarar a nulidade dos seus próprios atos”; e nº 473: “a administração pode anular os seus próprios atos, quando eivados de vícios que os tornem ilegais, porque deles não se originam direitos; ou revogá-los, por motivo de conveniência ou oportunidade, respeitados os direitos adquiridos, e ressalvada, em todos os casos, a apreciação judicial”.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(81L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O princípio da publicidade, previsto na Constituição Federal, exige a ampla divulgação, sem exceção, de todos os atos praticados pela Administração Pública.");
            question.setComentario("Errado\n O princípio da publicidade, inserido na CF/1988, art. 37, caput, exige ampla divulgação dos atos praticados pela Administração Pública, ressalvadas as hipóteses de sigilo previstas em lei, uma delas está na própria Carta Magna, em seu art. 5º, XIV que assegura a todos o acesso à informação, resguardado o sigilo da fonte, quando necessário ao exercício profissional.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(82L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A regra estabelecida na Lei n o 9.784/99 de que o processo administrativo deve observar, dentre outros critérios, o atendimento a fins de interesse geral, vedada a renúncia total ou parcial de poderes ou competências, salvo autorização em lei, traduz o princípio da supremacia da prevalência do interesse público.");
            question.setComentario("Correto\n A competência representa uma atividade de exercício obrigatório para os órgãos e agentes públicos, ela é irrenunciável uma vez que estes exercem atividades objetivando o bem comum, portanto, exercitá-la não é livre decisão de quem a titulariza; trata-se de um poder-dever do administrador.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(83L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Os princípios da eficiência e da impessoalidade, de ampla aplicação no Direito Administrativo, não estão expressamente previstos na Constituição Federal.");
            question.setComentario("Errado\n O texto constitucional estabelece expressamente em seu art. 37,caput, cinco princípios básicos a que a Administração Pública, direta e indireta,devem obedecer: legalidade, impessoalidade, moralidade, publicidade e eficiência, este último inserido pela EC nº 19/1998.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(84L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O princípio da fundamentação exige que a Administração Pública indique os fundamentos de fato e de direito de seus atos e decisões.");
            question.setComentario("Correto\n O princípio da fundamentação (motivação) implica à Administração o dever de justificar seus atos , apontando-lhes os fundamentos de direito. A Lei nº 9.784/99, art. 2º, caput, abrigou, de forma expressa, o princípio da motivação como princípio da Administração Pública. Segundo o referido dispositivo, nos processos administrativos serão observados, entre outros, os critérios de indicação dos pressupostos de fato e de direito que determinarem a decisão. Via de regra, o ato administrativo deve ser sempre motivado, pouco importando que ele seja discricionário ou vinculado. A motivação pode ser prévia ou contemporânea à expedição do ato. Dessa forma, em razão do princípio da motivação, a Administração Pública deve fundamentar os atos que expede e revelar os motivos que ensejaram a sua atuação.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(85L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O conteúdo do princípio constitucional da legalidade, impede a realização de atos administrativos decorrentes do exercício do poder discricionário, por ser este o poder que a lei admite ultrapassar os seus parâmetros para atender satisfatoriamente o interesse público.");
            question.setComentario("Errado\n O conteúdo do princípio constitucional da legalidade não impede a realização de atos administrativos decorrentes do exercício do poder discricionário. Ao contrário, a discricionariedade do administrador público se expressa dentro da lei, ou seja, é a própria lei que concede uma margem de liberdade para que o gestor dentro do caso concreto pratique atos discricionários para o atendimento do interesse público. Portanto, a discricionariedade é amparada pela lei, já a arbitrariedade é contrária a lei. Atos discricionários são atos legais, atos arbitrários são atos ilegais.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(86L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O princípio da eficiência alcança apenas os serviços públicos prestados diretamente à coletividade e impõe que a execução de tais serviços seja realizada com presteza, perfeição e rendimento funcional.");
            question.setComentario("Errado\n O erro da questão está em afirmar que o princípio da eficiência alcança apenas os serviços públicos prestados diretamente à coletividade. O referido princípio, introduzido no art. 37, caput, da Carta Magna pela EC nº 19/98, deve ser observado não apenas pela própria Administração Pública quando executa diretamente os seus serviços, como também por aqueles que prestam serviço por meio de delegação, os chamados concessionários e permissionários de serviços públicos.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(87L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Em observância ao princípio da impessoalidade, a Administração não pode atuar com vistas a prejudicar ou beneficiar pessoas determinadas, vez que é sempre o interesse público que tem que nortear o seu comportamento.");
            question.setComentario("Correto\n A atuação da Administração Pública sempre deve ser a busca do interesse coletivo e o Princípio da Impessoalidade só vem a corroborar com esse entendimento quando veda perseguições e benefícios no âmbito da Administração. Assim, fere o princípio da impessoalidade o gestor que remove um servidor público com a finalidade de persegui-lo, bem como quando concede gratificação para um servidor específico com a clara finalidade de beneficiá-lo. A atuação do gestor deverá ser sempre objetiva, critérios subjetivos na gestão pública geram a invalidade do ato praticado por violação ao princípio em análise.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(88L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O princípio da segurança jurídica veda a aplicação retroativa de nova interpretação de lei no âmbito da Administração Pública, preservando assim, situações já reconhecidas e consolidadas na vigência de orientação anterior.");
            question.setComentario("Correto\n A assertiva trouxe a idéia que ficou expressa no art. 2º, inciso XIII, Lei nº 9784/99 que impõe que a interpretação da norma administrativa deve ser da forma que melhor garanta o atendimento do fim público a que se dirige, vedada a aplicação retroativa de nova interpretação. Tal princípio tem uma íntima relação com a idéia de respeito à boa-fé. Se a Administração adotou determinada interpretação como correta e adotou ao caso concreto, não poderá posteriormente anular seu ato por mudança de interpretação. Se assim não fosse, haveria uma insegurança para o administrado que o Direito não permite.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(89L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Quando se afirma que o particular pode fazer tudo o que a lei não proíbe e que a Administração só pode fazer o que a lei determina ou autoriza, estamos diante do princípio da Legalidade.");
            question.setComentario("Correto\n O Princípio da Legalidade coloca a Administração Pública, em toda a sua atividade, presa aos mandamentos da lei, deles não se podendo afastar, sob pena de invalidade do ato e a responsabilidade de seu autor. Ao contrário, o Princípio da autonomia da vontade dá ao particular a liberdade de praticar todo e qualquer ato do seu interesse, desde que a lei não proíba.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(90L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A administração pública tem natureza de múnus público para quem a exerce, isto é, de encargo de defesa, conservação e aprimoramento dos bens, serviços e interesses da coletividade.");
            question.setComentario("Correto\n O administrador Público tem o múnus, o poder-dever de agir, a obrigação de bem cuidar, de zelar, de gerir e de bem administrar a coisa pública com o objetivo de perseguir o interesse público. Como assevera a questão, é o encargo de defesa, conservação e aprimoramento dos bens, serviços e interesses da coletividade.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(91L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("No desempenho dos encargos administrativos o agente do Poder Público tem liberdade de procurar qualquer objetivo, ou de dar fim diverso do previsto em lei, desde que atenda aos interesses do Governo.");
            question.setComentario("Errado\n A assertiva está repleta de erros, vejamos: no desempenho dos encargos administrativos o agente do Poder Público não tem liberdade de procurar qualquer objetivo. O objetivo a ser perseguido deverá sempre ser o interesse coletivo. Ademais, a sua atuação não pode ser diversa da prevista em lei, caso contrário seu ato será considerado ilegal. Por fim, outro erro da questão foi aduzir que os interesses a serem perseguidos deverão ser os do Governo, quando o correto seria dizer que o interesse público é o que deve ser perseguido.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(92L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Dentre os princípios básicos da Administração não se incluem o da publicidade e o da eficiência.");
            question.setComentario("Errado\n Dispõe a Carta Magna em seu art. 37, caput, que a administração pública direta e indireta de qualquer dos Poderes da União, dos Estados, do Distrito Federal e dos Municípios obedecerá aos princípios da legalidade, impessoalidade, moralidade, publicidade e eficiência.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(93L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("NÃO é considerada característica da sociedade de economia mista o desempenho de atividade de natureza econômica.");
            question.setComentario("Errado\n Tanto a Sociedade de Economia Mista como a Empresa Pública têm entre suas características a possibilidade de desempenho de duas atividades: a prestação de serviços públicos e a exploração de atividade econômica, esta última com previsão no art. 173, da Carta Magna.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(94L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Os entes da Administração Indireta NÃO possuem personalidade jurídica própria.");
            question.setComentario("Errado\n Os entes da Administração Indireta (Autarquia, Fundação, Sociedade de Economia Mista e Empresa Pública) possuem personalidade jurídica própria, seja de direito público ou de direito privado e, portanto, capacidade de auto-administração e receita própria.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(95L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("No que diz respeito às autarquias, entidades pertencentes à Administração Indireta, a assertiva que corretamente aponta algumas de suas características é a capacidade de autoadministração e sujeição a tutela.");
            question.setComentario("Correto\n As autarquias têm capacidade de autoadministração exercida com certa independência em relação ao poder central. Elas têm a capacidade de se autoadministrar a respeito das matérias específicas que lhes foram destinadas pela pessoa pública política que lhes deu vida. As autarquias também sofrem o chamado controle administrativo ou tutela, que tem como objetivo assegurar que elas não se desviem dos seus fins institucionais, dos fins para os quais elas foram criadas.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(96L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Autarquias, fundações e sociedades de economia mista prestadoras de serviço público sujeitam-se ao regime jurídico de direito público.");
            question.setComentario("Errado\n As autarquias e as fundações públicas sujeitam-se ao regime jurídico de direito público. De outro lado, as sociedades de economia mista estão sujeitas ao regime de direito privado.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(97L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Fundações instituídas e mantidas pelo poder público sujeitam-se ao mesmo regime das autarquias, exceto no que diz respeito ao processo seletivo de pessoal.");
            question.setComentario("Errado\n As fundações públicas, também chamadas de autarquias fundacionais, sujeitam-se ao mesmo regime das autarquias, inclusive no que diz respeito à seleção do seu pessoal, que é feita mediante prévio concurso público, e ao regime adotado, que é o estatutário.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(98L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Sociedades de economia mista sujeitam-se ao regime de direito privado, inclusive no que diz respeito à legislação tributária e trabalhista.");
            question.setComentario("Correto\n As sociedades de economia mista sujeitam-se ao regime jurídico de direito privado, inclusive no que diz respeito à legislação tributária, ou seja, elas não podem gozar de privilégios fiscais não extensivos às do setor privado bem como à legislação trabalhista, já que o seu regime de pessoal é o celetista.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(99L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Sociedades de economia mista exploradoras de atividade econômica sujeitam-se ao mesmo regime das empresas privadas, exceto no que diz respeito à matéria tributária.");
            question.setComentario("Errado\n Sociedades de economia mista exploradoras de atividade econômica sujeitam-se ao mesmo regime das empresas privadas, inclusive no que diz respeito à matéria tributária. É vedada a concessão de benefícios fiscais exclusivos para as sociedades de economia mista, bem como para as empresas públicas exploradoras de atividade econômica. Tais entidades podem gozar de privilégios fiscais, desde que eles também sejam concedidos às empresas privadas.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(100L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Autarquias e fundações instituídas e mantidas pelo poder público sujeitam-se ao regime de direito público, exceto no que diz respeito à penhorabilidade de seus bens.");
            question.setComentario("Errado\n Autarquias e fundações instituídas e mantidas pelo poder público sujeitam-se ao regime de direito público, inclusive no que diz respeito à penhorabilidade de seus bens. Em observância ao princípio da continuidade dos serviços públicos, os bens das autarquias e fundações públicas não são passíveis de penhora, se submetendo seus débitos ao regime de precatório do art. 100, da Carta Magna.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(101L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O pessoal das empresas públicas e das sociedades de economia mista são considerados agentes públicos, para os fins de incidência das sanções previstas na Lei de Improbidade Administrativa.");
            question.setComentario("Correto\n Agente público para os fins da Lei de Improbidade Administrativa é todo aquele que exerce, ainda que transitoriamente ou sem remuneração, por eleição, nomeação, designação, contratação ou qualquer outra forma de investidura ou vínculo, mandato, cargo, emprego ou função com o Estado. Por ser uma definição bastante ampla, engloba também os empregados das empresas públicas e das sociedades de economia mista.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(102L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("As sociedades de economia mista apenas têm foro na Justiça Federal quando a União intervém como assistente ou opoente ou quando a União for sucessora da referida sociedade.");
            question.setComentario("Correto\n As sociedades de economia mista federais não foram contempladas com o foro processual da Justiça Federal, sendo suas causas processadas e julgadas na Justiça Estadual (Súmula 556, STF). No entanto, de acordo com a Súmula 517 do STF, as sociedades de economia mista terão foro na Justiça Federal quando a União intervém como assistente ou opoente no processo.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(103L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("No capital de empresa pública, não se admite a participação de pessoa jurídica de direito privado, ainda que integre a Administração Indireta.");
            question.setComentario("Errado\n A empresa pública tem o capital exclusivamente público, mas isso não impede que pessoas jurídicas de direito privado não participem dele. O art. 5º do Decreto-Lei nº 900/69 permite que, desde que a maioria do capital da empresa pública permaneça de propriedade da União, seja admitida, no capital da empresa pública a participação de outras pessoas de direito público interno, bem como de entidades da administração indireta da União, dos Estados, Distrito Federal e Municípios. Com isso, admite-se a participação de pessoas jurídicas de direito privado que integram a Administração Indireta, inclusive de sociedades de economia mista, em que o capital é parcialmente privado.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(104L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("As empresas públicas podem adotar qualquer forma societária, inclusive a forma de sociedade 'unipessoal'.");
            question.setComentario("Correto\n A expressão qualquer das formas admitidas em direito significa que a empresa pública poderá ter a estrutura de sociedade civil ou comercial, ou ainda, forma inédita prevista na lei que a instituiu. A empresa pública poderá ser inclusive unipessoal, que corresponde à empresa individual do direito privado, com a diferença de que a empresa pública tem personalidade jurídica e a constituição de empresa individual, no direito privado, não acarreta a criação de pessoa jurídica.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(105L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Agências reguladoras são autarquias especiais, com personalidade jurídica de direito privado e amplos poderes normativos");
            question.setComentario("Errado\n Agências reguladoras são autarquias especiais, com personalidade jurídica de direito público e não possuem amplos poderes normativos, mas poderes limitados pela lei.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(106L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("As empresas públicas e as sociedades de economia mista devem ter a forma de Sociedade Anônima (S/A), sendo reguladas, basicamente, pela Lei das Sociedades por Ações (Lei nº 6.404/1976).");
            question.setComentario("Errado\n Apenas as sociedades de economia mista devem ter a forma de Sociedade Anônima (S/A), sendo reguladas, basicamente, pela Lei das Sociedades por Ações (Lei nº 6.404/1976). Já as empresas públicas podem ter qualquer forma admitida pelo direito, inclusive S/A.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(107L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Empresas públicas, autarquias e sociedades de economia mista, assim como as fundações públicas, só podem ser criadas por lei específica.");
            question.setComentario("Errado\n O art. 37, inciso XIX da Carta Magna assevera que somente por lei específica poderá ser criada autarquia e autorizada a instituição de empresa pública, de sociedade de economia mista e de fundação. Portanto, apenas a autarquia é criada, as demais são autorizadas por lei específica.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(108L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Determinados entes da administração indireta serão, obrigatoriamente, submetidos ao regime jurídico de direito privado se exercerem atividade econômica de produção ou comercialização de bens ou de prestação de serviços. São eles: as empresas públicas e as sociedades de economia mista, apenas.");
            question.setComentario("Correto\n A empresa pública e a sociedade de economia mista tem natureza jurídica de direito privado e podem exercer dupla atividade: prestadora de serviços públicos ou exploradora de atividade econômica. São as únicas entidades da Administração Indireta que podem explorar atividade econômica, as demais pessoas (autarquias e fundações) só podem ser prestadoras de serviços públicos.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(109L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A autarquia será criada por lei complementar, cabendo à lei ordinária federal definir as áreas de sua atuação.");
            question.setComentario("Errado\n A autarquia é criada mediante lei específica (art. 37, XIX, CF), as demais entidades da administração indireta são autorizadas por lei. A única que além de uma lei específica para sua autorização também precisa de uma lei complementar para definir a área de sua atuação é a fundação.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(110L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("É traço comum às empresas públicas e sociedades de economia mista a composição de seu capital.");
            question.setComentario("Errado\n É traço distinto às empresas públicas e sociedades de economia mista a composição de seu capital. Enquanto a empresa pública tem o seu capital exclusivamente público, a sociedade de economia mista pode ter o seu capital misto, público e privado.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(111L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Pessoas jurídicas de direito privado não integram a Administração Pública direta.");
            question.setComentario("Correto\n A administração direta é formada apenas pelas pessoas jurídicas de direito público (União, Estado, Município, DF), já a administração indireta é formada pelas pessoas jurídicas de direito público (autarquia e fundação pública de direito público) e de direito privado (fundação pública de direito privado, empresa pública e sociedade de economia mista).");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(112L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("As empresas públicas são pessoas jurídicas de direito público.");
            question.setComentario("Errado\n As empresas públicas são pessoas jurídicas de direito privado.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(113L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("As fundações públicas podem ter fins lucrativos.");
            question.setComentario("Errado\n As fundações públicas tem como única atividade a prestação de serviços públicos, dessa forma, elas não poderão ter fins lucrativos.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(114L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("As entidades autárquicas são pessoas jurídicas de Direito Público, de natureza meramente administrativa, criadas por lei específica para a realização de atividades, obras ou serviços descentralizados da entidade estatal que as criou e à qual se subordinam hierarquicamente.");
            question.setComentario("Errado\n O erro da questão foi afirmar que há uma relação de subordinação entre a entidade autárquica e a sua criadora, quando na verdade, o que existe é um controle de finalidade, também chamado de tutela administrativa ou vinculação, mas não há subordinação.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(115L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("As sociedades de economia mista federais não foram contempladas com o foro processual da Justiça Federal.");
            question.setComentario("Correto\n As sociedades de economia mista federais não foram contempladas com o foro processual da Justiça Federal, sendo suas causas processadas e julgadas na Justiça Estadual (Súmula 556, STF).");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(116L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("As empresas públicas podem ser estruturadas sob qualquer das formas admitidas em direito.");
            question.setComentario("Correto\n O art. 5º do Decreto-lei nº 200/67 determina que a sociedade de economia mista seja estruturada sob a forma de sociedade anônima e, a empresa pública, sob qualquer das formas admitidas em direito, assim, ela poderá ter a estrutura de sociedade civil ou de sociedade comercial, ou qualquer outra admitida em direito.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(117L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O capital das sociedades de economia mista é constituído por capital público e privado.");
            question.setComentario("Correto\n Ao contrário da empresa pública, que tem o seu capital exclusivamente público, a sociedade de economia mista pode ter capital público e privado.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(118L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("No capital das empresas públicas pode ser admitida a participação de entidades da administração indireta.");
            question.setComentario("Correto\n Desde que a maioria do capital votante permaneça de propriedade da União, é possível que seja admitida no capital da empresa pública a participação de outras pessoas de direito público interno, bem como de entidades da administração indireta da União, dos Estados, Distrito Federal e Municípios. Assim, admite-se a participação de pessoas jurídicas de direito privado que integrem a Administração Indireta, inclusive de sociedades de economia mista, em que o capital é parcialmente privado.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(119L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("As sociedades de economia mista não podem ser estruturadas sob a forma de sociedade anônima.");
            question.setComentario("Errado\n Ao contrário do que foi aduzido na assertiva, a sociedade de economia mista só pode ser constituída sob a forma de sociedade anônima.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(120L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Os órgãos públicos não têm personalidade jurídica própria.");
            question.setComentario("Correto\n O órgão é a unidade de atuação integrante da estrutura da administração direta e da estrutura da administração indireta e não tem personalidade jurídica própria, ao contrário da entidade que constitui unidade de atuação dotada de personalidade jurídica própria.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(121L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Os órgãos públicos confundem-se com as pessoas físicas, porque congregam funções que estas vão exercer.");
            question.setComentario("Errado\n O órgão não se confunde com a pessoa jurídica, embora seja uma de suas partes integrantes; a pessoa jurídica é o todo, enquanto os órgãos são parcelas integrantes do todo. O órgão também não se confunde com a pessoa física, o agente público, porque congrega funções que este vai exercer.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(122L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Os órgãos públicos são singulares quando constituídos por um único centro de atribuições, sem subdivisões internas, como ocorre com as seções integradas em órgãos maiores.");
            question.setComentario("Errado\n Órgãos singulares são aqueles integrados por um único agente, ex. Presidência da República.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(123L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Os órgãos públicos não são parte integrante da estrutura da Administração Pública.");
            question.setComentario("Errado\n De acordo com a Lei nº 9784/99, art. 1º, § 2º, órgão é a unidade de atuação integrante da estrutura da Administração direta e da estrutura da Administração indireta.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(124L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Os órgãos públicos são compostos quando constituídos por vários agentes, sendo exemplo, o Tribunal de Impostos e Taxas.");
            question.setComentario("Errado\n Órgãos compostos são aqueles constituídos por vários outros órgãos, como acontece com os Ministérios, as Secretarias de Estado, que compreendem vários outros, até chegar aos órgãos unitários, em que não existem mais divisões.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(125L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("As empresas públicas e sociedades de economia mista não são criadas por lei, mas, a sua instituição depende de autorização legislativa.");
            question.setComentario("Correto\n Somente por lei específica poderá ser criada autarquia e autorizada a instituição de empresa pública, de sociedade de economia mista e de fundação. Portanto, apenas a autarquia é criada mediante lei, as demais terão a sua instituição autorizada por lei.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(126L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Entidades estatais são pessoas jurídicas de Direito Público que integram a estrutura constitucional do Estado, mas, não têm poderes políticos nem administrativos.");
            question.setComentario("Errado\n Entidades estatais são pessoas jurídicas de Direito Público que integram a estrutura constitucional do Estado, possuindo poderes políticos e administrativos. Sendo assim, fazem assua próprias leis e têm administração própria. No Brasil, as entidades estatais são a União, os Estados, o DF e os Municípios.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(127L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Órgãos subalternos são os que exercem atribuições de mera execução, sempre subordinados a vários níveis hierárquicos superiores.");
            question.setComentario("Correto\n Órgãos subalternos são os que se acham subordinados hierarquicamente a órgãos superiores de decisão, exercendo principalmente funções de execução, como as realizadas por seções de expediente, de pessoal, de material, de portaria, zeladoria etc.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(128L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Órgãos públicos são centros de competência instituídos para o desempenho de funções estatais, dotados de personalidade jurídica e de vontade própria.");
            question.setComentario("Errado\n Órgãos públicos são centros de competência instituídos para o desempenho de funções estatais, sem personalidade jurídica e sem vontade própria, eles expressam a vontade do Estado.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(129L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("As organizações sociais são definidas como pessoa jurídica de direito público.");
            question.setComentario("Errado\n Organização social é a qualificação jurídica dada a pessoa jurídica de direito privado, sem fins lucrativos, instituída por iniciativa de particulares, e que recebe delegação do Poder Público, mediante contrato de gestão, para desempenhar serviço público de natureza social.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(130L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("As organizações da sociedade civil de interesse público só podem distribuir dividendos após cinco anos da sua criação.");
            question.setComentario("Errado\n A organização da sociedade civil de interesse público é uma qualificação jurídica dada a pessoas jurídicas de direito privado, sem fins lucrativos e, portanto, impedidas de distribuir dividendos, instituídas por iniciativa de particulares, para desempenhar serviços sociais não exclusivos do Estado com incentivos e fiscalização pelo Poder Público, mediante vínculo jurídico instituído por meio de termo de parceria.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(131L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Classificam-se como terceiro setor, dentre outras, as autarquias, as organizações sociais e as empresas públicas.");
            question.setComentario("Errado\n Terceiro setor é aquele composto por entidades da sociedade civil de fins públicos não lucrativos, formado pelos serviços sociais autônomos, as entidades de apoio, organizações sociais e organizações da sociedade civil de interesse público. Portanto, ao contrário do que foi asseverado na questão, não integram o terceiro setor as empresas públicas e as autarquias.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(132L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Serviço Social Autônomo é órgão da Administração direta, criado mediante autorização legislativa, a quem se assegura autonomia administrativa e financeira.");
            question.setComentario("Errado\n Serviço social autônomo é todo aquele instituído por lei, com personalidade de Direito Privado, para ministrar assistência ou ensino a certas categorias sociais ou grupos profissionais, sem fins lucrativos, sendo mantidos por dotações orçamentárias ou por contribuições parafiscais, ex. SENAC, SESI, SESC, SEST, SENAR, SENAI, SEBRAE.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(133L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Quando celebram termo de parceria com a Administração Pública, as Organizações da Sociedade Civil de Interesse Público OSCIP´s, como entidades do terceiro setor, passam a integrar a Administração Direta.");
            question.setComentario("Errado\n A organização da sociedade civil de interesse público (OSCIP) não faz parte nem da administração direta nem da administração indireta, mas integra o chamado terceiro setor.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(134L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Os Serviços Sociais Autônomos prestam atividade de cooperação e fomento, revestindo-se da forma de entes de natureza privada.");
            question.setComentario("Correto\n Os serviços sociais autônomos são todos aqueles instituídos por lei, com personalidade de direito privado, para ministrar assistência ou ensino a certas categorias sociais ou grupos profissionais, sem fins lucrativos, sendo mantidos por dotações orçamentárias ou por contribuições parafiscais. São considerados entes parafiscais, de cooperação com o poder público. Não integram a Administração direta nem a indireta, mas trabalham ao lado do Estado, cooperando nos setores, atividades e serviços que lhes são atribuídos.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(135L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Os Serviços Sociais Autônomos atuam exclusivamente nos setores de saúde e cultura, sob a forma de organizações sociais.");
            question.setComentario("Errado\n Os serviços sociais autônomos não atuam exclusivamente nos setores de saúde e cultura, mas em todos os serviços que não sejam exclusivos do Estado. Ademais, não estão organizados sob a forma de organizações sociais, mas de entes paraestatais, de cooperação com o Poder Público.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(136L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Os Serviços Sociais Autônomos podem ter natureza jurídica de direito público ou privado.");
            question.setComentario("Errado\n Os serviços sociais autônomos têm a natureza jurídica apenas de entes de direito privado.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(137L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Os Serviços Sociais Autônomos podem se revestir da forma de fundações ou empresas estatais.");
            question.setComentario("Errado\n Os serviços sociais autônomos são instituídos sob formas jurídicas comuns, próprias das entidades privadas sem fins lucrativos, tais como associações civis ou fundações. Por não terem fins lucrativos, não podem ser instituídos sob a forma de empresas estatais.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(138L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Os Serviços Sociais Autônomos prestam serviço público sob a modalidade de permissão, não se submetendo, no entanto, ao regime de concessões.");
            question.setComentario("Errado\n Os serviços sociais autônomos não prestam serviço público delegado pelo Estado, mas atividade privada de interesse público (serviços não exclusivos do Estado); exatamente por isso, são incentivadas pelo Poder Público. A atuação estatal, no caso, é de fomento e não de prestação de serviço público.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(139L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Dentre outras características, distingue- se a autarquia das empresas estatais em razão de a primeira ser criada por lei, enquanto as empresas estatais podem ser constituídas por decreto.");
            question.setComentario("Errado\n Todas as pessoas da Administração Pública indireta são instituídas por meio de lei específica, ou através desta, autorizada sua instituição (art. 37, inciso XIX, CF). No caso da fundação, ela precisa ainda de uma lei complementar para definir a área de sua atuação.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(140L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Dentre outras características, distingue- se a autarquia das empresas estatais em razão de a primeira gozar de imunidade tributária, embora seus bens também não sejam protegidos pela impenhorabilidade e pela imprescritibilidade.");
            question.setComentario("Errado\n As autarquias gozam de imunidade tributária relativa aos impostos sobre patrimônio, renda ou serviços, assim como tem os seus bens protegidos pela impenhorabilidade e imprescritibilidade.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(141L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Dentre outras características, distingue- se a autarquia das empresas estatais em razão de a primeira poder editar atos dotados de imperatividade e executoriedade, enquanto as estatais são regidas pelo regime jurídico de direito privado.");
            question.setComentario("Correto\n Por ser regida pelo direito público, a autarquia pratica os seus atos revestidos de imperatividade e executoriedade, ao contrário, as empresas estatais por serem pessoas regidas pelo direito privado, seus atos não gozam de tais prerrogativas.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(142L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Dentre outras características, distingue- se a autarquia das empresas estatais em razão de a primeira integrar a administração direta, embora não goze de juízo privativo, enquanto as empresas estatais fazem parte da administração indireta.");
            question.setComentario("Errado\n As autarquias, assim como as empresas estatais, integram a administração indireta. Elas também têm processo especial de execução previsto no art. 100 da Carta Magna, gozam ainda da impenhorabilidade dos seus bens, de juízo privativo, prazos dilatados em juízo e duplo grau de jurisdição.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(143L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("As entidades integrantes da Administração Pública sujeitam-se ao regime jurídico de direito público, independentemente de integrarem a Administração direta ou indireta.");
            question.setComentario("Errado\n As pessoas integrantes da administração direta são todas de direito público. Já as pessoas integrantes da administração indireta podem ser de direito público (autarquias e fundações públicas de direito público) ou de direito privado (empresas públicas, sociedades de economia mista e fundações públicas de direito privado).");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(144L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("As entidades integrantes da Administração Pública sujeitam-se, todas, aos princípios fixados na Constituição Federal, porém apenas os entes políticos são constituídos sob a forma de pessoas jurídicas de direito público.");
            question.setComentario("Errado\n As entidades integrantes da Administração Pública sujeitam-se, todas, aos princípios fixados na Constituição Federal. No entanto, não são apenas os entes políticos que são constituídos sob a forma de pessoas jurídicas de direito público, as autarquias e fundações públicas também o são.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(145L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("As entidades integrantes da Administração Pública sujeitam-se ao regime jurídico publicístico, exceto as empresas estatais, que são regidas, exclusivamente, pelo direito privado.");
            question.setComentario("Errado\n As empresas estatais não são regidas exclusivamente pelo direito privado. Na verdade, são submetidas a um regime de direito privado parcialmente derrogado pelo direito público e isso fica claro quando se submetem ao regime licitatório para aquisição de bens e serviços, bem como ao concurso público para o ingresso de seu pessoal.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(146L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("As entidades integrantes da Administração Pública possuem, todas, as mesmas prerrogativas da Fazenda Pública, especialmente no que diz respeito à imunidade tributária e impenhorabilidade de seus bens.");
            question.setComentario("Errado\n Apenas as autarquias e fundações públicas têm praticamente os mesmos privilégios e prerrogativas da Fazenda Pública, dentre os quais processo especial de execução, impenhorabilidade dos seus bens, juízo privativo, prazos dilatados e duplo grau de jurisdição.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(147L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("As entidades integrantes da Administração Pública sujeitam-se, quando empresas estatais, ao regime jurídico de direito privado, não obstante seus bens, se afetados a serviço público, possam estar protegidos pelo regime jurídico de direito público.");
            question.setComentario("Correto\n As entidades integrantes da Administração Pública sujeitam-se, quando empresas estatais, ao regime jurídico de direito privado. No entanto, quando atuam na prestação de serviços públicos, em razão do princípio da continuidade dos serviços públicos, seus bens são protegidos pela impenhorabilidade e imprescritibilidade.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(148L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Somente por medida provisória poderá ser criada autarquia, cabendo à lei complementar definir as áreas de sua atuação.");
            question.setComentario("Errado\n Somente por lei específica poderá ser criada autarquia. A lei complementar, segundo o art. 19, inciso XIX, da CF, tem por finalidade apenas definir a área de atuação da fundação.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(149L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Órgãos da Administração Direta Federal são pessoas jurídicas distintas da União.");
            question.setComentario("Errado\n Os órgãos são centros de competência integrantes da estrutura da administração direta e indireta e não tem personalidade jurídica própria, portanto, são entes despersonalizados.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(150L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Órgãos da Administração Direta Federal não estão subordinados funcionalmente ao Governo Federal.");
            question.setComentario("Errado\n Os órgãos estão sujeitos à hierarquia, subordinação dos seus entes criadores. Ao contrário das entidades que não sofrem subordinação, apenas controle finalístico, tutela administrativa.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(151L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Órgãos da Administração Direta Federal não detêm legitimidade ativa nem passiva para responder ou entrar com ações judiciais.");
            question.setComentario("Correto\n O órgão não tem personalidade jurídica própria, ou seja, não é sujeito de direitos e de obrigações. Portanto, o órgão não detém legitimidade ativa e nem passiva para responder ou ajuizar ações judiciais, isso compete à pessoa jurídica a qual ele pertence.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(152L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A Administração Direta é definida como soma das autarquias, fundações públicas e empresas públicas subordinadas ao governo de determinada esfera da Federação.");
            question.setComentario("Errado\n As autarquias, fundações e sociedades de economia mista fazem da parte da administração pública indireta. Já a administração pública direta é o conjunto de serviços e órgãos integrados na estrutura administrativa da chefia do Poder Executivo e respectivos Ministérios ou Secretarias.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(153L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Administração Pública em seu sentido subjetivo compreende o conjunto de agentes, órgãos e entidades designados para executar atividades administrativas.");
            question.setComentario("Correto\n A administração pública em sentido formal, subjetivo ou orgânico é o conjunto de órgãos, pessoas jurídicas e agentes que o nosso ordenamento jurídico identifica como administração pública, não importando a atividade que exerçam. Já a administração pública em sentido material, objetivo ou funcional representa o conjunto de atividades que costumam ser consideradas próprias da função administrativa.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(154L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Sob a ótica da personalidade jurídica, além do Poder Executivo, a Defensoria Pública, os Poderes Judiciário e Legislativo, o Ministério Público e os Tribunais de Contas podem ser considerados integrantes da Administração Pública Direta.");
            question.setComentario("Correto\n A administração direta é o conjunto de órgãos que integram as pessoas políticas do Estado (União, estados, Distrito Federal e municípios), aos quais foi atribuída a competência para o exercício, de forma centralizada, de atividades administrativas. Dentre os integrantes da estrutura da administração direta, podemos citar como exemplos, o Poder Executivo, a Defensoria pública, os Poderes Legislativo, Judiciário, o Ministério Público e os Tribunais e Contas.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(155L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Os serviços públicos são descentralizados por meio da administração indireta, também podendo ocorrer mediante atuação dos chamados concessionários, permissionários e autorizatários de serviços públicos.");
            question.setComentario("Correto\n A descentralização dos serviços públicos pode ocorrer por meio da outorga para os entes da administração pública indireta, assim como pode ocorrer por meio da delegação para os concessionários e autorizatários de serviços públicos.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(156L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("É exemplo de ente integrante da Administração indireta, em termos da organização administrativa brasileira uma associação pública.");
            question.setComentario("Correto\n De acordo com a Lei nº 11107/05, o consórcio público adquirirá personalidade jurídica de direito público, no caso de constituir associação pública, mediante a vigência das leis de ratificação do protocolo de intenções ou de direito privado, mediante o atendimento dos requisitos da legislação civil. Se tiver personalidade de direito público, será uma associação pública e integrará a administração indireta de todos os entes da Federação consorciados.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(157L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("É possível a existência de sócios ou acionistas privados nas sociedades de economia mista, sendo inadmissível o ingresso de capital privado na composição patrimonial das empresas públicas. Por outro lado, a imunidade recíproca prevista no Texto Constitucional Federal é extensiva apenas às empresas públicas, em igualdade de tratamento concedido às autarquias e fundações públicas.");
            question.setComentario("Errado\n É possível a existência de sócios ou acionistas privados nas sociedades de economia mista, sendo inadmissível o ingresso de capital privado na composição patrimonial das empresas públicas, uma vez que o seu capital é exclusivamente público. Por outro lado, a imunidade recíproca prevista no Texto Constitucional Federal é extensiva apenas às autarquias e fundações públicas.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(158L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("As sociedades de economia mista e as empresas públicas são pessoas jurídicas de direito privado, seus bens são submetidos ao regime jurídico dos bens particulares, seus quadros funcionais são preenchidos por agentes públicos celetistas e não podem submeter-se à chamada recuperação judicial, recuperação extrajudicial e à falência.");
            question.setComentario("Correto\n As sociedades de economia mista e as empresas públicas são pessoas jurídicas de direito privado e seus bens são submetidos ao regime jurídico dos bens particulares. No entanto, se forem prestadoras de serviços públicos, apesar de permanecerem com a natureza jurídica de direito privado, os seus bens receberão o mesmo tratamento que os bens públicos, ou seja, serão impenhoráveis e imprescritíveis. Seus quadros funcionais são preenchidos por agentes públicos celetistas,previamente aprovados em concurso público e não podem se submeter à chamada recuperação judicial, recuperação extrajudicial e à falência, conforme vedação expressa no art. 2º, da Lei nº 11.101/2002 (Lei de Falências).");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(159L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("São características das autarquias e fundações públicas processo especial de execução para os pagamentos por elas devidos, em virtude de sentença judicial; Impenhorabilidade dos seus bens.");
            question.setComentario("Correto\n As autarquias e as fundações públicas gozam de processo especial de execução previsto no art. 100, CF, bem como a impenhorabilidade e da imprescritibilidade dos seus bens, de juízo privativo, de prazos dilatados em juízo, de duplo grau de jurisdição e de imunidade tributária relativa aos impostos sobre o patrimônio, renda ou serviços.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(160L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("São características das autarquias e fundações públicas imunidade tributária relativa aos impostos sobre o patrimônio, renda ou serviços vinculados às suas finalidades essenciais ou às delas decorrentes; Prazos simples em juízo.");
            question.setComentario("Errado\n São características das autarquias e das fundações públicas a imunidade tributária relativa aos impostos sobre o patrimônio, renda ou serviços vinculados às suas finalidades essenciais ou às delas decorrentes; Prazos dilatados em juízo.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(161L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("São características das autarquias e fundações públicas presunção de veracidade, imperatividade e executoriedade dos seus atos; Não sujeição ao controle administrativo.");
            question.setComentario("Errado\nSão características das autarquias e fundações públicas presunção de veracidade, imperatividade e executoriedade dos seus atos; e sujeição ao controle administrativo, também chamado de tutela administrativa.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(162L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("São características das autarquias e fundações públicas prazos dilatados em juízo; Penhorabilidade dos seus bens.");
            question.setComentario("Errado\n São características das autarquias e das fundações públicas os prazos dilatados em juízo; a impenhorabilidade e a imprescritibilidade dos seus bens, o duplo grau de jurisdição e o juízo privativo.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(163L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("São características das autarquias e fundações públicas processo de execução regido pelas normas aplicáveis aos entes privados; Imunidade tributária relativa aos impostos sobre o patrimônio, renda ou serviços vinculados às suas finalidades essenciais ou às delas decorrentes.");
            question.setComentario("Errado\n São características das autarquias e das fundações públicas processo de execução regido pelas normas aplicáveis à Fazenda Pública, previsto no art. 100, CF; Imunidade tributária relativa aos impostos sobre o patrimônio, renda ou serviços vinculados às suas finalidades essenciais ou às delas decorrentes.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(164L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Os entes da Administração Indireta NÃO possuem patrimônio próprio.");
            question.setComentario("Errado\n Todos os entes da Administração Indireta possuem patrimônio próprio, personalidade jurídica própria, o que implica direitos e obrigações definidos em lei, capacidade de autoadministração e receita própria.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(165L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Os entes da Administração Indireta NÃO decorrem de descentralização por colaboração.");
            question.setComentario("Correto\n A descentralização por colaboração é a que se verifica quando, por meio de contrato ou ato administrativo unilateral, se transfere a execução de determinado serviço público a pessoa jurídica de direito privado, previamente existente, conservando o Poder Público a titularidade do serviço, é o que se faz na concessão, permissão ou autorização de serviços públicos.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(166L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Os entes da Administração Indireta NÃO detêm capacidade de autoadministração.");
            question.setComentario("Errado\n Os entes da Administração Indireta detêm capacidade de autoadministração.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(167L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Os entes da Administração Indireta NÃO possuem personalidade jurídica própria.");
            question.setComentario("Errado\n Os entes da Administração Indireta possuem personalidade jurídica própria de direito público (autarquias e fundações públicas de direito público) ou de direito privado (empresas públicas, sociedades de economia mista e fundações públicas de direito privado).");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(168L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Os entes da Administração Indireta NÃO vinculam-se a órgãos da Administração Direta.");
            question.setComentario("Errado\n Os entes da Administração Indireta vinculam-se a órgãos da Administração Direta por meio da chamada tutela administrativa.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(169L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("No que diz respeito às autarquias, entidades pertencentes à Administração Indireta, a assertiva que corretamente aponta algumas de suas características é a capacidade de autoadministração e descentralização territorial.");
            question.setComentario("Errado\n A descentralização territorial ou geográfica é aquela em que a União cria uma pessoa jurídica de direito público com limites territoriais determinados e competências administrativas genéricas. Os Territórios Federais são também chamados de autarquias territoriais ou geográficas, em razão de sua personalidade jurídica de direito público. Diferem os territórios, entretanto, das autarquias e dos demais entes da administração indireta pelo fato de estas terem capacidade administrativa específica e receberem da lei competência para atuar numa área determinada, ao passo que os Territórios possuem capacidade administrativa genérica para atuação em diversas áreas. Portanto, as autarquias têm capacidade de autoadministração, no entanto, para serem fruto da descentralização territorial, elas deverão ter a natureza de autarquia territorial.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(170L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("No que diz respeito às autarquias, entidades pertencentes à Administração Indireta, a assertiva que corretamente aponta algumas de suas características é a descentralização por serviços ou funcional e capacidade política.");
            question.setComentario("Errado\n A descentralização por serviços, funcional ou técnica é a que se verifica quando o poder público (União, Estados ou Municípios) cria uma pessoa jurídica de direito público ou privado e a ela atribui a titularidade e a execução de determinado serviço público, ex. autarquias. No entanto, as autarquias não têm capacidade política, não legislam, apenas se autoadministram.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(171L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Nos termos do parágrafo 8º do artigo 37, da Constituição Federal, a autonomia gerencial, orçamentária e financeira dos órgãos e entidades da Administração Indireta poderá ser reduzida, com base em contrato de gestão, por meio do qual o Poder Público estabelece, de acordo com as diretrizes governamentais, as metas de desempenho a serem cumpridas pela entidade.");
            question.setComentario("Errado\n Ao contrário do que assevera a assertiva, poderá ser ampliada, mediante contrato de gestão que tenha por objeto a fixação de metas de desempenho para o órgão ou entidade.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(172L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("No que diz respeito às autarquias, entidades pertencentes à Administração Indireta, a assertiva que corretamente aponta algumas de suas características é a sujeição a tutela e capacidade política.");
            question.setComentario("Errado\n No que diz respeito às autarquias, entidades pertencentes à Administração Indireta, a assertiva que corretamente aponta algumas de suas características é a sujeição a tutela, mas nenhum ente da Administração Indireta possui capacidade política, que é a capacidade para fazer as suas próprias leis, só quem a possui são os entes da administração direta.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(173L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("No que diz respeito às autarquias, entidades pertencentes à Administração Indireta, a assertiva que corretamente aponta algumas de suas características é a capacidade de autoadministração e sujeição a tutela.");
            question.setComentario("Correto\n Não apenas as autarquias como todos os entes da administração indireta tem capacidade de autoadministração e sujeição à tutela administrativa, exercido nos limites da lei pelo ente instituidor.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(174L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Quanto às autarquias o seu patrimônio é formado com a transferência de bens móveis e imóveis da entidade-matriz, os quais se incorporam ao ativo da nova pessoa jurídica.");
            question.setComentario("Correto\n O patrimônio da autarquia é formado a partir da transferência de bens móveis e imóveis do ente federado que a criou, os quais passam a pertencer à nova entidade. Extinguindo-se a autarquia, todo o seu patrimônio é reincorporado ao ativo da pessoa política a que ela pertencia.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(175L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Quanto às autarquias são pessoas jurídicas de Direito Privado, com função pública própria, típica e outorgada pelo Estado, criada através do registro de seus estatutos, segundo a lei que autoriza a sua criação.");
            question.setComentario("Errado\n As autarquias são pessoas jurídicas de direito público com função própria, típica e outorgada pelo Estado, criada mediante lei específica para a prestação de serviços públicos.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(176L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Quanto às autarquias os atos dos seus dirigentes equiparam-se aos atos administrativos, devendo observar os mesmos requisitos para sua expedição, sujeitando-se aos controles internos e ao exame de legalidade pelo Judiciário, pelas vias comuns ou especiais.");
            question.setComentario("Correto\n Por ser pessoa jurídica de direito público, os atos praticados pelos dirigentes das autarquias são verdadeiros atos administrativos e sofrem controle administrativo e controle de legalidade pelo Poder Judiciário.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(177L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Quanto às autarquias por realizarem serviços públicos centralizados, despersonalizados e limitados, se acham integradas na estrutura orgânica do Executivo e hierarquizadas à tutela do órgão público vinculado.");
            question.setComentario("Errado\n As autarquias, pessoas jurídicas de direito público, realizam serviços públicos descentralizados e não integram a estrutura orgânica do Executivo, mas sim a administração indireta, sofrendo apenas um controle finalístico do ente instituidor.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(178L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Quanto às autarquias nascem com os privilégios administrativos da entidade estatal que as institui, auferindo as vantagens tributárias e prerrogativas processuais da Fazenda Pública, além de outros que lhes forem outorgados por lei especial.");
            question.setComentario("Correto\n As autarquias gozam das mesmas prerrogativas e sujeições da Fazenda Pública, tais como juízo privado,impenhorabilidade e imprescritibilidade dos seus bens e imunidade tributária com relação ao seu patrimônio, suas rendas e sobre os serviços que elas prestem,desde que estejam vinculados a suas finalidades essenciais, ou às que destas decorram.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(179L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O regime jurídico das empresas públicas e sociedades de economia mista que desempenham atividade econômica em sentido estrito estabelece que a nomeação de seus dirigentes deve se dar na forma de seu estatuto social, podendo a lei condicionar tal nomeação à ratificação pelo Poder Legislativo.");
            question.setComentario("Errado\n Os dirigentes das empresas públicas e das sociedades de economia mista são investidos em seus cargos na forma que a lei ou seus estatutos estabelecerem. Quando se trata de entidade vinculada ao Poder Executivo, a nomeação do dirigente compete ao Chefe desse Poder. Quando a entidade for vinculada ao Legislativo ou ao Judiciário, deverá estar designada na lei ou nos estatutos da entidade a autoridade competente para a nomeação de seus dirigentes. No entanto, em nenhuma das situações apresentadas há a ratificação da escolha pelo Poder Legislativo. Nesse sentido, já decidiu o STF (ADI 1.642/MG, DJ 19/09/2008): 'Esta Corte em oportunidades anteriores definiu que a aprovação, pelo Legislativo, da indicação dos Presidentes das entidades da Administração Pública Indireta restringe-se às autarquias e fundações públicas, dela excluídas as sociedades de economia mista e as empresas públicas.'");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(180L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O regime jurídico das empresas públicas e sociedades de economia mista que desempenham atividade econômica em sentido estrito estabelece que seus bens são considerados de natureza pública, motivo pelo qual não estão sujeitos à constrição judicial.");
            question.setComentario("Errado\n O regime jurídico das empresas públicas e sociedades de economia mista que desempenham atividade econômica em sentido estrito estabelece que seus bens são considerados de natureza privada, motivo pelo qual estão sujeitos à constrição judicial. Serão considerados bens públicos apenas os bens das empresas públicas e sociedades de economia mista prestadoras de serviços públicos.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(181L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O regime jurídico das empresas públicas e sociedades de economia mista que desempenham atividade econômica em sentido estrito estabelece que a remuneração de seus agentes não está sujeita ao teto constitucional, a menos que a entidade receba recursos orçamentários para pagamento de despesa de pessoal ou de custeio em geral.");
            question.setComentario("Correto\n O regime jurídico das empresas públicas e sociedades de economia mista que desempenham atividade econômica em sentido estrito estabelece que a remuneração de seus agentes não está sujeita ao teto constitucional, no entanto,se tais entidades receberem recursos orçamentários para pagamento de despesa de pessoal ou de custeio em geral, passarão a se submeter ao teto previsto na Carta Magna.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(182L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O regime jurídico das empresas públicas e sociedades de economia mista que desempenham atividade econômica em sentido estrito estabelece que essas entidades devem assumir necessariamente a forma de sociedade anônima.");
            question.setComentario("Errado\n As empresas públicas exploradoras de atividade econômica ou prestadora de serviços públicos podem ser constituídas sob qualquer forma permitida em direito. Já as sociedades de economia mista, exploradoras de atividade econômica ou prestadoras de serviços públicos só podem ser constituídas sob a forma de sociedade anônima.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(183L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O regime jurídico das empresas públicas e sociedades de economia mista que desempenham atividade econômica em sentido estrito estabelece que a licitação e a contratação de obras, serviços, compras e alienações não precisam observar os princípios da Administração Pública.");
            question.setComentario("Errado\n O regime jurídico das empresas públicas e sociedades de economia mista que desempenham atividade econômica em sentido estrito estabelece que a licitação e a contratação de obras, serviços, compras e alienações precisam necessariamente observar osprincípios da Administração Pública.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(184L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Na denominação genérica de empresas estatais não se incluem as sociedades de economia mista.");
            question.setComentario("Errado\n Na denominação genérica de empresas estatais se incluem as sociedades de economia mista e as empresas públicas.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(185L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Ocorre delegação quando o Estado cria uma entidade e a ela transfere, por lei, determinado serviço público ou de utilidade pública.");
            question.setComentario("Errado\n Ocorre outorga quando o Estado cria uma entidade e a ela transfere, por lei, determinado serviço público ou de utilidade pública, como as pessoas da administração indireta. Já a delegação ocorre por meio de ato ou contrato para as concessionárias, permissionárias e autorizatárias de serviços públicos.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(186L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("As autarquias são entes administrativos autônomos criados por lei específica, porém sem personalidade jurídica.");
            question.setComentario("Errado\n As autarquias são pessoas jurídicas de direito público, criadas por lei específica. No entanto, tais entes não têm autonomia porque não têm o poder de criar o próprio direito, mas apenas a capacidade de se autoadministrar a respeito das matérias específicas que lhes foram destinadas pela pessoa jurídica pública política que lhes deu vida.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(187L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Serviço desconcentrado é todo aquele que a Administração executa centralizadamente, mas o distribui entre vários órgãos da mesma entidade.");
            question.setComentario("Correto\n Serviço desconcentrado é todo aquele que a Administração executa centralizadamente, mas o distribui entre vários órgãos da mesma entidade, ex. ministérios e secretarias. Já o serviço descentralizado é todo aquele que a Administração executa por meio de outros entes integrantes da administração indireta de forma descentralizada, ex. autarquias e fundações.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(188L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("As fundações prestam-se, principalmente, à realização de atividades lucrativas e típicas do Poder Público, mas de interesse coletivo.");
            question.setComentario("Errado\n As fundações prestam-se, principalmente, à realização de atividades não lucrativas e típicas do Poder Público, de interesse coletivo.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(189L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("É característica das fundações públicas de direito público, dentre outras a penhorabilidade dos seus bens.");
            question.setComentario("Errado\n É característica das fundações públicas de direito público, dentre outras, a impenhorabilidade e imprescritibilidade dos seus bens.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(190L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("É característica das fundações públicas de direito público, dentre outras a necessidade de inscrição dos seus atos constitutivos no Registro Civil de Pessoas Jurídicas.");
            question.setComentario("Errado\n As fundações públicas de direito público são espécie do gênero autarquia (STF, RE 215.741/SE, DJ 04/06/1999), sendo chamadas de autarquias fundacionais. Assim como as autarquias elas são criadas por meio de lei e independem de inscrição dos seus atos constitutivos no Registro Civil de Pessoas Jurídicas.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(191L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("É característica das fundações públicas de direito público, dentre outras a presunção de veracidade e executoriedade dos seus atos administrativos.");
            question.setComentario("Correto\n Por se submeterem ao regime jurídico de direito público, as fundações públicas de direito público praticam verdadeiros atos administrativos que têm como característica, dentre outras, a presunção de veracidade e executoriedade.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(192L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("É característica das fundações públicas de direito público, dentre outras a não sujeição à Lei de Licitações (Lei nº 8.666/93).");
            question.setComentario("Errado\n É característica das fundações públicas de direito público, dentre outras a sujeição à Lei de Licitações (Lei nº 8.666/93) para a aquisição de bens e serviços.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(193L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("É característica das fundações públicas de direito público, dentre outras a extinção independente de lei.");
            question.setComentario("Errado\n É característica das fundações públicas de direito público, dentre outras, a criação e extinção mediante lei.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(194L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Terá, obrigatoriamente, personalidade jurídica de direito privado uma sociedade de economia mista que exerça atividade econômica.");
            question.setComentario("Correto\n Não apenas a sociedade de economia mista que exerça atividade econômica tem personalidade jurídica de direito privado, como também a prestadora de serviços públicos. Em ambos os casos também necessariamente ela será constituída sob a forma de sociedade anônima.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(195L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Sujeitos e organizações privadas que se comprometem com a realização de interesses coletivos e a proteção de valores supraindividuais, mediante contratos de gestão, integram o terceiro setor.");
            question.setComentario("Correto\n O terceiro setor é formado por pessoas jurídicas de direito privado que prestam serviços públicos não exclusivos do Estado. No caso específico da Organização Social (OS), ente integrante do terceiro setor, ela recebe a qualificação de OS após a celebração do contrato de gestão com o ente ao qual se acha vinculada.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(196L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Como característica comum às entidades integrantes da Administração Indireta do Estado de São Paulo, pode- se mencionar a necessidade de lei autorizando a criação do ente.");
            question.setComentario("Correto\n Por meio de lei específica será criada autarquia e autorizada a criação de empresa pública, sociedade de economia mista e fundação. Ou seja, todos os entes da administração indireta necessitam de uma lei específica para serem instituídos. Vale ressaltar que a fundação é a única entidade da administração indireta que precisa, além de uma lei específica para ser instituída, uma lei complementar para definir em que área ela irá atuar.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(197L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Como característica comum às entidades integrantes da Administração Indireta do Estado de São Paulo, pode- se mencionar a submissão à autotutela da Administração Direta.");
            question.setComentario("Errado\n Como característica comum às entidades integrantes da Administração Indireta do Estado de São Paulo, pode-se mencionar a submissão à tutela da Administração Direta, o que caracteriza um controle finalístico, verifica-se por meio deste se a entidade está atuando de acordo com os fins para os quais ela foi criada. Não há subordinação ou hierarquia entre os entes da administração direta e indireta.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(198L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Como característica comum às entidades integrantes da Administração Indireta do Estado de São Paulo, pode- se mencionar a necessidade de concurso público para preenchimento dos cargos em comissão.");
            question.setComentario("Errado\n O concurso é de observância obrigatória de todos os entes da administração indireta, mas apenas para os cargos efetivos. Os casos em comissão são de livre nomeação e de livre exoneração, portanto, independem de prévio concurso público.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(199L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("É correta a afirmação de que o exercício do poder regulamentar está consubstanciado na competência dos Chefes do Poder Executivo para editar atos administrativos normativos destinados a dar fiel execução às leis.");
            question.setComentario("Correto\n O poder regulamentar designa a competência do Chefe do Poder Executivo para editar atos administrativos normativos. O exercício do poder regulamentar se materializa na edição de decretos e regulamentos destinados a dar fiel execução às leis. São os denominados decretos de execução ou decretos regulamentares com previsão no art. 84, inciso IV, da CF.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(200L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("No que concerne ao poder de polícia, é correto afirmar que é possível a utilização de meios indiretos de coação.");
            question.setComentario("Correto\n A autoexecutoriedade, um dos atributos do poder de polícia, é dividida em executoriedade e exigibilidade. A executoriedade significa a possibilidade de a administração realizar diretamente a execução forçada da medida que ela impôs ao administrado. Já a exigibilidade traduz a prerrogativa de a administração pública impor obrigações ao administrado, sem necessidade de prévia autorização judicial. A exigibilidade está ligada ao uso de meios coercitivos indiretos, tais como a aplicação de uma multa. Ao contrário, na executoriedade os meios coercitivos são diretos, como a apreensão de mercadorias.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(201L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("No que concerne ao poder de polícia, é correto afirmar que constitui-se somente por atividades preventivas.");
            question.setComentario("Errado\n O poder de polícia administrativa pode ser exercido preventiva ou repressivamente. Ele será preventivo quando o poder público estabelece normas que limitam ou condicionam a utilização de bens ou o exercício de atividades privadas que possam afetar a coletividade. Para isso é necessária a anuência da administração pública por meio de alvarás. Já a atividade repressiva de polícia administrativa é consubstanciada na aplicação de sanções administrativas como conseqüência da prática de infrações a normas de polícia pelos particulares a elas sujeitos.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(202L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("No que concerne ao poder de polícia, é correto afirmar que é puramente discricionário.");
            question.setComentario("Errado\n Embora a discricionariedade seja a regra no exercício do poder de polícia, nada impede que a lei, relativamente a determinados atos ou fatos, estabeleça total vinculação da atuação administrativa a seus preceitos.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(203L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("No que concerne ao poder de polícia, é correto afirmar que Incide sobre pessoas.");
            question.setComentario("Errado\n O poder de polícia não incide sobre pessoas, ele é um poder de que dispõe a administração pública para, na forma da lei, condicionar ou restringir o uso de bens, o exercício de direitos e a prática de atividades privadas, visando a proteger os interesses gerais da coletividade.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(204L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Sobre o poder disciplinar, é correto afirmar que existe discricionariedade quanto a certas infrações que a lei não define, como ocorre, por exemplo, com o 'procedimento irregular' e a 'ineficiência no serviço', puníveis com pena de demissão.");
            question.setComentario("Correto\n Regra geral, o poder disciplinar é discricionário. Há situações, porém, em que a lei descreve objetivamente infrações administrativas e lhes comina penalidades como atos vinculados, obrigatórios, de conteúdo definido e invariável.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(205L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Sobre o poder disciplinar, é correto afirmar que há discricionariedade para a Administração em instaurar procedimento administrativo, caso tome conhecimento de eventual falta praticada.");
            question.setComentario("Errado\n Embora possa existir alguma discricionariedade na graduação de uma penalidade disciplinar, ou no enquadramento de determinada conduta, nenhuma discricionariedade existe quanto ao dever de punir quem comprovadamente tenha praticado uma infração disciplinar.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(206L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Sobre o poder disciplinar, é correto afirmar que inexiste discricionariedade quando a lei dá à Administração o poder de levar em consideração, na escolha da pena, a natureza e a gravidade da infração e os danos que dela provierem para o serviço público.");
            question.setComentario("Errado\n Ao contrário, existe discricionariedade quando a lei dá à Administração a escolha na ou graduação da penalidade. Assim, há discricionariedade na graduação de umapenalidade disciplinar ou no enquadramento de determinada conduta descrita na lei mediante a utilização de um conceito jurídico indeterminado.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(207L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Sobre o poder disciplinar, é correto afirmar que o poder disciplinar é sempre discricionário e decorre da supremacia especial que o Estado exerce sobre aqueles que se vinculam à Administração.");
            question.setComentario("Errado\n Regra geral o poder disciplinar é discricionário, no entanto, há situações em que a lei descreve objetivamente infrações administrativas e lhes comina penalidades como atos vinculados, obrigatórios, de conteúdo definido e invariável.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(208L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Sobre o poder disciplinar, é correto afirmar que é possível, em determinadas hipóteses, que a Administração deixe de punir o servidor comprovadamente faltoso.");
            question.setComentario("Errado\n Quando a Administração verifica que um servidor público ou um particular que com ela possua vinculação jurídica específica, praticou uma infração administrativa, ela é obrigada a puni-lo; não há discricionariedade quanto a punir ou não alguém que comprovadamente tenha praticado uma infração disciplinar.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(209L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Sobre o poder hierárquico, é correto afirmar que é possível a apreciação da conveniência e da oportunidade das determinações superiores pelos subalternos.");
            question.setComentario("Errado\n Os servidores públicos têm o dever de acatar e cumprir as ordens de seus superiores hierárquicos em conseqüência do dever de obediência, exceto quando manifestamente ilegais.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(210L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Sobre o poder hierárquico, é correto afirmar que em geral, a responsabilidade pelos atos e medidas decorrentes da delegação cabe à autoridade delegante.");
            question.setComentario("Errado\n De acordo com o art. 13, Lei nº 9784/99, os atos considerar-se-ão praticados pelo agente delegado, portanto, é o agente delegado e não o agente delegante a responsabilidade pelos atos praticados.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(211L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Sobre o poder hierárquico, é correto afirmar que as determinações superiores - com exceção das manifestamente ilegais -, devem ser cumpridas; podem, no entanto, ser ampliadas ou restringidas pelo inferior hierárquico.");
            question.setComentario("Errado\n Correta a questão ao dizer que as determinações superiores - com exceção das manifestamente ilegais -, devem ser cumpridas. No entanto, erra ao afirmar que tais ordens poderão ser ampliadas ou restringidas pelo inferior hierárquico, este deverá acatar e cumprir as ordens emanadas do superior na estrita conformidade como foram expedidas.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(212L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Sobre o poder hierárquico, é correto afirmar que rever atos de inferiores hierárquicos é apreciar tais atos em todos os seus aspectos, isto é, tanto por vícios de legalidade quanto por razões de conveniência e oportunidade.");
            question.setComentario("Correto\n O superior detém o chamado poder de controle sobre os atos praticados pelos seus subordinados, dentro desse poder se inclui a manutenção dos atos válidos, convenientes e oportunos, a convalidação de atos com defeitos sanáveis, quando esta for conveniente e possível, a anulação de atos ilegais e a revogação de atos discricionários inoportunos ou inconvenientes.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(213L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Sobre o poder hierárquico, é correto afirmar que a avocação de ato pelo superior não desonera o inferior da responsabilidade pelo mencionado ato.");
            question.setComentario("Errado\n A avocação é ato discricionário mediante o qual o superior hierárquico traz para si o exercício temporário de determinada competência atribuída por lei a um subordinado. Quando o superior avoca a competência do seu subordinado, este fica liberado de toda e qualquer responsabilidade pelo ato praticado pelo seu superior por motivos óbvios, não foi ele quem praticou o ato e seria injusto e até ilegal que ele fosse responsabilizado pelo mesmo.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(214L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("No que diz respeito ao poder disciplinar da Administração Pública, é correto afirmar que o poder disciplinar é discricionário apenas na gradação da penalidade; isto significa que a Administração, tendo conhecimento de falta praticada por determinado servidor, está obrigada a instaurar procedimento administrativo para sua apuração.");
            question.setComentario("Errado\n A Administração, tendo conhecimento de falta praticada por determinado servidor, está obrigadaa instaurar procedimento administrativo para sua apuração. No entanto, terá discricionariedade na gradação de uma penalidade disciplinar ou no enquadramento de determinada conduta descrita na lei mediante a utilização de um conceito jurídico indeterminado.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(215L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("No que diz respeito ao poder disciplinar da Administração Pública, é correto afirmar que o poder disciplinar é correlato com o poder hierárquico, mas com ele não se confunde; no uso do poder disciplinar, a Administração Pública controla o desempenho das funções executivas e a conduta interna de seus agentes, responsabilizando-os pelas faltas cometidas.");
            question.setComentario("Correto\n No exercício do poder hierárquico há as prerrogativas exercidas pelo superior sobre seus subordinados, de dar ordens, fiscalizar, controlar, delegar e avocar competências. Já no poder disciplinar há aplicação de sanção aos servidores ou a particulares ligados à Administração mediante algum vínculo jurídico específico. Quando a Administração aplica uma sanção disciplinar a um agente público, essa atuação decorre imediatamente do poder disciplinar e mediatamente do poder hierárquico.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(216L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("No que diz respeito ao poder disciplinar da Administração Pública, é correto afirmar que algumas penalidades administrativas podem ser aplicadas ao infrator, sem prévia apuração por meio de procedimento legal.");
            question.setComentario("Errado\n Toda e qualquer aplicação de sanção administrativa exige motivação e direito ao contraditório e à ampla defesa.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(217L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("No que diz respeito ao poder disciplinar da Administração Pública, é correto afirmar que o poder disciplinar é o que cabe à Administração Pública para apurar infrações e aplicar penalidades aos servidores públicos, não abrangendo particulares, ainda que sujeitos à disciplina administrativa.");
            question.setComentario("Errado\n No que diz respeito ao poder disciplinar da Administração Pública, é correto afirmar que o poder disciplinar é o que cabe à Administração Pública para apurar infrações e aplicar penalidades aos servidores públicos, abrangendo também particulares ligados à Administração Pública mediante algum vínculo jurídico específico (ex. concessionários e permissionários de serviços públicos).");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(218L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("No que diz respeito ao poder disciplinar da Administração Pública, é correto afirmar que uma mesma infração pode dar ensejo a punição administrativa e a punição criminal; no entanto, a aplicação de ambas as penalidades, nas respectivas searas, caracteriza evidente bis in idem.");
            question.setComentario("Errado\n No que diz respeito ao poder disciplinar da Administração Pública, é correto afirmar que uma mesma infração pode dar ensejo a punição administrativa e a punição criminal. A aplicação de ambas as penalidades, nas respectivas searas, não caracteriza evidente bis in idem pois são esferas independentes.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(219L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Pelo exercício do Poder de Polícia, a Administração está autorizada a cobrar taxa.");
            question.setComentario("Correto\n O poder de polícia é a atividade do Estado consistente em limitar o exercício dos direitos individuais em benefício do interesse público. O exercício desse poder é um dos fatos geradores da taxa, art. 145, inciso II, da Carta Magna e art. 78 do Código Tributário Nacional.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(220L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("NÃO exemplifica uma forma de atuação da polícia administrativa a inspeção em estabelecimento, destinada à investigação de crime.");
            question.setComentario("Correto\n A polícia administrativa incide sobre bens, atividades, direitos, portanto, ela não é destinada à investigação de crimes que fica por conta da polícia judiciária. A linha diferencial entre a polícia administrativa e a polícia judiciária é justamente na ocorrência ou não do ilícito penal.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(221L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O poder de polícia tanto pode ser discricionário, o que ocorre na maioria dos casos, quanto vinculado.");
            question.setComentario("Correto\n Quando a lei já estabelece que, diante de determinados requisitos, a Administração terá que adotar solução previamente estabelecida, sem qualquer possibilidade de opção, o poder de polícia será vinculado. No entanto, quando a Administração tiver que decidir qual o melhor momento de agir, qual o meio de ação mais adequado, qual a sanção cabível diante das previstas na norma legal, o poder de polícia será discricionário.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(222L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O Poder Legislativo exerce o poder de polícia ao criar, por lei, as chamadas limitações administrativas ao exercício das liberdades públicas.");
            question.setComentario("Correto\n Considerando o poder de polícia em sentido amplo, de modo que abranja não apenas as atividades do Poder Executivo como também do Poder Legislativo, pode-se dizer que pelas leis criam-se as limitações administrativas ao exercício dos direitos e das atividades individuais, estabelecendo-se normas gerais e abstratas dirigidas indistintamente às pessoas que estejam em idêntica situação; disciplinando a aplicação da lei aos casos concretos. Já o Poder Executivo poderá baixar decretos, resoluções, portarias, instruções.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(223L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O objeto do poder de polícia é todo bem, direito ou atividade individual que possa afetar a coletividade ou pôr em risco a segurança nacional.");
            question.setComentario("Correto\n O poder de polícia é aquele que dispõe a Administração Pública para, na forma da lei, condicionar ou restringir o uso de bens, o exercício de direitos e a prática de atividades privadas, visando a proteger os interesses gerais da coletividade e a segurança nacional.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(224L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O poder de polícia tem atributos específicos ao seu exercício, que são: a autoexecutoriedade e a tipicidade.");
            question.setComentario("Errado\n Os atributos do poder de polícia são a discricionariedade, a autoexecutoriedade e a coercibilidade.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(225L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O Poder Legislativo aprova lei que proíbe fumar em lugares fechados, cujo texto prevê o seu detalhamento por ato do Poder Executivo. Sancionando a Lei, o Chefe do Poder Executivo edita, imediatamente, decreto detalhando a aplicação da norma, conforme previsto. Ao fazê-lo o Chefe do Poder Executivo exerce o poder regulamentar.");
            question.setComentario("Correto\n O poder regulamentar é exclusivo do Chefe do Poder Executivo para editar atos administrativos normativos que assumem a forma de decreto. O exercício do poder regulamentar, em regra, se materializa na edição de decretos e regulamentos destinados a dar fiel execução às leis. Ou seja, a lei já existe e o Chefe do Poder Executivo irá apenas regulamentar a respectiva lei.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(226L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O poder disciplinar inerente à Administração Pública para o desempenho de suas atividades aplica-se a todos os servidores e administrados sujeitos ao poder de polícia.");
            question.setComentario("Errado\n O poder disciplinar é destinado a punir internamente as infrações funcionais de seus servidores, assim como para punir as infrações administrativas cometidas por particulares a ele ligados mediante algum vínculo jurídico específico (ex. concessionários e permissionários de serviços públicos).");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(227L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O poder disciplinar inerente à Administração Pública para o desempenho de suas atividades decorre do poder normativo atribuído à Administração e que lhe permite estabelecer as sanções cabíveis aos administrados quando praticarem atos contrários à lei.");
            question.setComentario("Errado\n O poder disciplinar não atinge os administrados, esses são punidos por meio do poder de polícia. O poder disciplinar é destinado a punir internamente as infrações funcionais de seus servidores, assim como para punir as infrações administrativas cometidas por particulares a ele ligados mediante algum vínculo jurídico específico (ex. concessionários e permissionários de serviços públicos).");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(228L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O poder disciplinar inerente à Administração Pública para o desempenho de suas atividades aplica-se aos servidores públicos hierarquicamente subordinados, bem como àqueles dotados de autonomia funcional.");
            question.setComentario("Correto\n O poder disciplinar inerente à Administração Pública para o desempenhode suas atividades aplica-se aos servidores públicos hierarquicamente subordinados (aqueles que têm uma relação direta com a Administração), bem como àqueles dotados de autonomia funcional (aqueles que têm uma relação indireta com a administração, ex. concessionários e permissionários de serviços públicos).");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(229L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O poder disciplinar inerente à Administração Pública para o desempenho de suas atividades aplica-se discricionariamente, permitindo a não aplicação de penalidades previstas em lei na hipótese de arrependimento e desde que não tenha havido prejuízo econômico ao erário.");
            question.setComentario("Errado\n Quando a Administração constata que um servidor público ou um particular que com ela possua vinculação jurídica específica praticou uma infração administrativa, ela e obrigada a puni-lo. Não há discricionariedade quanto a punir ou não alguém que comprovadamente tenha praticado uma infração disciplinar.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(230L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O poder disciplinar inerente à Administração Pública para o desempenho de suas atividades dirige-se exclusivamente aos servidores públicos sujeitos ao poder hierárquico estrito da Administração, não se aplicando a outras pessoas ou aos servidores que possuam independência funcional.");
            question.setComentario("Errado\n O poder disciplinar inerente à Administração Pública para o desempenho de suas atividades dirige-se não apenas aos servidores públicos sujeitos ao poder hierárquico estrito da Administração, como também se aplica a outras pessoas ou aos servidores que possuam independência funcional.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(231L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O Poder disciplinar atribuído à Administração pública autoriza a aplicação de penalidades aos servidores públicos e demais pessoas sujeitas à disciplina administrativa.");
            question.setComentario("Correto\n O poder disciplinar é destinado a punir internamente as infrações funcionais de seus servidores, assim como para punir as infrações administrativas cometidas por particulares a ele ligados mediante algum vínculo jurídico específico (ex. concessionários e permissionários de serviços públicos).");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(232L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O Poder disciplinar atribuído à Administração pública traduz-se no poder da Administração de impor limitações às liberdades individuais nos limites pré-estabelecidos na lei.");
            question.setComentario("Errado\n O Poder de Polícia atribuído à Administração pública traduz-se no poder da Administração de impor limitações às liberdades individuais nos limites pré-estabelecidos na lei.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(233L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O Poder disciplinar atribuído à Administração pública caracteriza-se como o poder conferido às autoridades administrativas de dar ordens a seus subordinados e de controlar as atividades dos órgãos inferiores.");
            question.setComentario("Errado\n O Poder Hierárquico atribuído à Administração pública caracterizase como o poder conferido às autoridades administrativas de dar ordens a seus subordinados e de controlar as atividades dos órgãos inferiores.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(234L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O Poder disciplinar atribuído à Administração pública é o poder de editar atos normativos para ordenar a atuação dos diversos órgãos e agentes dotados das competências especificadas em lei.");
            question.setComentario("Errado\n O poder disciplinar é um poder-dever que possibilita à Administração Pública punir internamente as infrações funcionais de seus servidores e punir infrações administrativas cometidas por particulares a ela ligados mediante algum vínculo jurídico específico.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(235L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O Poder disciplinar atribuído à Administração pública é o poder de aplicar, aos agentes públicos e aos administrados em geral, as penalidades fixadas em lei, observado o devido processo legal.");
            question.setComentario("Errado\n O Poder disciplinar atribuído à Administração pública é o poder de aplicar, aos agentes públicos e aos administrados ligados à Administração Pública mediante algum vínculo jurídico, as penalidades fixadas em lei, observado o devido processo legal.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(236L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Acerca dos poderes e deveres do administrador público, é correto afirmar que o dever de prestar contas aplica-se apenas aos ocupantes de cargos eletivos e aos agentes da administração direta que tenham sob sua guarda bens ou valores públicos.");
            question.setComentario("Errado\n Acerca dos poderes e deveres do administrador público é correto afirmar que o dever de prestar contas aplica-se a qualquer pessoa que tenham sob sua guarda bens ou valores públicos.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(237L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Acerca dos poderes e deveres do administrador público, é correto afirmar que o agente público, mesmo quando despido da função ou fora do exercício do cargo, pode usar da autoridade pública para sobrepor-se aos demais cidadãos.");
            question.setComentario("Errado\n Acerca dos poderes e deveres do administrador público é correto afirmar que o agente público, apenas quando no exercício de suas atividades inerentes ao cargo, pode usar da autoridade pública para sobrepor-se aos demais cidadãos.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(238L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Acerca dos poderes e deveres do administrador público, é correto afirmar que o poder tem, para o agente público, o significado de dever para com a comunidade e para com os indivíduos, no sentido de que, quem o detém está sempre na obrigação de exercitá-lo.");
            question.setComentario("Correto\n O administrador público não tem a faculdade de exercer ou não os poderes da Administração, em consonância com os princípios da supremacia e da indisponibilidade do interesse público, ele tem o poder-dever de agir, de exercitá-los.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(239L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Acerca dos poderes e deveres do administrador público, é correto afirmar que o dever de eficiência exige que o administrador público, no desempenho de suas atividades, atue com ética, honestidade e boa-fé.");
            question.setComentario("Errado\n Acerca dos poderes e deveres do administrador público é correto afirmar que o dever de probidade exige que o administrador público, no desempenho de suas atividades, atue com ética, honestidade e boa-fé.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(240L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Acerca dos poderes e deveres do administrador público, é correto afirmar que o dever de probidade traduz-se na exigência de elevado padrão de qualidade na atividade administrativa.");
            question.setComentario("Errado\n Acerca dos poderes e deveres do administrador público é correto afirmar que o dever de eficiência traduz-se na exigência de elevado padrão de qualidade na atividade administrativa.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(241L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Dentre as características do poder disciplinar inclui-se a dispensabilidade da apuração regular da falta disciplinar para a aplicação da punição interna da Administração, tendo em vista a informalidade do poder disciplinar.");
            question.setComentario("Errado\n Não é possível no exercício do poder disciplinar que haja a dispensa da apuração regular da falta disciplinar uma vez que é obrigatória a instauração de um processo em que seja assegurado o contraditório e a ampla defesa para a aplicação da penalidade, tendo vista a formalidade deste poder.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(242L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Dentre as características do poder disciplinar inclui-se a identidade de fundamentos entre a punição disciplinar e a criminal, assim como da natureza das penas.");
            question.setComentario("Errado\n Não há identidade entre o poder disciplinar e a punição criminal, já que está dentro do jus puniendi do Estado e é exercido pelo Poder Judiciário. Vale salientar que a natureza das respectivas penas são diversas, no poder disciplinar a pena é administrativa, já no poder punitivo do Estado a natureza da penalidade é criminal.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(243L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Dentre as características do poder disciplinar inclui-se a vinculação obrigatória à prévia definição da lei sobre a infração e a respectiva sanção.");
            question.setComentario("Errado\n O poder disciplinar é, em regra, discricionário. Portanto, não há uma vinculação obrigatória à prévia definição da lei sobre a infração e a respectiva sanção, pois muitas vezes uma determinada conduta é descrita na lei mediante a utilização de um conceito jurídico indeterminado.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(244L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Dentre as características do poder disciplinar inclui-se a Imprescindibilidade da motivação da punição disciplinar para a validade da pena.");
            question.setComentario("Correto\n O ato de aplicação da penalidade deverá sempre ser motivado. Essa regra não comporta exceção, toda e qualquer aplicação de sanção administrativa exige motivação, sobretudo porque, impreterivelmente, deve ser a todos assegurado o direito ao contraditório e à ampla defesa.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(245L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Dentre as características do poder disciplinar inclui-se a discricionariedade ilimitada quanto ao dever de punir, cabendo à autoridade competente decidir entre instaurar ou não o procedimento administrativo em caso de falta disciplinar.");
            question.setComentario("Errado\n Não há discricionariedade do administrador entre punir ou não diante de uma infração praticada, muito menos uma discricionariedade ilimitada. A autoridade administrativa competente deverá instaurar o procedimento administrativo para apurar a falta disciplinar, sob pena de responsabilidade.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(246L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A restrição de acesso a local de repartição pública, onde se realiza atendimento ao público, de determinada pessoa que rotineiramente ali comparece, causando tumultos aos trabalhos desenvolvidos, é admissível, com base no poder de polícia exercido em prol da coletividade.");
            question.setComentario("Correto\n A Administração Pública pode exercer poder de polícia sobre todas as condutas ou situações particulares que possam, direta ou indiretamente, afetar os interesses da coletividade.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(247L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Na esfera federal, prescreve em dez anos a ação punitiva da Administração, no exercício do poder de polícia, objetivando apurar infração (que não constitua crime), contados da data da prática do ato ou, no caso de infração permanente ou continuada, do dia em que tiver cessado.");
            question.setComentario("Errado\n A Lei nº 9873/99, art. 1º, caput, especificamente aplicável à esfera federal, estabelece um prazo prescricional de cinco anos das ações punitivas decorrentes do exercício do poder de polícia.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(248L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Nem sempre o poder de polícia será discricionário, ou seja, em algumas hipóteses, a lei já estabelece que, diante de determinados requisitos, a Administração terá que adotar solução previamente estabelecida, como é o caso da autorização.");
            question.setComentario("Errado\n A autorização é um ato discricionário e pode ser simplesmente negada ao particular mesmo que este satisfaça todas as condições legais e regulamentares. É também um ato precário sendo passível de revogação pelo poder público a qualquer tempo, sem gerar, em regra, direito a indenização para o particular.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(249L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("No desempenho do poder de polícia, a Administração Pública não pode determinar medidas sumárias, isto é, sem a oitiva do particular; logo, ainda que se trate de situação de urgência, mister se faz a garantia da plenitude da defesa.");
            question.setComentario("Errado\n No caso de medidas urgentes, ex. desabamento, é possível a prática do ato administrativo fundamentado no poder de polícia sem a plenitude da defesa. No entanto, nada impede que após a prática do ato seja assegurado o contraditório e a ampla defesa aquele que se sentiu prejudicado.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(250L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Polícia administrativa e polícia judiciária não se confundem; a primeira rege-se pelo Direito Administrativo e incide sobre bens, direitos ou atividades; a segunda, pelo Direito Processual Penal, incidindo sobre pessoas.");
            question.setComentario("Correto\n Será atividade de polícia administrativa a que incida na seara das infrações administrativas e atividade de polícia judiciária a concernente ao ilícito de natureza penal. O exercício da primeira esgota-se no âmbito da função administrativa, enquanto a polícia judiciária prepara a atuação da função jurisdicional penal.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(251L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Os meios de atuação do poder de polícia compreendem somente duas categorias: atos administrativos preventivos, como, por exemplo, vistoria e fiscalização, e atos administrativos repressivos, como interdição de atividade e apreensão de mercadorias deterioradas.");
            question.setComentario("Errado\n Os meios de atuação do poder de polícia englobam atos normativos em geral, a saber: pela lei, criam-se as limitações administrativas ao exercício dos direitos e das atividades individuais, estabelecendo-se normas gerais e abstratas dirigidas indistintamente às pessoas que estejam em idêntica situação; bem como por meio de atos administrativos e operações materiais de aplicação da lei ao caso concreto, compreendendo medidas preventivas com o objetivo de adequar o comportamento individual à lei e medidas repressivas com a finalidade de coagir o infrator a cumprir a lei.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(252L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A discricionariedade do poder discricionário diz respeito apenas à conveniência, oportunidade e conteúdo do ato administrativo.");
            question.setComentario("Correto\n A discricionariedade do ato administrativo reside na escolha da oportunidade e da conveniência bem como do conteúdo do ato administrativo, nesse aspecto o administrador tem a liberdade de escolher como irá atuar em busca do interesse público.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(253L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Poder hierárquico é a faculdade de punir as infrações funcionais dos servidores e demais pessoas sujeitas à disciplina dos órgãos e serviços da Administração.");
            question.setComentario("Errado\n Poder disciplinar é o poder-dever de punir as infrações funcionais dos servidores e demais pessoas sujeitas à disciplina dos órgãos e serviços da Administração.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(254L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Por força do poder disciplinar o Chefe do Executivo pode distribuir e escalonar as funções dos seus órgãos, ordenar e rever a atuação dos seus agentes.");
            question.setComentario("Errado\n Por força do poder hierárquico o superior pode distribuir e escalonar as funções dos seus órgãos, ordenar e rever a atuação dos seus agentes.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(255L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Poder regulamentar é a faculdade de que dispõem os Chefes de Poder Executivo de explicar a lei para sua correta execução, ou de expedir decretos autônomossobre matéria de sua competência ainda não disciplinada em lei.");
            question.setComentario("Correto\n O exercício do poder regulamentar, em regra, se materializa na edição de decretos e regulamentos destinados a dar fiel execução às leis. São os denominados decretos de execução ou decretos regulamentares. Ao lado dos decretos de execução ou regulamentares passou a existir no ordenamento constitucional vigente, a partir da EC 32/2001, a edição de decretos autônomos, decretos estes que não se destinam a regulamentar determinada lei, mas para tratar das matérias específicas descritas no inciso VI do art. 84 da Carta Magna.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(256L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Quando o Poder Executivo exorbita do seu poder regulamentar pode ter seus atos sustados pelo Congresso Nacional.");
            question.setComentario("Correto\n A Carta Magna, em seu art. 49, V, atribui competência ao Congresso Nacional para “sustar os atos normativos do Poder Executivo que exorbitem do poder regulamentar”.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(257L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O poder disciplinar da Administração Pública e o poder punitivo do Estado (jus puniendi) exercido pelo Poder Judiciário não tem qualquer distinção no que se refere à sua natureza.");
            question.setComentario("Errado\n A natureza jurídica do poder disciplinar é diferente da natureza jurídica do poder punitivo do Estado. Enquanto no primeiro a Administração Pública tem a possibilidade de punir internamente as infrações funcionais de seus servidores e dos particulares a ela ligados mediante algum vínculo jurídico específico (ex. contrato administrativo), no segundo o Estado, através do Poder Judiciário, reprime os crimes e contravenções tipificados nas leis penais. Assim, podemos dizer que toda e qualquer pessoa está sujeita ao poder punitivo do Estado, ao passo que as pessoas que possuem algum vínculo específico com a administração pública (por exemplo, vínculo funcional ou vínculo contratual) estão sujeitas ao poder disciplinar.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(258L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Os princípios da razoabilidade e da proporcionalidade são apontados como relevantes e eficazes limitações impostas ao poder discricionário da Administração Pública.");
            question.setComentario("Correto\n A discricionariedade do administrador não é ilimitada, ele atua dentro da sua oportunidade e conveniência, mas sofrendo os limites da lei e dos princípios da razoabilidade e da proporcionalidade. Acaso esses limites sejam desrespeitados, o ato será anulado pelo próprio administrador ou pelo Poder Judiciário com efeitos ex tunc.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(259L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A Administração Pública, como resultado do poder hierárquico, é dotada da prerrogativa de ordenar, coordenar, controlar e corrigir as atividades de seus órgãos e agentes no seu ambiente interno.");
            question.setComentario("Correto\n Enquanto o poder disciplinar serve para punir aqueles que têm uma relação direta ou indireta com o Poder Público, o poder hierárquico confere ao administrador a prerrogativa de ordenar, coordenar, controlar e corrigir as atividades de seus órgãos e agentes no seu ambiente interno.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(260L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Sobre o abuso de poder, é correto afirmar que todo ato abusivo é nulo, por excesso ou desvio de poder.");
            question.setComentario("Correto\n Abuso de poder é o gênero com duas espécies, desvio de poder e excesso de poder. O desvio de poder caracteriza-se por vício no elemento finalidade, já o excesso de poder por vício no elemento competência, o que torna o ato nulo.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(261L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A polícia administrativa incide sobre os bens, direitos e atividades da população do território.");
            question.setComentario("Correto\n Enquanto a polícia judiciária incide sobre pessoas a polícia administrativa incide sobre bens, atividades, direitos ou serviços dos indivíduos sempre em busca do interesse público.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(262L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O poder de polícia na área administrativa não difere do poder de polícia na área judiciária.");
            question.setComentario("Errado\n São poderes distintos, enquanto a polícia administrativa incide sobre bens, direitos, atividades, serviços, a polícia judiciária (jus puniendi do Estado) incide sobre as pessoas na punição de infrações de natureza penal.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(263L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O poder de polícia é exercido por meio de medidas preventivas, vedadas as medidas repressivas.");
            question.setComentario("Errado\n O poder de polícia é exercido por meio de medidas preventivas, também sendo possível as medidas repressivas.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(264L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O poder de polícia tem como atributos, dentre outros, a autoexecutoriedade e a coercibilidade.");
            question.setComentario("Correto\n O poder de polícia tem como atributos a discricionariedade, a autoexecutoriedade e a coercibilidade.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(265L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O poder de polícia tem como fundamentos os princípios da legalidade e da moralidade.");
            question.setComentario("Errado\n O fundamento do poder de polícia é a supremacia do interesse público.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(266L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O poder de polícia não se subordina a limites, visto que, sendo prioritariamente discricionário, a forma de atuação fica ao livre arbítrio da autoridade.");
            question.setComentario("Errado\n O poder de polícia é limitado não só pela lei como também pelos princípios da razoabilidade e proporcionalidade.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(267L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("No que se refere ao Poder de Polícia, tem como meios de atuação os atos normativos e os atos administrativos e operações materiais de aplicação da lei ao caso concreto.");
            question.setComentario("Correto\n Os meios de atuação do poder de polícia englobam atos normativos em geral, a saber: pela lei, criam-se as limitações administrativas ao exercício dos direitos e das atividades individuais, estabelecendo-se normas gerais e abstratas dirigidas indistintamente às pessoas que estejam em idêntica situação; bem como por meio de atos administrativos e operações materiais de aplicação da lei ao caso concreto, compreendendo medidas preventivas com o objetivo de adequar o comportamento individual à lei e medidas repressivas com a finalidade de coagir o infrator a cumprir a lei.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(268L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("No que se refere ao Poder de Polícia, na área de atuação administrativa, tem por escopo punir os infratores da lei penal.");
            question.setComentario("Errado\n O Poder de Polícia, na área de atuação judiciária, tem por escopo punir os infratores da lei penal.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(269L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("No que se refere ao Poder de Polícia, possui como atributos a legalidade, a necessidade e a proporcionalidade.");
            question.setComentario("Errado\n Os atributos do poder de polícia são a discricionariedade, autoexecutoriedade e coercibilidade.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(270L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("No que se refere ao Poder de Polícia, a licença constitui modalidade de ato de polícia vinculado.");
            question.setComentario("Correto\n A licença é um ato administrativo vinculado e definitivo pelo qual a administração pública reconhece que o particular detentor de um direito subjetivo preenche as condições para o seu gozo. Ex, construção de um edifício em terreno de propriedade do administrado.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(271L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("São, respectivamente, exemplos da aplicação do poder disciplinar e do poder de polícia, no âmbito da Administração Pública, a aplicação de penalidade de demissão a servidor e a interdição de estabelecimento por razões sanitárias.");
            question.setComentario("Correto\n O poder disciplinar atinge os servidores públicos e dois exemplos de sua aplicação está na demissão do respectivo servidor ou na cassação da sua aposentadoria ou disponibilidade. Já o poder de polícia atinge o particular que descumpre as regras estabelecidas em prol do interesse público, as penalidades aplicadas nesse caso poderão ser por exemplo, a interdição de estabelecimento o apreensão de mercadorias por razões sanitárias.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(272L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Dentre os chamados Poderes da Administração, aquele que pode ser qualificado como autônomo e originário em determinadas situações previstas na Constituição Federal é o poder regulamentar, que permite o exercício da função normativa do Poder Executivo com fundamento direto na Constituição Federal.");
            question.setComentario("Correto\n A Carta Magna em seu art. 84, VI, prevê a possibilidade de serem editados decretos como atos primários, isto é, atos que decorrem diretamente do texto constitucional, decretos que não são expedidos em função de alguma lei ou de algum outro ato infraconstitucional.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(273L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O poder normativo ou poder regulamentar é o que cabe ao Chefe do Poder Executivo da União, dos Estados e dos Municípios, de editar normas complementares à lei.");
            question.setComentario("Correto\n Os decretos de execução ou regulamentares servem para que o Chefe do Poder Executivo editem normas complementares à lei para a fiel execução desta. Os decretos de execução, uma vez que necessitam sempre de uma lei prévia a ser regulamentada, são atos normativos ditos secundários, situam-se hierarquicamente abaixo da lei, a qual não podem contrariar, sob pena de serem declarados ilegais.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(274L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O poder hierárquico é o que cabe à Administração para apurar infrações e aplicar penalidades aos servidores e às demais pessoas sujeitas à disciplina administrativa.");
            question.setComentario("Errado\n O poder disciplinar é o que cabe à Administração para apurar infrações e aplicar penalidades aos servidores e às demais pessoas sujeitas à disciplina administrativa.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(275L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O poder de polícia é exercido sobre todas as atividades que possam, direta ou indiretamente, afetar os interesses da coletividade.");
            question.setComentario("Correto\n O poder de polícia tem como fundamento o interesse público, portanto, qualquer atividade que possa afetar tal interesse será controlado pelo referido poder.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(276L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A avocação consiste no poder que possui o superior de chamar para si a execução de atribuições cometidas originalmente a seus subordinados.");
            question.setComentario("Correto\n A avocação temporária de competência deverá ocorrer de forma excepcional e devidamente motivada pelo superior hierárquico que chama para si atribuições do seu subordinado (Lei nº 9784/99, art. 15).");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(277L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O poder de polícia originário é aquele exercido pelas pessoas políticas do Estado (União, Estados, Distrito Federal e Municípios) alcançando os atos administrativos.");
            question.setComentario("Correto\n O poder de polícia originário é aquele exercido pela administração direta, ou seja, pelos órgãos integrantes da estrutura das diversas pessoas políticas da federação (União, estados, Distrito Federal e municípios) e o poder de polícia derivado é aquele executado pelas pessoas administrativas do Estado, isto é, pelas entidades integrantes da administração indireta.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(278L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("É exemplo que se refere ao poder regulamentar, em matéria de competências do Presidente da República, expedir decretos e regulamentos para fiel execução das leis.");
            question.setComentario("Correto\n O regulamento de execução, fruto do poder regulamentar, é um ato geral e abstrato, de competência privativa do Chefe do Poder Executivo, expedido com a estrita finalidade de produzir as disposições operacionais uniformizadas necessárias à fiel execução de lei cuja aplicação demande atuação da Administração Pública.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(279L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A diferença entre a polícia administrativa e a polícia judiciária se dá, dentre outros elementos, pela ocorrência ou não de ilícito penal.");
            question.setComentario("Correto\n Na polícia administrativa as infrações são administrativas, já na polícia judiciária as infrações são de natureza penal.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(280L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A polícia administrativa não envolve os atos de fiscalização.");
            question.setComentario("Errado\n A polícia administrativa envolve os atos de fiscalização, configurando uma atividade preventiva, traduzida no intuito de dissuadir os particulares de descumprirem as normas de polícia, bem como no de identificar prontamente os casos de inobservância dessas normas, limitando os danos decorrentes, ou mesmo evitando que aconteçam.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(281L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A autoexecutoriedade é um dos atributos do poder de polícia.");
            question.setComentario("Correto\n Os atributos do poder de polícia são discricionariedade, coercibilidade e autoexecutoriedade.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(282L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("No exercício do poder de polícia a Administração pode ditar e executar medidas restritivas do direito individual em benefício do bem-estar da coletividade e da preservação do próprio estado.");
            question.setComentario("Correto\n O fundamento do poder de polícia é o interesse público, dessa forma, a Administração com base no referido poder poderá ditar e executar medidas restritivas do direito individual em benefício do bem-estar da coletividade e da preservação do próprio estado.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(283L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("No exercício do poder de polícia os atos praticados pela Administração, por serem discricionários, não podem ser objeto de contestação no Poder Judiciário.");
            question.setComentario("Errado\n No exercício do poder de polícia os atos praticados pela Administração, apesar serem discricionários, podem ser objeto de contestação no Poder Judiciário que faz sobre eles um controle de legalidade.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(284L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("No exercício do poder de polícia a Administração não pode demolir construção ilegal nem pode inutilizar gêneros alimentícios.");
            question.setComentario("Errado\n No exercício do poder de polícia a Administração pode demolir construção ilegal nem pode inutilizar gêneros alimentícios, na sua atividade repressiva.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(285L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("No exercício do poder de polícia o ato praticado pelo agente da Administração não se sujeita às condições de validade dos demais atos administrativos.");
            question.setComentario("Errado\n No exercício do poder de polícia o ato praticado pelo agente da Administração se sujeita às condições de validade dos demais atos administrativos. Acaso tais condições sejam desrespeitadas o ato praticado no exercício do poder de polícia será anulado.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(286L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("No exercício do poder de polícia quando se tratar de ação preventiva, a aplicação da sanção dispensa o devido processo e a ampla defesa do autuado.");
            question.setComentario("Errado\n No exercício do poder de polícia quando se tratar de ação preventiva, a aplicação da sanção não dispensa o devido processo e a ampla defesa do autuado. Seja na sua atuação preventiva, seja na sua atuação repressiva, ao autuado deverá ser assegurado o contraditório e a ampla defesa por ser uma garantia constitucional.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(287L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Poder hierárquico é o de que dispõe o Executivo para distribuir e escalonar as funções de seus órgãos, ordenar e rever a atuação de seus agentes.");
            question.setComentario("Correto\n A hierarquia caracteriza-se pela existência de níveis de subordinação entre órgãos e agentes públicos, sempre no âmbito de uma mesma pessoa jurídica. Nessa relação hierárquica pode-se dizer que o Executivo distribui e escalona as funções de seus órgãos, ordena e rever a atuação de seus agentes.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(288L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("São atribuições da Administração Pública, decorrentes exclusivamente do poder hierárquico, delegar atribuições, impor prestação de contas, controlar e avocar atividades dos órgãos subordinados, aplicar sanções disciplinares e editar atos regulamentares.");
            question.setComentario("Errado\n São atribuições da Administração Pública, decorrentes do poder hierárquico, delegar atribuições, impor prestação de contas, controlar e avocar atividades dos órgãos subordinados. Já nas atribuições do poder disciplinar há a aplicação de sanções disciplinares e no poder regulamentar a edição de atos regulamentares.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(289L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Sobre o poder de polícia é correto afirmar que a extensão do poder de polícia é restrito, limitando-se à segurança pública.");
            question.setComentario("Errado\n Sobre o poder de polícia judiciária é correto afirmar que a extensão do poder de polícia é restrito, limitando-se à segurança pública. Já na polícia administrativa há uma incidência sobre as atividades, bens, direitos e serviços dos particulares.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(290L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Sobre o poder de polícia é correto afirmar que discricionariedade e autoexecutoriedade não são atributos do poder de polícia.");
            question.setComentario("Errado\n Os atributos do poder de polícia são a autoexecutoriedade, discricionariedade e coercibilidade.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(291L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Poder de polícia é a atividade exercida pela Polícia Civil na apuração de infração penal.");
            question.setComentario("Errado\n Poder de Polícia é a atividade exercida pela polícia administrativa na apuração de infrações administrativas.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(292L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Poder de polícia é a atividade exercida pela Polícia Militar na manutenção da ordem pública.");
            question.setComentario("Errado\n Poder de Polícia é inerente à atividade administrativa. A administração pública exerce poder de polícia sobre todas as condutas ou situações particulares que possam, direta ou indiretamente, afetar os interesses da coletividade.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(293L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Poder de polícia é a faculdade de punir internamente as infrações funcionais dos servidores e demais pessoas sujeitas à disciplina dos órgãos e serviços da Administração.");
            question.setComentario("Errado\n Poder disciplinar é o poder-dever de punir internamente as infrações funcionais dos servidores e demais pessoas sujeitas à disciplina dos órgãos e serviços da Administração.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(294L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Poder de polícia é o mecanismo de frenagem de que dispõe a Administração Pública para conter os abusos individuais.");
            question.setComentario("Correto\n Poder de polícia é o mecanismo de frenagem de que dispõe a Administração Pública para conter os abusos individuais que possam, direta ou indiretamente, afetar os interesses da coletividade.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(295L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Sendo um dos poderes administrativos, o Poder Disciplinar é o que permite à Administração Pública apurar infrações e aplicar penalidades aos servidores públicos e demais pessoas sujeitas à disciplina administrativa.");
            question.setComentario("Correto\n O poder disciplinar atinge aqueles que têm uma relação direta com o Poder Público (ex. servidores públicos) bem como aqueles que têm uma relação indireta (ex. concessionários e permissionários de serviços públicos).");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(296L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Sendo um dos poderes administrativos, o Poder Disciplinar é a faculdade de que dispõem os Chefes de Executivo de explicar uma lei para a sua correta execução, ou de expedir decreto autônomo sobre matéria de sua competência ainda não disciplinada por lei.");
            question.setComentario("Errado\n Sendo um dos poderes administrativos, o Poder Regulamentar é a faculdade de que dispõem os Chefes de Executivo de explicar uma lei para a sua correta execução, ou de expedir decreto autônomo sobre matéria de sua competência ainda não disciplinada por lei.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(297L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Sendo um dos poderes administrativos, o Poder Disciplinar é o de que dispõe a Administração para distribuir e escalonar as funções dos seus órgãos.");
            question.setComentario("Errado\n Sendo um dos poderes administrativos, o Poder Hierárquico é o de que dispõe a Administração para distribuir e escalonar as funções dos seus órgãos.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(298L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Sendo um dos poderes administrativos, o Poder Disciplinar é o que a Administração exerce sobre todas as atividades e bens que afetam ou possam afetar a coletividade.");
            question.setComentario("Errado\n Sendo um dos poderes administrativos, o Poder de Polícia é o que a Administração exerce sobre todas as atividades e bens que afetam ou possam afetar a coletividade.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(299L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Considere a seguinte hipótese: a Administração Pública aplicou pena de suspensão a determinado servidor, quando, pela lei, era aplicável a sanção de repreensão. O fato narrado caracteriza vício no objeto do ato administrativo e acarretará sua anulação.");
            question.setComentario("Correto\n O objeto é um dos cinco elementos do ato administrativo. Como no direito privado, o objeto deve ser lícito (em conformidade com a lei), possível (ex. não é possível exonerar servidor já falecido), certo (definido quanto ao destinatário, aos efeitos, ao tempo e ao lugar), e moral (em consonância com os padrões comuns de comportamento). No fato narrado pela questão a pena aplicada ao servidor foi a de suspensão quando a prevista em lei seria a de repreensão, configurando assim um vício no objeto e a conseqüente anulação do ato de punição.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(300L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Dentre outros, são exemplos de atos administrativos insuscetíveis de revogação licença para exercer profissão regulamentada em lei; certidão administrativa de dados funcionais de servidor público.");
            question.setComentario("Correto\n Não é possível a revogação de atos vinculados, atos que já produziram os seus efeitos, meros atos administrativos, atos que integram um procedimento, a revogação também não pode ser feita quando já se exauriu a competência relativamente ao objeto do ato e não podem ser revogados os atos que geram direitos adquiridos, conforme está expresso na Súmula 473, STF. A licença para exercer profissão é ato vinculado e certidão é mero ato administrativo, assim como o atestado e o voto. Portanto, são insuscetíveis de revogação.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(301L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A Constituição Federal define as matérias de competência privativa do Presidente da República e permite que ele delegue algumas dessas atribuições aos Ministros de Estado, ao Procurador- Geral da República ou ao Advogado Geral da União. Se estas autoridades praticarem um desses atos, sem que haja a necessária delegação, haverá vício de incompetência que, na hipótese, admite convalidação.");
            question.setComentario("Correto\n A convalidação ou saneamento é o ato administrativo pelo qual é suprido o vício em um ato ilegal, com efeitos retroativos à data em que este foi praticado. O art. 84, parágrafo único da Carta Magna traz a possibilidade de delegação da competência do Presidente da República para determinadas autoridades que só poderão exercê-la quando for editado o referido ato de delegação, caso contrário, haverá um vício no elemento competência. Quando isso ocorre admite-se a chamada convalidação, que nesse caso recebe o nome de ratificação, desde que não se trate de competência outorgada com exclusividade, hipótese em que se exclui a possibilidade de delegação ou de avocação.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(302L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Quanto às espécies de atos administrativos, é correto afirmar que certidões e atestados são atos administrativos classificados como constitutivos, pois seu conteúdo constitui determinado fato jurídico.");
            question.setComentario("Errado\n Ato constitutivo é aquele pelo qual a Administração cria, modifica ou extingue um direito ou uma situação do administrado. É o que caso da permissão, autorização, dispensa,aplicação de penal revogação. Certidões e atestados são atos enunciativos, ou seja, aqueles pelo qual a Administração apenas atesta ou reconhece determinada situação de fato ou de direito.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(303L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Quanto às espécies de atos administrativos, é correto afirmar que autorização é ato declaratório de direito preexistente, enquanto licença é ato constitutivo.");
            question.setComentario("Errado\n Ato declaratório é aquele em que a Administração apenas reconhece um direito que já existia antes do fato, como a admissão, licença, homologação, isenção, anulação. Já o ato constitutivo é aquele pelo qual a Administração cria, modifica ou extingue um direito ou uma situação do administrado. É o que caso da permissão, autorização, dispensa, aplicação de penalidade, revogação.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(304L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Quanto às espécies de atos administrativos, é correto afirmar que admissão é ato unilateral e discricionário pelo qual a Administração reconhece ao particular o direito à prestação de um serviço público.");
            question.setComentario("Errado\n Admissão é o ato unilateral e vinculado pelo qual a Administração reconhece ao particular, que preencha os requisitos legais, o direito à prestação de um serviço público.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(305L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Quanto às espécies de atos administrativos, é correto afirmar que licença é ato administrativo unilateral e vinculado, enquanto autorização é ato administrativo unilateral e discricionário.");
            question.setComentario("Correto\n Licença é o ato administrativo unilateral e vinculado pelo qual a Administração faculta àquele que preencha os requisitos legais o exercício de uma atividade. Já a autorização é um ato administrativo unilateral, discricionário e precário.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(306L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Quanto às espécies de atos administrativos, é correto afirmar que permissão, em sentido amplo, designa ato administrativo discricionário e precário, pelo qual a Administração, sempre de forma onerosa, faculta ao particular a execução de serviço público ou a utilização privativa de bem público.");
            question.setComentario("Errado\n Permissão em sentido amplo designa o ato administrativo unilateral, discricionário e precário, gratuito ou oneroso, pelo qual a Administração Pública faculta ao particular a execução de serviço público ou a utilização privativa de bem público.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(307L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Conforme o Direito federal vigente, como regra, não há necessidade de motivação de atos administrativos que imponham ou agravem deveres, encargos ou sanções.");
            question.setComentario("Errado\n De acordo com a Lei nº 9784/99, os atos administrativos deverão ser motivados, com indicação dos fatos e dos fundamentos jurídicos, quando imponham ou agravem deveres, encargos ou sanções, dentre outros.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(308L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Nos atos administrativos a imperatividade é um atributo que existe em todos os atos administrativos.");
            question.setComentario("Errado\n A imperatividade não existe em todos os atos administrativos, mas apenas naqueles que impõem obrigações; quando se trata de ato que confere direitos solicitados pelo administrado (ex. licença, autorização, permissão, admissão) ou de atos apenas enunciativo (ex. certidão, atestado, parecer), esse atributo não se faz presente.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(309L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Nos atos administrativos a invalidação é o desfazimento de um ato administrativo, e nem sempre ocorre por razões de ilegalidade.");
            question.setComentario("Errado\n Nos atos administrativos a invalidação é o desfazimento de um ato administrativo e sempre ocorre por razões de ilegalidade.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(310L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Nos atos administrativos o motivo e a finalidade são requisitos sempre vinculados dos atos administrativos.");
            question.setComentario("Errado\n A finalidade é um elemento vinculado, nunca é o agente público quem determina a finalidade a ser perseguida em sua atuação, mas sim a lei. Já o motivo, quando o ato é vinculado a lei determina que, à vista daquele fato, seja obrigatoriamente praticado aquele ato, com aquele conteúdo (ex. Concessão da licença-paternidade por cinco dias), quando o ato é discricionário, a lei autoriza a prática do ato, à vista de determinado fato. Constatado o fato, a administração pode, ou não, praticar o ato (ex. Lei 8112/90 diz que o servidor que não esteja em estágio probatório pode pedir licença não remunerada para tratar de interesses particulares), tal licença poderá ter a duração de até três anos, e será concedida, ou não, a critério da administração federal.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(311L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Nos atos administrativos a Administração pode autoexecutar suas decisões, empregando meios diretos de coerção, utilizando-se inclusive da força.");
            question.setComentario("Correto\n Atos autoexecutórios são os que podem ser materialmente implementados pela administração, diretamente, inclusive mediante o uso da força, se necessária, sem que a administração precise obter autorização judicial prévia.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(312L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A invalidação dos atos administrativos opera efeitos ex nunc.");
            question.setComentario("Errado\n A invalidação dos atos administrativos opera efeitos ex tunc (retroativos).");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(313L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("João, servidor público federal, pretende retirar do mundo jurídico determinado ato administrativo, em razão de vício nele detectado, ou seja, por ter sido praticado sem finalidade pública. No caso, esse ato administrativo deve ser anulado.");
            question.setComentario("Correto\n Ato administrativo praticado sem finalidade pública deverá ser extinto por meio da anulação com efeitos ex tunc (retroativos).");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(314L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Dentre outros, é exemplo de ato administrativo ordinatório, a circular.");
            question.setComentario("Correto\n Atos ordinatórios são aqueles que se destinam a disciplinar o funcionamento da Administração e a conduta funcional de seus agentes. Nessa linha, revelam-se como provimentos, determinações ou esclarecimentos endereçados aos servidores públicos a fim de orientá-los no desempenho de suas atribuições. São considerados atos ordinatórios as instruções, circulares, portarias, avisos, ordens de serviço, ofícios e despachos.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(315L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("NÃO constitui exemplo, dentre outros, de ato administrativo enunciativo a homologação.");
            question.setComentario("Correto\n Ato administrativo enunciativo é aquele pelo qual a Administração apenas atesta ou reconhece determinada situação de fato ou de direito, ex. certidões, atestados, informações, pareceres, vistos. Encerram juízo, conhecimento ou opinião e não manifestação de vontade produtora de efeitos jurídicos, razão pela qual esses atos não são considerados atos administrativos propriamente ditos, mas meros atos administrativos.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(316L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Um dos atributos dos atos administrativos tem por fundamento a sujeição da Administração Pública ao princípio da legalidade, o que faz presumir que todos os seus atos tenham sido praticados em conformidade com a lei, já que cabe ao Poder Público a sua tutela. Nesse caso, trata-se do atributo da presunção de legitimidade.");
            question.setComentario("Correto\n A presunção de legitimidade diz respeito à conformidade do ato com a lei; em decorrência desse atributo, presumem-se, até prova em contrário, que os atos administrativos foram emitidos com observância da lei.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(317L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O motivo do ato administrativo implica a anulação do ato, quando ausente o referido motivo.");
            question.setComentario("Correto\n Motivo é o pressuposto de fato e de direito que serve de fundamento ao ato administrativo. De acordo com a Teoria dos Motivos Determinantes, a validade do ato se vincula aos motivos indicados como seu fundamento, de tal modo que, se inexistentes ou falsos, implicam a sua nulidade. Dessa forma, quando a Administração motiva o ato, mesmo que a lei não exija a motivação, ele só será válido se os motivos forem verdadeiros.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(318L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A Administração Pública exonerou ad nutum Carlos, sob a alegação de falta de verba. Se, a seguir, nomear outro funcionário para a mesma vaga, o ato de exoneração será ilegal por vício quanto ao motivo.");
            question.setComentario("Correto\n A motivação é, em regra, necessária, seja para os atos vinculados, seja para os atos discricionários, pois constitui garantia de legalidade, que tanto diz respeito ao interessado como à própria Administração Pública; a motivação é que permite a verificação, a qualquer momento, da legalidade do ato, até mesmo pelos demais Poderes do Estado. No caso da exoneração ad nutum, para a qual a lei não define o motivo, se a Administração praticar esse ato alegando que o fez por falta de verba e depois nomear outro funcionário para a mesma vaga, o ato será nulo por vício quanto ao motivo.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(319L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Podem ser revogados os atos administrativos editados em conformidade com a lei.");
            question.setComentario("Correto\n A revogação é o ato administrativo discricionário pelo qual a Administração extingue um ato válido, por razões de oportunidade e conveniência.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(320L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("No que diz respeito aos requisitos dos atos administrativos, a competência, no âmbito federal, é, em regra, indelegável.");
            question.setComentario("Errado\n De acordo com a Lei nº 9784/99, art. 12, um órgão administrativo e o seu titular poderão, se não houver impedimento legal, delegar parte da sua competência a outros órgãos ou titulares. Já no art. 13 da referida lei é dito que não é possível a delegação da edição de atos de caráter normativo, a decisão de recursos administrativos e as matérias de competência exclusiva do órgão ou autoridade. Portanto, a delegação é, em regra, delegável. Não será nos casos expressamente previstos em lei.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(321L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("No que diz respeito aos requisitos dos atos administrativos, o desvio de finalidade ocorre apenas se não for observado o fim público.");
            question.setComentario("Errado\n A finalidade pode ter duplo sentido (amplo e restrito), pode-se dizer que ocorre o desvio de poder quando o agente pratica o ato com inobservância do interesse público ou com objetivo diverso daquele previsto explícita ou implicitamente na lei. O agente desvia-se ou afasta-se da finalidade que deveria atingir para alcançar resultado diverso, não amparado pela lei.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(322L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("No que diz respeito aos requisitos dos atos administrativos, o motivo, se inexistente, enseja a anulação do ato administrativo.");
            question.setComentario("Correto\n Há vício no elemento motivo gerando a anulação do ato administrativo quando a matéria de fato ou de direito, em que se fundamenta o ato, é materialmente inexistente ou juridicamente inadequada ao resultado obtido.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(323L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("No que diz respeito aos requisitos dos atos administrativos, se houver vício no objeto e este for plúrimo, ainda assim não será possível aproveitá-lo em quaisquer de suas partes mesmo que nem todas tenham sido atingidas pelo vício.");
            question.setComentario("Errado\n O objeto deve ser lícito, possível, moral e determinado. Assim, haverá vício em relação ao objeto quando qualquer desses requisitos deixar de ser observado. No entanto, é possível aproveitar o ato acaso nem todas as partes do ato tenham sido atingidas pelo vício.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(324L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("No que diz respeito aos requisitos dos atos administrativos, a inobservância da forma não enseja a invalidade do ato.");
            question.setComentario("Errado\n O vício de forma consiste na omissão ou na observância incompleta ou irregular de formalidades indispensáveis à existência ou seriedade do ato. O ato é ilegal por vício de forma quando a lei expressamente a exige ou quando determinada finalidade só possa ser alcançada por determinada forma.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(325L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("No que diz respeito ao instituto da convalidação dos atos administrativos, é correto afirmar que a convalidação sempre será possível quando houver vício no objeto do ato administrativo.");
            question.setComentario("Errado\n Convalidação ou saneamento é o ato administrativo pelo qual é suprido o vício existente em um ato ilegal, com efeitos retroativos à data em que este foi praticado. O objeto ilegal não pode ser convalidado.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(326L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("No que diz respeito ao instituto da convalidação dos atos administrativos, é correto afirmar que a impugnação expressa, feita pelo interessado, contra ato com vício sanável de competência, constitui barreira a sua convalidação pela Administração.");
            question.setComentario("Correto\n A Administração não pode convalidar um ato viciado se este já foi impugnado, administrativa ou judicialmente. Se pudesse fazê-lo seria inútil a argüição do vício, pois a extinção dos efeitos ilegítimos dependeria da vontade da Administração e não do dever de obediência à ordem jurídica.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(327L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("No que diz respeito ao instituto da convalidação dos atos administrativos, é correto afirmar que admite-se convalidação quando o vício relacionar-se ao motivo do ato administrativo.");
            question.setComentario("Errado\n O motivo nunca pode ser convalidado, isso porque ele corresponde a situação de fato que ou ocorreu ou não ocorreu; não há como alterar, com efeito retroativo, uma situação de fato.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(328L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("No que diz respeito ao instituto da convalidação dos atos administrativos, é correto afirmar que admite-se convalidação quando houver vício de incompetência em razão da matéria, como por exemplo, quando determinado Ministério pratica ato de competência de outro.");
            question.setComentario("Errado\n Não se admite a convalidação quando haja incompetência em razão da matéria porque nesse caso existe exclusividade de atribuições e competência exclusiva não pode ser delegada, Lei nº 9784/99, art. 13.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(329L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("No que diz respeito ao instituto da convalidação dos atos administrativos, é correto afirmar que convalidação é o ato administrativo pelo qual é suprido vício existente em determinado ato, com efeitos ex nunc.");
            question.setComentario("Errado\n No que diz respeito ao instituto da convalidação dos atos administrativos, é correto afirmar que convalidação é o ato administrativo pelo qual é suprido vício existente em determinado ato, com efeitos ex tunc (retroativos).");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(330L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Considerada a classificação dos atos administrativos, perfeitos são aqueles que já produziram todos seus efeitos, tornando-se definitivos e irretratáveis.");
            question.setComentario("Errado\n O ato consumado é o que já exauriu os seus efeitos. Ele se torna definitivo, não podendo ser impugnado, quer na via administrativa, quer na via judicial; quando muito, pode gerar responsabilidade administrativa ou criminal quando se trata de ato ilícito, ou responsabilidade civil do Estado, independentemente da licitude ou não, desde que tenha causado danos a terceiros. Já o ato perfeito é aquele que está em condições de produzir efeitos jurídicos, porque já completou todo o seu ciclo de formação.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(331L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Considerada a classificação dos atos administrativos, de expediente são os que a Administração pratica sem usar da sua supremacia.");
            question.setComentario("Errado\n Atos de gestão são os praticados pela Administração em situação de igualdade com os particulares, ou seja, aqui a Administração não usa da sua supremacia.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(332L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Considerada a classificação dos atos administrativos, de gestão são aqueles que se destinam a dar andamento aos processos e papéis dentro da repartição pública.");
            question.setComentario("Errado\n Considerada a classificação dos atos administrativos, de expediente são aqueles que se destinam a dar andamento aos processos e papéis dentro da repartição pública.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(333L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Considerada a classificação dos atos administrativos, consumados são os que estão em condições de produzir efeitos jurídicos, porque já completou todo o seu ciclo de formação.");
            question.setComentario("Errado\n Considerada a classificação dos atos administrativos, perfeitos são os que estão em condições de produzir efeitos jurídicos, porque já completou todo o seu ciclo de formação.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(334L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Considerada a classificação dos atos administrativos, de império são aqueles praticados pela Administração usando dos seus poderes e prerrogativas de autoridade.");
            question.setComentario("Correto\n Atos de império são os praticados pela Administração com todas as prerrogativas e privilégios de autoridade e impostos unilateral e coercitivamente ao particular independentemente de autorização judicial, sendo regidos por um direito especial exorbitante do direito comum.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(335L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O revestimento exterior do ato administrativo, necessário à sua perfeição, é requisito conhecido como forma.");
            question.setComentario("Correto\n Forma é a exteriorização do ato administrativo, é o modo pelo qual a declaração se exterioriza, ex. o ato pode ter a forma escrita ou verbal, de decreto, de portaria, resolução etc.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(336L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A competência administrativa, em regra, enquanto requisito do ato administrativo, decorre da lei.");
            question.setComentario("Correto\n A competência decorre da lei, não podendo o próprio órgão estabelecer, por si, as suas atribuições. É possível a delegação e a avocação de competência, desde que não se trate de competência a determinado órgão ou agente, com exclusividade, pela lei.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(337L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A imperatividade é um atributo que não existe em todos os atos administrativos.");
            question.setComentario("Correto\n A imperatividade não existe em todos os atos administrativos, mas apenas naqueles que impõem obrigações; quando se trata de ato que confere direitos solicitados pelo administrado (ex.Licença, autorização, permissão, admissão) ou de ato apenas enunciativo (ex. certidão, atestado, parecer) esse atributo inexiste.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(338L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A autoexecutoriedade consiste em atributo existente em todos os atos administrativos.");
            question.setComentario("Errado\n A autoexecutoriedade não existe em todos os atos administrativos, ela só é possível quando expressamente prevista em lei, em matéria de polícia administrativa (ex. apreensão de mercadoria) quando se trata de medida urgente.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(339L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O atributo da tipicidade existe tanto em relação aos atos administrativos unilaterais, quanto em relação aos contratos");
            question.setComentario("Errado\n A tipicidade só existe em relação aos atos unilaterais; não existe nos contratos porque com relação a eles não há imposição de vontade da Administração, que depende sempre da aceitação do particular.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(340L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Os atos administrativos, qualquer que seja sua categoria ou espécie, nascem com presunção de legitimidade.");
            question.setComentario("Correto\n É correto dizer que os atos administrativos, qualquer que seja sua categoria ou espécie, nascem com presunção de legitimidade. Se assim não fosse, toda a atividade administrativa seria diretamente questionável, obstaculizando o cumprimento dos fins públicos.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(341L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Em relação ao objeto, o ato administrativo será sempre discricionário.");
            question.setComentario("Errado\n Com relação ao objeto, o ato será vinculado quando a lei estabelecer apenas um objeto como possível para atingir determinado fim (ex. quando a lei prevê uma única penalidade possível para punir uma infração). E será discricionário quando houver vários objetos possíveis para atingir o mesmo fim, sendo todos eles válidos (ex. quando a lei diz que, para que a mesma infração, a Administração pode punir o funcionário com as penas de suspensão ou de multa).");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(342L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O objeto do ato administrativo apenas será natural, não podendo ser acidental, diferentemente do que ocorre no negócio jurídico de direito privado.");
            question.setComentario("Errado\n O objeto do ato administrativo pode ser natural ou acidental. Objeto natural é o efeito jurídico que o ato produz, sem necessidade de expressa menção; ele decorre da própria natureza do ato, tal como definido em lei. Objeto acidental é o efeito jurídico que o ato produz em decorrência de cláusulas acessórias apostas ao ato pelo sujeito que o pratica; compreende o termo, o modo ou encargo e a condição.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(343L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O silêncio pode significar forma de manifestação da vontade da Administração quando a lei assim o prevê.");
            question.setComentario("Correto\n O silêncio pode significar forma de manifestação de vontade, quando a lei assim o prevê; normalmente ocorre quando a lei fixa um prazo, findo o qual o silêncio da Administração significa concordância ou discordância.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(344L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Se a lei exige processo disciplinar para demissão de um funcionário, a falta ou o vício naquele procedimento são hipóteses de revogação da demissão.");
            question.setComentario("Errado\n Se a lei exige processo disciplinar para demissão de um funcionário, a falta ou o vício naquele procedimento são hipóteses de anulação da demissão por tratar-se de um ato ilegal.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(345L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O objeto é o efeito jurídico mediato que o ato produz, enquanto a finalidade é o efeito imediato.");
            question.setComentario("Errado\n O objeto ou conteúdo é o efeito jurídico imediato que o ato produz. Já a finalidade é o efeito mediato.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(346L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A revogação pode ser feita pelo Judiciário e pela própria Administração, mas a anulação compete apenas ao Poder Judiciário.");
            question.setComentario("Errado\n A revogação pode ser feita apenas pela Administração, mas a anulação é feita tanto pela própria Administração como pelo Poder Judiciário.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(347L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A revogação atinge um ato administrativo não editado em conformidade com a lei.");
            question.setComentario("Errado\n A anulação atinge um ato administrativo não editado em conformidade com a lei.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(348L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A revogação opera efeitos ex tunc, enquanto a anulação produz efeitos ex nunc.");
            question.setComentario("Errado\n A revogação opera efeitos ex nunc, enquanto a anulação produz efeitos ex tunc.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(349L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A revogação poderá ocorrer mesmo se o ato administrativo já produziu seus efeitos.");
            question.setComentario("Errado\n Os atos vinculados não são passíveis de revogação, mas poderão ser anulados se forem ilegais.");
            question.setGabarito(R.id.e);
            lquestion.add(question);
//Parei na 351
            question = new Question();
            question.setId(350L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Não podem ser revogados os atos que geram direitos adquiridos.");
            question.setComentario("Correto\n De acordo com a Súmula nº 473, STF não é possível a revogação de direitos já adquiridos: “A administração pode anular seus próprios atos, quando eivados de vícios que os tornam ilegais, porque deles não se originam direitos; ou revogá-los, por motivo de conveniência ou oportunidade, respeitados os direitos adquiridos, e ressalvada, em todos os casos, a apreciação judicial.”");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(351L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O atributo pelo qual os atos administrativos se impõem a terceiros, independentemente de sua concordância, denomina-se imperatividade.");
            question.setComentario("Correto\n Imperatividade é o atributo pelo qual os atos administrativos se impõem a terceiros, independentemente de sua concordância, decorre da prerrogativa que tem o Poder Público de, por meio de atos unilaterais, impor obrigações a terceiros.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(352L);
            question.setTema("Direito Penal");
            question.setEnunciado("A embriaguez involuntária incompleta do agente não é causa de exclusão da culpabilidade nem de redução de pena.");
            question.setComentario("Errado.\nConforme leciona o parágrafo 2º, do art. 28, do Código Penal, a pena pode ser reduzida de um a dois terços se o agente, por embriaguez, proveniente de caso fortuito ou força maior, não possuía, ao tempo da ação ou da omissão, a plena capacidade de entender o caráter ilícito do fato ou de determinar-se de acordo com esse entendimento. Assim, a embriaguez involuntária incompleta do agente é causa de redução de pena.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(353L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O motivo, sempre está expresso na lei, não podendo ser deixado ao critério do administrador.");
            question.setComentario("Errado\n Considerando o motivo como o pressuposto de fato que antecede a prática do ato, ele pode ser vinculado ou discricionário. Será vinculado quando a lei, ao descrevê-lo, utilizar noções precisas que não dão margem a qualquer apreciação subjetiva. Já o motivo será discricionário quando a lei não o definir, deixando-o ao critério da Administração e quando a lei define o motivo utilizando noções vagas, vocábulos plurissignificativos, os chamados conceitos jurídicos indeterminados, que deixam à Administração a possibilidade de apreciação segundo critérios de oportunidade e conveniência administrativa.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(354L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("No ato de punição do funcionário, o motivo é a infração que ele praticou.");
            question.setComentario("Correto\n Motivo é o pressuposto de fato e de direito que serve de fundamento ao ato administrativo. Pressuposto de direito é o dispositivo legal em que se baseia o ato. Pressuposto de fato corresponde ao conjunto de circunstâncias, de acontecimentos, de situações que levam a Administração a praticar o ato. No ato de punição do funcionário, o motivo é a infração que ele praticou; na exoneração do funcionário estável, é o pedido por ele formulado.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(355L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A ausência de motivo ou a indicação de motivo falso invalidam o ato administrativo.");
            question.setComentario("Correto\n O motivo é o pressuposto de fato e de direito que serve de fundamento ao ato administrativo, se o fato afirmado pela Administração não ocorreu ou quando o ato afirmado existe, mas é ilegal, o motivo será ilegítimo. Nas duas situações o ato será invalidado.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(356L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Motivação é a exposição ou indicação dos motivos, ou seja, demonstração por escrito dos fatos e fundamentos jurídicos do ato.");
            question.setComentario("Correto\n Não se confundem motivo e motivação. Motivação é a exposição dos motivos, ou seja, é a demonstração, por escrito, de que os pressupostos de fato realmente existiram. Ela diz respeito às formalidades do ato, que integram o próprio ato.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(357L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Quando a Administração motiva o ato, mesmo que a lei não exija a motivação, ele só será válido se os motivos forem verdadeiros.");
            question.setComentario("Correto\n De acordo com a Teoria dos Motivos Determinantes, em consonância com a qual a validade do ato se vincula aos motivos indicados como seu fundamento, de tal modo que, se inexistentes ou falsos, implicam a sua nulidade. Assim, quando a Administração motiva o ato, mesmo que a lei não exija a motivação, ele só será válido se os motivos forem verdadeiros.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(358L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Utilizando documentos falsos, um cidadão consegue autorização para desenvolver atividade comercial para a qual é obrigatória a autorização para o exercício de sua atividade. Constatada a irregularidade e, portanto, verificada a nulidade do ato administrativo de autorização, esse ato pode ser anulado pela própria Administração independentemente de provocação.");
            question.setComentario("Correto\n A autorização foi concedida com base em documentos ilegais, portanto deverá ser anulada pela própria Administração que não precisa ser provocada para tanto já que ela age com base no seu poder de autotutela.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(359L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A inexistência da forma induz a inexistência do ato administrativo.");
            question.setComentario("Correto\n O vício de forma consiste na omissão ou na observância incompleta ou irregular de formalidades indispensáveis à existência ou seriedade do ato. Inexistente a forma, por conseqüência inexiste o próprio ato administrativo.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(360L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A finalidade é elemento vinculado de todo ato administrativo, seja ele discricionário ou regrado.");
            question.setComentario("Correto\n A finalidade é elemento vinculado de todo ato administrativo, seja ele discricionário ou regrado (vinculado). Nunca é o agente público quem determina a finalidade a ser perseguida em sua atuação, mas sim a lei.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(361L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A alteração da finalidade expressa na norma legal ou implícita no ordenamento da Administração caracteriza o desvio de poder a invalidar o ato administrativo.");
            question.setComentario("Correto\n O desvio de poder ocorre quando a autoridade usa do poder discricionário para atingir fim diferente daquele que a lei fixou. Quando isso ocorre, o ato deverá ser anulado já que a Administração fez uso indevido da discricionariedade ao desviar-se dos fins de interesse público definidos na lei.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(362L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A revogação ou a modificação do ato administrativo não é vinculada, motivo pelo qual é prescindível a obediência da mesma forma do ato originário.");
            question.setComentario("Errado\n A revogação do ato administrativo deve obedecer a mesma forma do ato originário, uma vez que o elemento formal é vinculado tanto para a sua formação quanto para o seu desfazimento ou alteração.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(363L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Motivação é, em regra, obrigatória, só não sendo quando a lei a dispensar ou se a natureza do ato for com ela incompatível.");
            question.setComentario("Correto\n A motivação é, em regra, obrigatória, seja para os atos vinculados, seja para os atos discricionários, pois constitui garantia de legalidade, que tanto diz respeito ao interessado como à própria Administração Pública. Quando a própria lei dispensar a motivação ou quando a natureza do ato for incompatível com ela como é o caso da exoneração do cargo em comissão, ela não será obrigatória. É interessante notar que ela não será obrigatória, mas nada impede que ocorra.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(364L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A anulação é a declaração de invalidação de um ato administrativo ilegítimo ou ilegal, feita pela própria Administração ou pelo Poder Judiciário.");
            question.setComentario("Correto\n A anulação é a declaração de invalidação de um ato administrativo ilegítimo ou ilegal, feita pela própria Administração sem precisar ser provocada, diante do seu pode de autotutela ou pelo Poder Judiciário, desde que provocado, com efeitos ex tunc.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(365L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Em regra, a anulação dos atos administrativos vigora a partir da data da anulação, isto é, não tem efeito retroativo.");
            question.setComentario("Errado\n A anulação dos atos administrativos retroage à data em que o ato foi praticado, efeitos ex tunc, ou seja, a partir de então.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(366L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A anulação feita pela Administração depende de provocação do interessado.");
            question.setComentario("Errado\n A anulação feita pela Administração independe de provocação do interessado porque ela goza do chamado poder de autotutela que permite anular e revogar seus próprios atos independentemente de provocação.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(367L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Quando concluído o seu ciclo de formação e apesar de não se achar conformado às exigências normativas, encontra-se produzindo os efeitos que lhe são inerentes. Tal situação refere-se ao ato administrativo perfeito, inválido e eficaz.");
            question.setComentario("Correto\n Ato perfeito é aquele que está em condições de produzir efeitos jurídicos porque já completou todo o seu ciclo de formação, já o ato inválido é aquele que foi praticado em desacordo com a lei e o ato eficaz é aquele que está produzindo seus efeitos. Quando concluído o seu ciclo de formação (ato perfeito) e apesar de não se achar conformado com às exigências normativas (ato inválido), encontra-se produzindo os efeitos que lhe são inerentes (ato eficaz). É interessante registrar que esse ato, apesar de inválido, irá produzir seus efeitos em virtude da presunção de legitimidade dos atos administrativos. Até ser declarado ilegal, pela própria Administração ou pelo próprio Poder Judiciário ele irá produzir seus efeitos normalmente.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(368L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A perfeição diz respeito à verificação da conformidade do ato com a lei, isto é, se o ato foi praticado com adequação às exigências da lei.");
            question.setComentario("Errado\n A validade diz respeito à verificação da conformidade do ato com a lei, isto é, se o ato foi praticado com adequação às exigências da lei.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(369L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O ato pendente pode ser confundido com o ato imperfeito, visto que ambos estão sujeitos a um termo ou condição.");
            question.setComentario("Errado\n O ato pendente está sujeito a condição ou termo para que comece a produzir efeitos. Distingue-se do ato imperfeito porque já completou o seu ciclo de formação e está apto a produzir efeitos; estes ficam suspensos até que ocorra a condição ou termo.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(370L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Como regra, os efeitos da anulação dos atos administrativos retroagem às suas origens, invalidando as consequências passadas, presentes e futuras do ato anulado.");
            question.setComentario("Correto\n Como a desconformidade com a lei atinge o ato em suas origens, a anulação produz efeitos retroativos à data em que foi emitido (efeitos ex tunc, ou seja, a partir de então).");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(371L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Revogação é a supressão de um ato discricionário ilegítimo e ineficaz, realizada pela Administração e pelo Judiciário, por não mais convir a sua existência.");
            question.setComentario("Errado\n Revogação é a supressão de um ato discricionário legítimo e ineficaz, realizada pela Administração e pelo Judiciário, por não mais convir a sua existência, com efeitos ex nunc.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(372L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Anulação é a declaração de invalidação de um ato administrativo ilegítimo ou ilegal, feito pela Administração ou pelo Poder Judiciário.");
            question.setComentario("Correto\n Anulação é a declaração de invalidação de um ato administrativo ilegítimo ou ilegal, com efeito ex tunc, feito pela Administração, independentemente de provocação por gozar do poder de autotutela, ou pelo Poder Judiciário desde que provocado.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(373L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O Poder Judiciário somente anula atos ilegais, não podendo revogar atos inconvenientes ou inoportunos mas formal e substancialmente legítimos, porque isso é atribuição exclusiva da Administração.");
            question.setComentario("Correto\n Ao Poder Judiciário compete apenas o controle de legalidade dos atos administrativos, anulando aqueles atos contrários à lei. Já à Administração, com base no seu poder de autotutela, compete anular e revogar os seus próprios atos, fazendo não apenas o controle de mérito como também o controle de legalidade.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(374L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Para a anulação do ato ilegal não se exigem formalidades especiais, nem há prazo determinado para a invalidação, salvo quando norma legal o fixar expressamente.");
            question.setComentario("Correto\n De acordo com a Lei nº 9784/99, “O direito da Administração de anular os atos administrativos de que decorram efeitos favoráveis pra os destinatários decai em cinco anos, contados da data em que foram praticados, salvo comprovada má-fé”. Sendo assim, a regra geral é que não há prazo para anulação de atos administrativos, salvo quando a lei expressamente determinar prazo para determinado ato, como o fez o supracitado artigo.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(375L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A competência administrativa, sendo requisito de ordem pública, é intransferível e improrrogável pela vontade dos interessados. Pode, entretanto, ser delegada e avocada, desde que o permitam as normas reguladoras da Administração.");
            question.setComentario("Correto\n A competência é irrenunciável, intransferível, imodificável pela vontade do agente, imprescritível e improrrogável, ou seja, o fato de um órgão ou agente incompetente praticar um ato não faz com que ele passe a ser considerado competente, salvo disposição legal expressaque assim estabeleça. Mas a competência poderá ser delegada e avocada, nos termos da Lei nº 9784/99.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(376L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A forma é o revestimento que exterioriza o ato administrativo e consiste, portanto, em requisito vinculado. Logo, a inexistência da forma, vicia substancialmente o ato, tornando-o passível de nulidade.");
            question.setComentario("Errado\n A forma é o revestimento que exterioriza o ato administrativo e consiste, portanto, em requisito vinculado. Logo, a inexistência da forma, implica a inexistência do próprio ato.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(377L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Convalidação consiste no suprimento da invalidade de um ato administrativo e pode derivar de ato da Administração ou de ato do particular afetado pelo provimento viciado, sendo que, nesta hipótese, não terá efeitos retroativos.");
            question.setComentario("Errado\n A convalidação ou saneamento é o ato administrativo pelo qual é suprido o vício existente em um ato ilegal, com efeitos retroativos à data em que este foi praticado. Ela é feita, em regra, pela Administração, mas eventualmente poderá ser feita pelo administrado, quando a edição do ato dependia da manifestação de sua vontade e a exigência não foi observada. Este pode emiti-la posteriormente, convalidando o ato. Em ambos os casos o efeito da convalidação será retroativo, ou seja, ex tunc.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(378L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Caso a Administração revogue várias autorizações de porte de arma, invocando como motivo o fato de um dos autorizados ter se envolvido em brigas, referida revogação só será válida em relação àquele que perpetrou a situação fática geradora do resultado do ato.");
            question.setComentario("Correto\n Quando a Administração revoga várias autorizações de porte de arma, invocando como motivo o fato de um dos autorizados ter se envolvido em brigas, referida revogação só será válida em relação àquele que perpetrou a situação fática geradora do resultado do ato pelo simples fato de apenas com relação a ele a referida autorização ter se tornado inconveniente e inoportuna. Os demais autorizados que não se envolveram em briga não poderão ter as suas autorizações revogadas uma vez que não fizeram parte da situação fática narrada.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(379L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A ilegalidade torna o ato passível de invalidação pela própria Administração ou pelo Judiciário, por meio de anulação.");
            question.setComentario("Correto\n A ilegalidade torna o ato passível de invalidação pela própria Administração ou pelo Judiciário, desde que provocado, por meio de anulação com efeitos ex tunc.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(380L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O ato discricionário não pode prescindir de determinados requisitos, como a forma prescrita em lei e o fim indicado no texto legal; pode, todavia, sem que a lei faculte eventual deslocação de função, haver transferência de competência, por ser modificação discricionária.");
            question.setComentario("Errado\n O ato discricionário não pode prescindir de determinados requisitos, como a forma prescrita em lei e o fim indicado no texto legal; assim como também não pode ser transferida a competência, apenas delegada e avocada conforme dispõe a Lei nº 9784/99.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(381L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Não podem ser revogados atos que exauriram os seus efeitos, pois a revogação supõe ato que ainda esteja produzindo efeitos, como ocorre na autorização para porte de armas.");
            question.setComentario("Correto\n Não podem ser revogados os atos que exauriram os seus efeitos; como a revogação não retroage, mas apenas impede que o ato continue a produzir efeitos, se o ato já se exauriu, não há mais que se falar em revogação. A revogação supõe um ato que ainda esteja produzindo efeitos, como ocorre coma a autorização para porte de armas ou exercício de qualquer atividade, sem prazo estabelecido.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(382L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O vício de finalidade admite convalidação, sendo, portanto, hipótese de nulidade relativa.");
            question.setComentario("Errado\n A finalidade nunca poderá ser convalidada. Se o ato foi praticado contra o interesse público ou com finalidade diversa da que decorre da lei, não poderá ser convalidado porque não se pode corrigir um resultado que estava na intenção do agente que praticou e não no interesse público.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(383L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Ocorre desvio de poder quando a autoridade usa do poder discricionário para atingir finalidade alheia ao interesse público.");
            question.setComentario("Correto\n No desvio de poder ou desvio de finalidade, o agente desvia-se ou afasta-se da finalidade que deveria atingir para alcançar resultado diverso, não amparado pela lei. Ele pratica o ato no exercício da sua competência, porém sem a observância do interesse público.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(384L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Se a Administração concedeu afastamento, por dois meses, a determinado funcionário, a revogação do ato será possível mesmo se já tiver transcorrido o aludido período.");
            question.setComentario("Errado\n Não é possível a revogação de atos que já produziram os seus efeitos. No caso em análise a Administração concedeu afastamento para um determinado servidor, durante o gozo da licença seria possível a revogação, mas já tendo transcorrido o referido período não será mais possível porque a mesma supõe um ato que ainda esteja produzindo efeitos.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(385L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Na hipótese de dispensa de servidor exonerável ad nutum, se forem dados os motivos para tanto, ficará a autoridade que os deu sujeita à comprovação de sua real existência.");
            question.setComentario("Correto\n Dispensa de servidor ad nutum, ou seja, a qualquer tempo, independe de motivação em razão da sua precariedade. Porém, se o ato for motivado a autoridade terá que comprovar que realmente os motivos expostos aconteceram, caso contrário, tomando como base a Teoria dos Motivos Determinantes, o referido ato será anulado.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(386L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O vício de incompetência admite convalidação, que nesse caso recebe o nome de ratificação, desde que não se trate de competência outorgada com exclusividade.");
            question.setComentario("Correto\n Quanto ao sujeito, se o ato for praticado com vício de incompetência, admite-se a convalidação, que nesse caso recebe o nome de ratificação, desde que não se trate de competência outorgada com exclusividade, hipótese em que se exclui a possibilidade de delegação ou avocação, conforme preceitua a Lei nº 9784/99 em seu art. 13.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(387L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("São atos administrativos de expediente todos aqueles que a Administração Pública pratica sem usar da supremacia sobre seus destinatários e, em regra, com discricionariedade.");
            question.setComentario("Errado\n Atos de expediente são atos internos da Administração Pública, relacionados às rotinas de andamento dos variados serviços executados por seus órgãos e entidades administrativas, ex. cadastramento de um processo nos sistemas informatizados de um órgão público.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(388L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("São atos administrativos de gestão aqueles que, tecnicamente, se destinam a dar andamento aos processos e papéis que tramitam pelas repartições públicas.");
            question.setComentario("Errado\n São atos administrativos de expediente aqueles que, tecnicamente, se destinam a dar andamento aos processos e papéis que tramitam pelas repartições públicas. Atos de gestão são aqueles praticados pela Administração na qualidade de gestora de seus bens e serviços, sem exercício de supremacia sobre os particulares.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(389L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("São atos administrativos de efeitos externos todos aqueles que alcançam os administrados, até os próprios servidores, provendo sobre seus direitos, obrigações, negócios ou conduta perante a Administração.");
            question.setComentario("Correto\n Atos externo ou de efeitos externos, são todos aqueles que alcançam os administrados, os contratantes e, em certos casos, os próprios servidores, provendo sobre seus direitos, obrigações, negócios ou conduta perante a Administração; só entram em vigor ou execução depois de divulgados pelo órgão oficial, dado o interesse do público no seu conhecimento, ex. edital de concurso público.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(390L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("São atos administrativos de império aqueles expedidos sem destinatários determinados, com finalidade normativa, alcançando os que se encontram na mesma situação.");
            question.setComentario("Errado\n Atos de império, também chamados de atos de autoridade, são aqueles que a Administração impõe coercitivamente aos administrados, criando a eles obrigações ou restrições, de forma unilateral e independente de anuência, ex: a desapropriação de um bem.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(391L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("São atos administrativos gerais todos aqueles destinados a produzir efeitos no recesso das repartições públicas, incidentes sobre órgão da Administração que os expediram.");
            question.setComentario("Errado\n Atos gerais são aqueles que atingem todas as pessoas que se encontram na mesma situação; são os atos normativos praticados pela Administração, como regulamentos, portarias, resoluções, circulares, instruções, deliberações, regimentos.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(392L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O motivo ou causa é a situação de direito ou de fato que determina ou autoriza a realização do ato administrativo.");
            question.setComentario("Correto\n O motivo é a causa imediata do ato administrativo. É a situação de fato e de direito que determina ou autoriza a prática do ato, ou, em outras palavras, o pressuposto fático e jurídico que enseja a prática do ato, ex. na concessão de licença-paternidade, o motivo será sempre o nascimento do filho do servidor.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(393L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Os dirigentes das fundações e autarquias não praticam atos administrativos típicos ou equiparados, não sendo portanto passíveis de controle judicial próprio das autoridades públicas.");
            question.setComentario("Errado\n Os dirigentes das fundações e autarquias praticam atos administrativos típicos ou equiparados, sendo, portanto, passíveis de controle judicial próprio das autoridades públicas.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(394L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O fato administrativo resulta sempre do ato administrativo que o determina, resultando do cumpri- mento de alguma decisão administrativa.");
            question.setComentario("Correto\n Fatos administrativos são descritos como a materialização da função administrativa; consubstanciam o exercício material da atividade administrativa, correspondem aos denominados “atos materiais”, ex. apreensão de mercadoria. Um fato administrativo, em rega, resulta de um ato administrativo e decorre de uma decisão ou determinação administrativa, mas com esta não se confunde. Uma vez expressa a vontade da Administração mediante a edição de um ou mais atos administrativos, surge como conseqüência um fato administrativo, ex. a demolição de um prédio (fato administrativo) pode resultar de uma ordem de serviço da administração (ato administrativo).");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(395L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A competência administrativa, por ser de ordem pública é improrrogável e instransferível.");
            question.setComentario("Correto\n A competência é de exercício obrigatório e não pode ser transferida, salvo os casos de delegação e avocação legalmente admitidos na Lei nº 9784/99. A competência também é considerada improrrogável uma vez que o fato de um órgão ou agente incompetente praticar um ato não faz com que ele passe a ser considerado competente, salvo disposição legal expressa que assim estabeleça.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(396L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A inobservância da forma vicia substancialmente o ato, tornando-o passível de invalidação, desde que necessária à sua perfeição e eficácia.");
            question.setComentario("Correto\n Quando a lei estabelece determinada forma como essencial à validade do ato, esse ato será nulo se não observada a forma legalmente exigida. Caso não haja exigência de forma, o vício será passível de convalidação sem a anulação do ato.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(397L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O ato nulo gera direitos ou obrigações às partes, criando situações ou gerando direitos e obrigações enquanto não anulado, motivo pelo qual pode ser convalidado.");
            question.setComentario("Errado\n O ato nulo não gera direitos ou obrigações para as partes, não cria situações jurídicas definitivas e não admite convalidação.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(398L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A Administração pode desfazer seus próprios atos por considerações de mérito e de ilegalidade, ao passo que o Judiciário só os pode invalidar quando ilegais.");
            question.setComentario("Correto\n A Administração Pública dentro do seu poder de autotutela pode revogar seus próprio atos por questão de mérito (oportunidade e conveniência) e anulá-los por questões de ilegalidade. Já o Poder Judiciário tem o poder apenas de anular.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(399L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Um ato inoportuno ou inconveniente só pode ser revogado pela própria Administração, mas um ato ilegal pode ser anulado, tanto pela Administração como pelo Judiciário.");
            question.setComentario("Correto\n Um ato inoportuno ou inconveniente só pode ser revogado pela própria Administração com efeitos ex nunc (não retroativos), já um ato ilegal pode ser anulado com efeitos ex tunc, tanto pela Administração como pelo Judiciário.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(400L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Se a Administração praticou ato ilegal, não pode ela anular ou revogar o ato por seus próprios meios diante do litígio instaurado com o seu destinatário, devendo socorrer-se do Judiciário.");
            question.setComentario("Errado\n Se a Administração praticou um ato ilegal ela deverá anulá-lo independentemente de autorização do Poder Judiciário já que ela detém o chamado Poder de Autotutela que confere a ela o poder de anular seus próprios atos quando ilegais e revogá-los quando forem inconvenientes ou inoportunos, independentemente de autorização do Poder Judiciário.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(401L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A anulação de um ato administrativo baseia-se em razões de conveniência ou de oportunidade, enquanto na revogação, em razões de legitimidade ou legalidade.");
            question.setComentario("Errado\n A anulação de um ato administrativo baseia-se em razões de ilegalidade, já a sua revogação por razões de oportunidade e conveniência.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(402L);
            question.setTema("Direito Penal");
            question.setEnunciado("Segundo o critério objetivo-formal da teoria restritiva, somente é considerado autor aquele que pratica o núcleo do tipo; partícipe é aquele que, sem realizar a conduta principal, concorre para o resultado, auxiliando, induzindo ou instigando o autor.");
            question.setComentario("Correto.\nA teoria restritiva do autor é a adotada pelo CP, porquanto o caput e os §§ 1º e 2º do art. 29 faz a nítida distinção entre autor e partícipe. Essa teoria distingue autor de partícipe, estabelecendo como critério distintivo a prática ou não de elementos do tipo. Assim, autor é aquele que concorre para a realização do crime, praticando elementos do tipo. Co-autor é aquele que concorre para a realização do crime, praticando parte do tipo, ou seja, ele presta uma ajuda considerada essencial, dividindo tarefas essenciais ao crime (divisão de tarefas em sede de tipo). Já o partícipe é aquele que contribui, de qualquer outro modo, para a realização de um crime, sem realizar elementos do tipo.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(403L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A anulação do ato administrativo pode ser feita pelo Judiciário, mas de forma discricionária, oportuna ou conveniente.");
            question.setComentario("Errado\n A anulação do ato administrativo pode ser feita tanto pela própria Administração Pública quanto pelo Poder Judiciário de forma vinculada, já que o ato é ilegal, obrigatoriamente ele deverá ser anulado.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(404L);
            question.setTema("Direito Penal");
            question.setEnunciado("É possível haver participação de participação.");
            question.setComentario("Correto.\nNa participação de participação, também chamada de participação em cadeia, uma conduta é acessória de outra conduta acessória. Ocorre quando alguém induz ou instiga uma pessoa para que esta posteriormente induza, instigue ou auxilie outro indivíduo a cometer um crime determinado.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(405L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A anulação do ato administrativo não poderá ser feita pelo Judiciário, porque a titularidade é da Administração Pública.");
            question.setComentario("Errado\n A anulação do ato administrativo tanto pode se feita pelo Poder Judiciário quando pela própria Administração Pública, esta tem apenas a titularidade no tocante à revogação.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(406L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A anulação do ato administrativo é prerrogativa do Poder Judiciário, não podendo ser feita pela Administração Pública.");
            question.setComentario("Errado\n A anulação do ato administrativo poderá ser feita tanto pelo Poder Judiciário quanto pela própria Administração Pública com efeitos ex tunc, ou seja, retroativos.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(407L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A anulação do ato administrativo pode ser feita pela Administração Pública, de ofício ou mediante provocação.");
            question.setComentario("Correto\n A Administração Pública baseada no seu poder de autotutela poderá anular seus próprios atos independentemente de autorização do Poder Judiciário, de oficio ou mediante provocação com efeitos ex tunc.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(408L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A anulação do ato administrativo não pode ser feita pela Administração Pública, salvo em casos urgência e interesses.");
            question.setComentario("Errado\n De acordo com a Súmula 473, STF, “A administração pode anular seus próprios atos, quando eivados de vícios que os tornam ilegais, porque deles não se originam direitos; ou revogá-los, por motivo de conveniência ou oportunidade, respeitados os direitos adquiridos, e ressalvada, em todos os casos, a apreciação judicial.”");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(409L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Em relação aos atos administrativos negociais, é certo que podem ser discricionários ou precários, dependendo de sua espécie, mas nunca vinculados ou definitivos.");
            question.setComentario("Errado\n Em relação aos atos administrativos negociais, é certo que podem ser discricionários ou precários, dependendo de sua espécie, assim como vinculados ou definitivos. Atos administrativos negociais vinculados são aqueles que a Administração pratica por requerimento do particular, quando este atende a todos os requisitos previstos em lei para a obtenção do ato, não cabendo escolha à Administração. Já os atos negociais definitivos são aqueles que têm como embasamento um direito individual do requerente, porém possuem interesse predominante da Administração. Estes podem ser revogados. Portanto, em ambos os casos os atos são requeridos pelos particulares que tenham interesse no ato, porém apenas os definitivos admitem revogação.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(410L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Em relação aos atos administrativos negociais, é certo que podem ser considerados desta espécie as autorizações, as apostilas e os atestados.");
            question.setComentario("Errado\n Em relação aos atos administrativos negociais, é certo que podem ser considerados desta espécie a autorização, a licença e a permissão.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(411L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Em relação aos atos administrativos negociais, é certo que não produzem quaisquer efeitos concretos e individuais para os administrados.");
            question.setComentario("Errado\n Os atos negociais produzem efeitos para os administrados, visto que estes requerem à Administração que se pratique ato de interesse de ambas as partes, mesmo que seja interesse indireto da Administração, ex. autorização ou permissão de uso de um bem público.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(412L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Em relação aos atosadministrativos negociais, é certo que não são contratos, mas sim manifestações unilaterais de vontade da Administração coincidentes com a pretensão do particular.");
            question.setComentario("Correto\n Atos negociais são os atos praticados pela Administração nos quais há uma declaração de vontade do Poder Público coincidente com a pretensão do particular. Apesar de encerrarem um conteúdo tipicamente negocial, esses atos unilaterais de interesse recíproco da Administração e do administrado, não são caracterizados como contratos.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(413L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Em relação aos atos administrativos negociais, é certo que são dotados, como os demais atos, de imperatividade ou coercitividade.");
            question.setComentario("Errado\n Atos negociais são os atos praticados pela Administração nos quais há uma declaração de vontade do Poder Público coincidente com a pretensão do particular, não há imperatividade ou coertividade neles.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(414L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Motivo e móvel do ato administrativo são expressões que não se equivalem.");
            question.setComentario("Correto\n O motivo é a causa imediata do ato administrativo. É a situação de fato e de direito que determina ou autoriza a prática do ato, ou, em outras palavras, o pressuposto fático e jurídico que enseja a prática do ato. Já o móvel está ligado ao fim que o ato deverá buscar que é o fim público. São, portanto, distintos.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(415L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Motivo é o pressuposto de fato e de direito que serve de fundamento ao ato administrativo.");
            question.setComentario("Correto\n Motivo é o pressuposto de fato e de direito que serve de fundamento ao ato administrativo, ou seja, é a causa imediata do ato administrativo, ex. na ordem para a demolição de um prédio, o motivo é o perigo que ele representa, em decorrência da sua má conservação.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(416L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Motivo e motivação do ato administrativo são expressões equivalentes.");
            question.setComentario("Errado\n Enquanto motivo é a causa imediata do ato administrativo, motivação faz parte da forma do ato, isto é, ela integra o elemento forma e não o elemento motivo. A motivação é a declaração escrita do motivo que determinou a prática do ato.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(417L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A imperatividade traduz a possibilidade de a administração pública, unilateralmente, criar obrigações para os administrados, ou impor-lhes restrições.");
            question.setComentario("Correto\n A imperatividade decorre do chamado poder extroverso do Estado, ou seja, da prerrogativa que tem a Administração de praticar atos que extravasam sua própria esfera jurídica e adentram a esfera jurídica alheia, alterando-a, independentemente da anuência prévia de qualquer pessoa. É nesse sentido que a imperatividade confere à Administração a possibilidade de unilateralmente criar obrigações e impor restrições aos administrados.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(418L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A presunção de legitimidade impede que o ato administrativo seja contestado perante o Judiciário.");
            question.setComentario("Errado\n A presunção de legitimidade é um atributo presente em todos os atos administrativos, quer imponham obrigações, quer reconheçam ou confiram direitos aos administrados. Tal presunção é relativa, (iuris tantum), portanto, poderá ser o ato administrativo questionado perante a própria Administração Pública ou pelo perante o Poder Judiciário.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(419L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A autoexecutoriedade está presente em todo e qualquer ato administrativo.");
            question.setComentario("Errado\n A autoexecutoriedade não é um atributo presente em todos os atos administrativos. Genericamente, afirma-se que a autoexecutoriedade é qualidade própria dos atos inerentes ao exercício de atividades típicas da Administração, quando ela está atuando na condição de Poder Público. A autoexecutoriedade existe em duas situações: quando a lei expressamente a prevê e, mesmo quando não expressamente prevista, em situações de urgência.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(420L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A imperatividade implica o reconhecimento de que, até prova em contrário, o ato foi expedido com observância da lei.");
            question.setComentario("Errado\n A presunção de legitimidade implica o reconhecimento de que, até prova em contrário, o ato foi expedido com observância da lei.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(421L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A presença da autoexecutoriedade impede a suspensão preventiva do ato pela via judicial.");
            question.setComentario("Errado\n A presença da autoexecutoriedade não impede a suspensão preventiva do ato pela via judicial. A autoexecutoriedade dos atos administrativos apenas permite a sua implementação material direta pela Administração, mas, sempre que o administrado entenda haver desvio ou excesso de poder, ou quaisquer outras ilegalidades, poderá exercer seu direito de buscar a tutela jurisdicional. O Poder Judiciário poderá declarar a nulidade do ato administrativo ou suspender preventivamente a sua eficácia se assim considerar pertinentes as alegações do administrado.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(422L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Quando a lei estabelece a única solução possível diante de determinada situação de fato, fixando todos os requisitos, cuja existência a Administração deve limitar-se a constatar, sem qualquer margem de apreciação subjetiva, estamos diante de atos administrativos discricionários.");
            question.setComentario("Errado\n Quando a lei estabelece a única solução possível diante de determinada situação de fato, fixando todos os requisitos, cuja existência a Administração deve limitar-se a constatar, sem qualquer margem de apreciação subjetiva, estamos diante de atos administrativos vinculados.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(423L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A anulação sempre se dá em caráter ex nunc e respeita os efeitos produzidos durante a vigência do ato.");
            question.setComentario("Errado\n A revogação sempre se dá em caráter ex nunc e respeita os efeitos produzidos durante a vigência do ato, de acordo com a Súmula 473, STF.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(424L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A revogação sempre se dá em caráter ex tunc e desfaz os efeitos produzidos durante a vigência do ato, com ou sem indenização.");
            question.setComentario("Errado\n A anulação sempre se dá em caráter ex tunc e desfaz os efeitos produzidos durante a vigência do ato, com ou sem indenização.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(425L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Apenas os atos discricionários podem ser objeto de revogação.");
            question.setComentario("Correto\n A revogação se dá por critérios de oportunidade e conveniência e apenas os atos discricionários contam com essa margem de liberdade dada ao administrador. Assim, praticado o ato discricionário, ele poderá ser revogado por ter perdido a sua utilidade. É interessante lembrar que o ato discricionário poderá ser revogado ou anulado quando for ilegal e o ato vinculado poderá apenas ser anulado.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(426L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Apenas os atos vinculados podem ser objeto de anulação.");
            question.setComentario("Errado\n Tanto os atos vinculados como os atos discricionários se praticados em desconformidade com a lei poderão ser anulados.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(427L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A revogação por conveniência e oportunidade desobriga a Administração de indenizar o particular lesado.");
            question.setComentario("Errado\n A revogação é a retirada do mundo jurídico de um ato válido, mas que, segundo critério discricionário da Administração, tornou-se inoportuno ou inconveniente. Em regra, a revogação não gera para a Administração o dever de indenizar. No entanto, acaso ela tenha gerado um prejuízo ao particular, este terá o direito de ser indenizado.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(428L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O princípio da presunção de legalidade dos atos administrativos impede sua apreciação pelo Poder Judiciário.");
            question.setComentario("Errado\n O princípio da presunção de legalidade dos atos administrativos não impede sua apreciação pelo Poder Judiciário. Portanto, a referida presunção não impede que o particular questione o ato administrativo perante o Poder Judiciário ou perante a própria Administração Pública, até mesmo preventivamente em alguns casos.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(429L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O princípio da presunção de legalidade dos atos administrativos permite que a sua legalidade seja questionada, embora o ato seja considerado válido até decisão em contrário.");
            question.setComentario("Correto\n A presunção de legitimidade é um atributo presente em todos os atos administrativos, ele deflui da própria natureza do ato administrativo, está presente desde o nascimento do ato e independe de norma legal que o preveja. Em regra, o ato administrativo obriga os administrados por ele atingidos, ou produz os efeitos que lhe são próprios, desde o momento de sua edição, ainda que possam acarretar a futura invalidação do ato. Esse requisito autoriza, assim, a imediata execução e cumprimento de um ato administrativo, mesmo se ele estiver eivado de vícios ou defeitos aparentes, enquanto não anulado ou sustado temporariamente os seus efeitos, pela Administração ou pelo Poder Judiciário, o ato inválido será plenamente eficaz e válido, devendo ser cumprido.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(430L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O princípio da presunção de legalidade dos atos administrativos torna verdadeiros, em caráter absoluto, os fatos alegados pela Administração como motivos para edição do ato.");
            question.setComentario("Errado\n O princípio da presunção de legalidade dos atos administrativos torna verdadeiros, em caráter relativo (iuris tantum), os fatos alegados pela Administração como motivos para edição do ato.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(431L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A derrogabilidade e a prorrogabilidade são características da competência administrativa.");
            question.setComentario("Errado\n A competência é inderrogável, seja pela vontade da Administração, seja por acordo com terceiros; isto porque a competência é conferida em benefício do interesse público. A competência é também improrrogável, o fato de um órgão ou agente incompetente praticar um ato não faz com que ele passe a ser considerado competente, salvo disposição legal expressa que assim estabeleça.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(432L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Objeto ou conteúdo é o efeito imediato que o ato produz.");
            question.setComentario("Correto\n Objeto ou conteúdo é o efeito imediato que o ato produz, é o próprio conteúdo do ato. Ao contrário da finalidade que é o resultado mediato.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(433L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Anulação é a declaração de invalidação de um ato administrativo ilegítimo ou ilegal, feita pela própria Administração ou pelo Poder Judiciário.");
            question.setComentario("Correto\n Anulação é a declaração de invalidação de um ato administrativo ilegítimo ou ilegal, com efeitos ex tunc (retroativos), feita pela própria Administração, com base no seu Poder de Autotutela, amparado na Súmula nº 473, STF ou pelo Poder Judiciário.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(434L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Em regra, a anulação do ato jurídico produz efeitos a partir da sua declaração, não retroagindo os seus efeitos.");
            question.setComentario("Errado\n A anulação do ato administrativo opera retroativamente (ex tunc), resguardados os efeitos já produzidos perante terceiros de boa-fé. Já a revogação tem efeitos prospectivos (ex nunc).");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(435L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O prazo para a Administração invalidar seus próprios atos, salvo se expressamente previsto em norma legal, é de três anos.");
            question.setComentario("Errado\n De acordo com a Lei nº 9784/99, art. 50, o direito da Administração de anular os atos administrativos de que decorram efeitos favoráveis para os destinatários decai em cinco anos, contados da data em que foram praticados, salvo comprovada má-fé.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(436L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A Administração não pode revogar ato administrativo por conveniência ou oportunidade.");
            question.setComentario("Errado\n A Administração pode revogar ato administrativo por conveniência ou oportunidade, com efeitos ex nunc e anular ato administrativo ilegal com efeitos ex tunc.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(437L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A revogação do ato administrativo opera efeitos ex tunc.");
            question.setComentario("Errado\n A revogação do ato administrativo opera efeitos ex nunc (prospectivos).");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(438L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Ato constitutivo é aquele pelo qual a Administração cria, modifica ou extingue um direito ou uma situação do administrado.");
            question.setComentario("Correto\n Ato constitutivo é aquele pelo qual a Administração cria, modifica ou extingue um direito ou uma situação do administrado, ex. permissão, autorização, dispensa, aplicação de penalidade, revogação.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(439L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Ato declaratório é aquele pelo qual a Administração apenas atesta ou reconhece determinada situação de fato ou de direito.");
            question.setComentario("Errado\n Ato enunciativo é aquele pelo qual a Administração apenas atesta ou reconhece determinada situação de fato ou de direito, ex. certidões, atestados, informações, pareceres, vistos.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(440L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Autoexecutoriedade é atributo do ato administrativo pelo qual ele pode ser posto em execução pela própria Administração Pública.");
            question.setComentario("Correto\n Atos autoexecutórios são os que podem ser materialmente implementados pela Administração, diretamente, inclusive mediante o uso da força, se necessária, sem que a Administração precise obter autorização judicial prévia. Tal atributo não tem o poder de afastar a apreciação judicial do ato, apenas dispensa a Administração de obter ordem judicial prévia para poder praticá-lo.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(441L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Ato de gestão é o que a Administração pratica usando da sua supremacia sobre o administrado ou servidor e lhes impõe obrigatório atendimento.");
            question.setComentario("Errado\n Ato de império é o que a Administração pratica usando da sua supremacia sobre o administrado ou servidor e lhes impõe obrigatório atendimento.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(442L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Ato discricionário é o que a Administração pode praticar com liberdade de escolha de seu conteúdo, de seu destinatário, de sua conveniência, de sua oportunidade e do modo de sua realização.");
            question.setComentario("Correto\n Ato discricionário é aquele que a Administração pode praticar com certa liberdade de escolha, nos termos e limites da lei, quanto ao seu conteúdo, seu modo de realização, sua oportunidade e sua conveniência administrativas. Enquanto o agente público está rigidamente adstrito à lei quanto a todos os elementos de um ato vinculado, ao praticar um ato discricionário possui ele certa liberdade quanto à valoração dos motivos e à escolha do objeto.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(443L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Licença é ato administrativo vinculado por meio do qual a Administração confere ao interessado consentimento para o desempenho de certa atividade.");
            question.setComentario("Correto\n Licença é ato administrativo vinculado por meio do qual a Administração confere ao interessado consentimento para o desempenho de certa atividade. Por ser a licença um ato vinculado, uma vez atendidas as exigências legais e regulamentares pelo interessado, deve a Administração concedê-la, Ex. concessão de um alvará para a realização de uma obra, a concessão de um alvará para o funcionamento de um estabelecimento comercial, a licença para o exercício de uma profissão, a licença para dirigir etc.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(444L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Permissão é ato administrativo vinculado e definitivo, pelo qual a Administração consente que o particular execute serviço de utilidade pública ou utilize privativamente bem público.");
            question.setComentario("Errado\n Permissão é ato administrativo discricionário e precário mediante o qual é consentida ao particular alguma conduta em que exista interesse predominante da coletividade. O ato administrativo de permissão, embora discricionário e precário, pode ter prazo determinado. A permissão pode ser remunerada ou podem ser impostas condições a serem cumpridas pelo particular.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(445L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Autorização é ato administrativo pelo qual a Administração consente que o particular exerça atividade ou utilize bem público no seu próprio interesse.");
            question.setComentario("Correto\n Autorização é ato administrativo unilateral, discricionário e precário pelo qual a Administração consente que o particular exerça atividade ou utilize bem público (autorização de uso) no seu próprio interesse. A autorização é outorgada sem prazo determinado. Não há, regra geral, indenização para o particular que tenha a sua autorização revogada. Todavia, especialmente nos casos em que a autorização tenha sido outorgada por prazo certo, pode ocorrer de a sua revogação, antes do termo final estipulado, ensejar direito a indenização do particular.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(446L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Mesmo quando o Estado pratica ato jurídico regulado pelo direito Civil ou Comercial, ele pratica ato administrativo.");
            question.setComentario("Errado\n Ato administrativo é a declaração do Estado ou de quem o represente, que produz efeitos jurídicos imediatos, com observância da lei, sob o regime jurídico de direito público e sujeita a controle pelo Poder Judiciário.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(447L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Fato administrativo é a realização material da Administração em cumprimento de alguma decisão administrativa.");
            question.setComentario("Errado\n Fato administrativo é a realização material da Administração em cumprimento de alguma decisão administrativa.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(448L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O ato administrativo é sempre bilateral.");
            question.setComentario("Errado\n O ato administrativo é uma declaração unilateral de vontade da Administração. Já o contrato administrativo é sempre bilateral.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(449L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O ato administrativo pode pertencer ao direito público ou ao direito privado.");
            question.setComentario("Errado\n O ato da administração pode pertencer ao direito público ou ao direito privado.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(450L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("É considerado ato administrativo aquele praticado por entidade de direito privado no exercício de função delegada do Poder Público e em razão dela.");
            question.setComentario("Correto\n O ato administrativo é uma declaração do Estado ou de quem o represente, ex. concessionário de serviços públicos.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(451L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A Administração não pode anular os seus próprios atos.");
            question.setComentario("Errado\n Com base no seu poder de autotutela a A Administração pode anular e revogar seus próprios atos.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(452L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Os atos vinculados não são passíveis de anulação.");
            question.setComentario("Errado\n Os atos discricionários podem ser anulados (quando ilegais) ou revogados (quando legais, porém inconvenientes e inoportunos), já os atos vinculados só podem ser anulados (quando ilegais).");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(453L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A anulação nunca produz efeitos retroativos à data em que foi decretada a nulidade.");
            question.setComentario("Errado\n A revogação produz efeitos ex nunc (prospectivos) e a anulação efeitos ex tunc (retroativos).");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(454L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A anulação deve ocorrer quando há vício no ato, relativo à legalidade ou à legitimidade.");
            question.setComentario("Correto\n A anulação é a retirada de atos inválidos, com vício, ilegais por meio do controle de legalidade ou legitimidade. Opera retroativamente, resguardados os efeitos já produzidos perante terceiros de boa-fé. Pode ser efetuada pela Administração, de ofício ou provocada, ou pelo Judiciário, se provocado. Pode incidir sobre atos discricionários ou vinculados.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(455L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O Poder Judiciário, no exercício da função jurisdicional, não pode anular ato administrativo, só pode revogá-lo.");
            question.setComentario("Errado\n O Poder Judiciário, no exercício da função jurisdicional, pode anular ato administrativo fazendo um controle de legalidade, mas não pode revogá-lo porque o controle de mérito pertence apenas à própria Administração Pública.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(456L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Não é dever do administrado prestar informações solicitadas pela Administração, pois caracterizaria afronta a princípios constitucionais, como a liberdade e a democracia.");
            question.setComentario("Errado\n De acordo com a Lei nº 9784/99, art. 4º, IV, são deveres dos administrado perante a Administração, sem prejuízo de outros previstos em atos normativos, prestar as informações que lhe forem solicitadas para o esclarecimento dos fatos.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(457L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("É possível, como regra, a renúncia de competências.");
            question.setComentario("Errado\n Conforme a Lei nº 9784/99, art. 11, a competência é irrenunciável e se exerce pelos órgãos administrativos a que foi atribuída como própria, salvo os casos de delegação e avocação legalmente admitidos.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(458L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Considera-se entidade a unidade de atuação sem personalidade jurídica.");
            question.setComentario("Errado\n Em consonância com a Lei nº 9784/99, entidade é a unidade de atuação dotada de personalidade jurídica.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(459L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("É possível a impulsão, de ofício, do processo pela Administração e, assim ocorrendo, dar-se-á com prejuízo da atuação de interessados, por prevalecer o interesse público.");
            question.setComentario("Errado\n É possível a impulsão, de ofício, do processo pela Administração e, assim ocorrendo, dar-se-á sem prejuízo da atuação de interessados, conforme dispõe a Lei nº 9784/99, art. 2º, parágrafo único, inciso XII.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(460L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Autoridades e servidores deverão facilitar o exercício dos direitos dos administrados.");
            question.setComentario("Correto\n O administrado tem o direito de ser tratado com respeito pelas autoridades e servidores, que deverão facilitar o exercício de seus direitos e o cumprimento de suas obrigações, é o que dispõe a Lei nº 9784/99, art. 3º, inciso I.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(461L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Se o recorrente alegar que a decisão administrativa contraria enunciado de súmula vinculante, não caberá à autoridade prolatora da decisão impugnada, se não a reconsiderar, explicitar razões de aplicabilidade ou não da súmula, cabendo tal atribuição apenas ao órgão competente para decidir o recurso.");
            question.setComentario("Errado\n De acordo com a Lei nº 9784/99, art. 56, § 3º, que se o recorrente alegar que a decisão administrativa contraria enunciado de súmula vinculante, caberá à autoridade prolatora da decisão impugnada, se não a reconsiderar, explicitar, antes de encaminhar o recurso à autoridade superior, as razões de aplicabilidade ou não da súmula, conforme o caso.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(462L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Quando a lei não fixar prazo diferente, o recurso administrativo deverá ser decidido no prazo máximo de noventa dias, a partir do recebimento dos autos pelo órgão competente.");
            question.setComentario("Errado\n De acordo com o art. 59, § 1º, da Lei nº 9784/99, quando a lei não fixar prazo diferente, o recurso administrativo deverá ser decidido no prazo máximo de trinta dias, a partir do recebimento dos autos pelo órgão competente.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(463L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O recurso interpõe-se por meio de requerimento no qual o recorrente deverá expor os fundamentos do pedido de reexame, não podendo, nessa fase processual, juntar documentos.");
            question.setComentario("Errado\n Lei nº 9784/99, art. 60, dispõe que o recurso interpõe-se por meio de requerimento no qual o recorrente deverá expor os fundamentos do pedido de reexame, podendo juntar os documentos que julgar convenientes.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(464L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Os cidadãos não têm legitimidade para interpor recurso administrativo sobre direitos difusos, sendo legitimadas, nessa hipótese, apenas as associações.");
            question.setComentario("Errado\n De acordo com o art. 58, inciso I, da Lei nº 9784/99, têm legitimidade para interpor recurso administrativo, dentre outros, os cidadãos ou associações, quanto a direitos ou interesses difusos.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(465L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O recurso não será conhecido quando interposto perante órgão incompetente.");
            question.setComentario("Correto\n De acordo com a Lei nº 9784/99, art.63, o recurso não será conhecido quando interposto fora do prazo, perante órgão incompetente, por quem não seja legitimado e após exaurida a esfera administrativa.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(466L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O não conhecimento do recurso administrativo não impede a Administração de rever de ofício o ato ilegal, ainda que ocorrida preclusão administrativa.");
            question.setComentario("Errado\n O não conhecimento do recurso administrativo não impede a Administração de rever de ofício o ato ilegal, desde que não ocorrida preclusão administrativa, Lei nº 9784/99, art. 63, § 2º.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(467L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Das decisões administrativas cabe recurso, o qual somente poderá impugnar as razões de legalidade da decisão, isto é, não se presta para rediscussão de mérito.");
            question.setComentario("Errado\n Lei nº 9784/99, art. 56, caput, dispõe que das decisões administrativas cabe recurso, em face de razões de legalidade e de mérito.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(468L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Salvo disposição legal específica, é de cinco dias o prazo para interposição de recurso administrativo, contado a partir da ciência ou divulgação oficial da decisão recorrida.");
            question.setComentario("Errado\n Salvo disposição legal específica, é de dez dias o prazo para interposição de recurso administrativo, contado a partir da ciência ou divulgação oficial da decisão recorrida, art. 59, caput, da Lei nº 9784/99.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(469L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Havendo justo receio de prejuízo de difícil ou incerta reparação decorrente da execução, a autoridade recorrida ou a imediatamente superior poderá, de ofício ou a pedido, dar efeito suspensivo ao recurso.");
            question.setComentario("Correto\n É o inteiro teor do art. 61, parágrafo único, da Lei nº 9784/99, que assim dispõe: “Havendo justo receio de prejuízo de difícil ou incerta reparação decorrente da execução, a autoridade recorrida ou a imediatamente superior poderá, de ofício ou a pedido, dar efeito suspensivo ao recurso”.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(470L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Interposto o recurso, o órgão competente para dele conhecer deverá intimar os demais interessados para que, no prazo de quinze dias úteis, apresentem alegações.");
            question.setComentario("Errado\n De acordo com art. 62, da Lei nº 9784/99, “Interposto o recurso, o órgão competente para dele conhecer deverá intimar os demais interessados para que, no prazo de cinco dias úteis, apresentem alegações”.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(471L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O recurso será dirigido à autoridade que proferiu a decisão, a qual, se não a reconsiderar no prazo de dez dias, o encaminhará à autoridade superior.");
            question.setComentario("Errado\n Dispõe o art. 56, § 1º que o recurso será dirigido à autoridade que proferiu a decisão, a qual, se não a reconsiderar no prazo de cinco dias, o encaminhará à autoridade superior.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(472L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O processo administrativo, de que resulte sanção, poderá ser revisto a qualquer tempo, apenas por pedido expresso da parte interessada, desde que surjam fatos novos que justifiquem a inadequação da sanção aplicada.");
            question.setComentario("Errado\n Lei n 9.784, em seu art. 65, dispõe que os processos administrativos de que resultem sanções poderão ser revistos, a qualquer tempo, a pedido ou de ofício, quando surgirem fatos novos OU circunstâncias relevantes suscetíveis de justificar a inadequação da sanção aplicada.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(473L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Em regra, a interposição de recurso administrativo depende de caução.");
            question.setComentario("Errado\n De acordo com a Lei n 9.784, art. 56, § 2º, salvo exigência legal, a interposição de recurso administrativo independe de caução.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(474L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O recurso administrativo tramitará no máximo por duas instâncias administrativas, salvo disposição legal diversa.");
            question.setComentario("Errado\n Lei n 9.784, em seu art. 57, dispõe que o recurso administrativo tramitará no máximo por três instâncias administrativas, salvo disposição legal diversa.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(475L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Tem legitimidade para interpor recurso administrativo aquele cujo direito ou interesse for indiretamente afetado pela decisão recorrida.");
            question.setComentario("Correto\n A lei do processo administrativo coloca, em seu art. 58 um rol de legitimados para a interposição recurso administrativo. São eles: os titulares de direitos e interesses queforem parte no processo; aqueles cujos direitos ou interesses forem indiretamente afetados pela decisão recorrida; as organizações e associações representativas, no tocante a direitos e interesses coletivos; os cidadãos ou associações, quanto a direitos ou interesses difusos.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(476L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O interessado poderá, mediante manifestação escrita, renunciar a direitos disponíveis e indisponíveis.");
            question.setComentario("Errado\n O interessado poderá, mediante manifestação escrita, desistir total ou parcialmente do pedido formulado ou, ainda, renunciar a direitos disponíveis, é o que dispõe o art. 51, da Lei nº 9784/99.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(477L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O interessado poderá, mediante manifestação escrita ou oral, desistir total ou parcialmente do pedido formulado.");
            question.setComentario("Errado\n O interessado poderá, mediante manifestação escrita, desistir total ou parcialmente do pedido formulado ou, ainda, renunciar a direitos disponíveis, é o que dispõe o art. 51, da Lei nº 9784/99.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(478L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A desistência do interessado, conforme o caso, prejudica o prosseguimento do processo, ainda que a Administração considere que o interesse público exija sua continuidade.");
            question.setComentario("Errado\n De acordo com o art. 51, § 2º, da Lei nº 9784/99, a desistência ou renúncia do interessado, conforme o caso, não prejudica o prosseguimento do processo, se a Administração considerar que o interesse público assim o exige.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(479L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O órgão competente não poderá declarar extinto o processo quando o objeto da decisão se tornar inútil por fato superveniente, devendo, nessa hipótese, levar o feito até seu término, com decisão de mérito.");
            question.setComentario("Errado\n O órgão competente poderá declarar extinto o processo quando exaurida sua finalidade ou o objeto da decisão se tornar impossível, inútil ou prejudicado por fato superveniente, é o que dispõe o art. 52, da Lei nº 9784/99.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(480L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Havendo vários interessados, a desistência ou renúncia atinge somente quem a tenha formulado.");
            question.setComentario("Correto\n É o que dispõe a redação do art. 51 § 1º, da Lei nº 9784/99 “Havendo vários interessados, a desistência ou renúncia atinge somente quem a tenha formulado”.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(481L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Será permitida, em qualquer hipótese, a avocação temporária de competência atribuída a órgão hierarquicamente inferior.");
            question.setComentario("Errado\n A Lei 9.784, art. 15, dispõe que será permitida, em caráter excepcional e por motivos relevantes devidamente justificados, a avocação temporária de competência atribuída a órgão hierarquicamente inferior.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(482L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("No que diz respeito ao vencimento e à remuneração, é certo que, quando o pagamento indevido houver ocorrido no mês anterior ao do processamento da folha, a reposição será feita imediatamente, em uma única parcela.");
            question.setComentario("Correto\n As reposições e indenizações ao erário, atualizadas até 30 de junho de 1994, serão previamente comunicadas ao servidor ativo, aposentado ou ao pensionista, para pagamento, no prazo máximo de trinta dias, podendo ser parceladas, a pedido do interessado. Quando o pagamento indevido houver ocorrido no mês anterior ao do processamento da folha, a reposição será feita imediatamente, em uma única parcela, Lei nº 8112/90, art. 46, § 2º.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(483L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Poderá ser objeto de delegação, entre outras, a edição de atos de caráter normativo ou matérias de competência privativa do órgão administrativo.");
            question.setComentario("Errado\n Não é possível ser objeto de delegação a edição de atos de caráter normativo, a decisão de recurso administrativo e as matérias de competência exclusiva do órgão ou autoridade, Lei nº 9784/99, art. 13.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(484L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O ato de delegação não pode ser anulado ou revogado pela Administração, sendo necessária a providência cabível ao Poder Judiciário.");
            question.setComentario("Errado\n De acordo com a Lei 9.784, art. 14, § 2º, o ato de delegação é revogável a qualquer tempo pela autoridade delegante.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(485L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("As decisões adotadas por delegação devem mencionar explicitamente esta qualidade e considerar-se-ão editadas pelo delegado.");
            question.setComentario("Correto\n Dispõe a Lei 9.784, art. 14, § 3º, que as decisões adotadas por delegação devem mencionar explicitamente esta qualidade e considerar-se-ão editadas pelo delegado.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(486L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Inexistindo competência legal específica, o processo administrativo deve iniciar-se perante a autoridade de maior grau hierárquico para decidir.");
            question.setComentario("Errado\n A Lei 9.784, art. 17, dispõe que inexistindo competência legal específica, o processo administrativo deverá ser iniciado perante a autoridade de menor grau hierárquico para decidir.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(487L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Inexistindo competência legal específica, o processo administrativo deverá ser iniciado perante a autoridade de menor grau hierárquico para decidir.");
            question.setComentario("Correto\n Inexistindo competência legal específica, o processo administrativo deverá ser iniciado perante a autoridade de menor grau hierárquico para decidir, é exatamente o que dispõe o art. 17 da Lei nº 9784/99.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(488L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O ato de delegação é revogável a qualquer tempo pela autoridade delegante.");
            question.setComentario("Correto\n É exatamente a redação do art. 14, § 2º, da Lei nº 9784/99, que assim dispõe: “O ato de delegação é revogável a qualquer tempo pela autoridade delegante”.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(489L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O ato de delegação e sua revogação deverão ser publicados no meio oficial.");
            question.setComentario("Correto\n “O ato de delegação e sua revogação deverão ser publicados no meio oficial”, art. 14, caput, da Lei nº 9784/99.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(490L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("As decisões adotadas por delegação devem mencionar explicitamente esta qualidade e considerar-se-ão editadas pelo delegado.");
            question.setComentario("Correto\n De acordo com o art. 14, §3º, da Lei nº 9784/99, as decisões adotadas por delegação devem mencionar explicitamente esta qualidade e considerar-se-ão editadas pelo delegado.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(491L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A competência é renunciável e se exerce pelos órgãos administrativos a que foi atribuída como própria, salvo os casos de delegação e avocação legalmente admitidos.");
            question.setComentario("Errado\n A competência é irrenunciável e se exerce pelos órgãos administrativos a que foi atribuída como própria, salvo os casos de delegação e avocação legalmente admitidos, art. 11, da Lei nº 9784/99.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(492L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O administrado tem o dever de prestar as informações que lhe forem solicitadas.");
            question.setComentario("Correto\n O administrado tem o dever de prestar as informações que lhe forem solicitadas, art. 4º, inciso IV, da Lei nº 9784/99.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(493L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("É direito do administrado formular alegações e apresentar documentos antes da decisão.");
            question.setComentario("Correto\n É direito do administrado formular alegações e apresentar documentos antes da decisão, art. 3º, inciso III, da Lei nº 9784/99.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(494L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O administrado tem o direito de ser tratado com respeito pelas autoridades e servidores, que deverão facilitar o exercício de seus direitos e o cumprimento de suas obrigações.");
            question.setComentario("Correto\n O administrado tem o direito de ser tratado com respeito pelas autoridades e servidores, que deverão facilitar o exercício de seus direitos e o cumprimento de suas obrigações, art. 3º, inciso I, da Lei nº 9784/99.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(495L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O administrado deve fazer-se assistir, obrigatoriamente, por advogado.");
            question.setComentario("Errado\n O administrado tem o direito de fazer-se assistir, facultativamente, por advogado, salvo quando obrigatória a representação, por força de lei, art. 3º, IV, da Lei nº 9784/99.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(496L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("São legitimados como interessados aqueles que, sem terem iniciado o processo, têm direitos ou interesses que possam ser afetados pela decisão a ser adotada.");
            question.setComentario("Correto\n São legitimados como interessados aqueles que, sem terem iniciado o processo, têm direitos ou interesses que possam ser afetados pela decisão a ser adotada, art. 9º, II, da Lei nº 9784/99.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(497L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Inexistindo competência legal específica, o processo administrativo deverá ser iniciado perante a autoridade de maior grau hierárquico para decidir.");
            question.setComentario("Errado\n Inexistindo competência legal específica, o processo administrativo deverá ser iniciado perante a autoridade de menor grau hierárquico para decidir, art. 17, da Lei nº 9784/99.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(498L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O recurso administrativo tramitará no máximo por duas instâncias administrativas, salvo disposição legal diversa.");
            question.setComentario("Errado\n O recurso administrativo tramitará no máximo por três instâncias administrativas, salvo disposição legal diversa, art. 57 da Lei nº 9784/99.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(499L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Um dos critérios a serem observados no processo administrativo é a proibição de cobrança de despesas processuais, ressalvadas as previstas em lei.");
            question.setComentario("Correto\n Um dos critérios a serem observados no processo administrativo é a proibição de cobrança de despesas processuais, ressalvadas as previstas em lei, art. 2º, inciso XI, da Lei nº 9784/99.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(500L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O ato de delegação é revogável a qualquer tempo pela autoridade delegante.");
            question.setComentario("Correto\n O ato de delegação é revogável a qualquer tempo pela autoridade delegante, art. 14, § 2º, da Lei nº 9784/99.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(501L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A competência é irrenunciável e se exerce pelos órgãos administrativos a que foi atribuída como própria, salvo os casos de delegação e avocação legalmente admitidos.");
            question.setComentario("Correto\n A competência é irrenunciável e se exerce pelos órgãos administrativos a que foi atribuída como própria, salvo os casos de delegação e avocação legalmente admitidos, art. 11, da Lei nº 9784/99.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(502L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Não será permitida, em qualquer caso, a avocação de competência atribuída a órgão hierarquicamente inferior, salvo por delegação desta, nas matérias exclusivamente normativas.");
            question.setComentario("Errado\n Dispõe a Lei nº 9784/99, art. 15, que será permitida, em caráter excepcional e por motivos relevantes devidamente justificados, a avocação temporária de competência atribuída a órgão hierarquicamente inferior.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(503L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O ato de delegação e sua revogação deverão ser publicados no meio oficial.");
            question.setComentario("Correto\n O ato de delegação e sua revogação deverão ser publicados no meio oficial, art. 14, caput, da Lei nº 9784/99.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(504L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Não podem ser objeto de delegação, além de outros, a edição de atos de caráter normativo.");
            question.setComentario("Correto\n Não podem ser objeto de delegação, além de outros, a edição de atos de caráter normativo, art. 13, inciso I, da Lei nº 9784/99.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(505L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("São deveres do administrado, perante a administração, sem prejuízo de outros previstos em ato normativo, não agir de modo temerário.");
            question.setComentario("Correto\n São deveres do administrado, perante a administração, sem prejuízo de outros previstos em ato normativo, não agir de modo temerário, Lei nº 9784/99, art. 4º, inciso II.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(506L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Nos processos administrativos serão observados, entre outros, os critérios de indicação dos pressupostos de fato e de direito que determinarem a decisão.");
            question.setComentario("Correto\n Nos processos administrativos serão observados, entre outros, os critérios de indicação dos pressupostos de fato e de direito que determinarem a decisão, Lei nº 9784/99, em seu art. 2º, VII.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(507L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Os atos administrativos deverão ser motivados, com indicação dos fatos e dos fundamentos jurídicos, salvo quando decidam imotivadamente processos administrativos de concurso ou seleção pública.");
            question.setComentario("Errado\n Dispõe a Lei nº 9784/99, em seu art. art. 50, inciso III, que os atos administrativos deverão ser motivados, com indicação dos fatos e dos fundamentos jurídicos, dentre outros, quando decidam processos administrativos de concurso ou seleção pública.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(508L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Inexistindo competência legal específica, o processo administrativo deverá ser iniciado perante a autoridade de menor grau hierárquico para decidir.");
            question.setComentario("Correto\n Inexistindo competência legal específica, o processo administrativo deverá ser iniciado perante a autoridade de menor grau hierárquico para decidir, art.17, da Lei nº 9784/99.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(509L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Será permitida, em caráter excepcional e por motivos relevantes devidamente justificados, a avocação temporária de competência atribuída a órgão hierarquicamente inferior.");
            question.setComentario("Correto\n Será permitida, em caráter excepcional e por motivos relevantes devidamente justificados, a avocação temporária de competência atribuída a órgão hierarquicamente inferior, art. 15 da Lei nº 9784/99.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(510L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A competência é irrenunciável e se exerce pelos órgãos administrativos a que foi atribuída como própria, salvo os casos de delegação e avocação legalmente admitidos.");
            question.setComentario("Correto\n A competência é irrenunciável e se exerce pelos órgãos administrativos a que foi atribuída como própria, salvo os casos de delegação e avocação legalmente admitidos, art. 11, da Lei nº 9784/99.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(511L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("As decisões adotadas por delegação devem mencionar explicitamente esta qualidade e considerar-se-ão editadas pelo delegado.");
            question.setComentario("Correto\n As decisões adotadas por delegação devem mencionar explicitamente esta qualidade e considerar-se-ão editadas pelo delegado, art. 14, § 3º, da Lei nº 9784/99.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(512L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Quando a lei não fixar prazo diferente, o recurso administrativo deverá ser decidido no prazo máximo de quinze dias, a partir do recebimento dos autos pelo órgão competente, prorrogáveis por igual período.");
            question.setComentario("Errado\n De acordo com o art. 59 § 1º, da Lei nº 9784/99, quando a lei não fixar prazo diferente, o recurso administrativo deverá ser decidido no prazo máximo de 30 dias, a partir do recebimento dos autos pelo órgão competente.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(513L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Se o recorrente alegar que a decisão administrativa contraria enunciado da súmula vinculante, caberá à autoridade prolatora da decisão impugnada encaminhar o recurso à autoridade superior, sem qualquer manifestação.");
            question.setComentario("Errado\n Dispõe a Lei nº 9784/99, em seu art. 64-A que se o recorrente alegar violação de enunciado da súmula vinculante, o órgão competente para decidir o recurso explicitará as razões da aplicabilidade ou inaplicabilidade da súmula, conforme o caso.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(514L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O recurso administrativo tramitará no máximo por duas instâncias administrativas, salvo disposição legal diversa.");
            question.setComentario("Errado\n De acordo com a Lei nº 9784/99, em seu art. 57, o recurso administrativo tramitará no máximo por três instâncias administrativas, salvo disposição legal diversa.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(515L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Não tem legitimidade para interpor recurso aqueles cujos direitos ou interesses forem indiretamente afetados pela decisão recorrida.");
            question.setComentario("Errado\n De acordo com o art. 58, inciso II da Lei nº 9784/99, Têm legitimidade para interpor recurso administrativo aqueles cujos direitos ou interesses forem indiretamente afetados pela decisão recorrida.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(516L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O recurso será dirigido à autoridade que proferiu a decisão, a qual, se não a reconsiderar no prazo de cinco dias, o encaminhará à autoridade superior.");
            question.setComentario("Correto\n O recurso será dirigido à autoridade que proferiu a decisão, a qual, se não a reconsiderar no prazo de cinco dias, o encaminhará à autoridade superior, art. 56, § 1º, da Lei nº 9784/99.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(517L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("É possível a exigência de depósito ou arrolamento prévios de dinheiro ou bens para admissibilidade de recurso administrativo.");
            question.setComentario("Errado\n É inconstitucional a exigência de depósito ou arrolamento prévios de dinheiro ou bens para admissibilidade de recurso administrativo, Súmula vinculante nº 21.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(518L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("É cabível remoção a pedido, para outra localidade, independentemente do interesse da Administração, em virtude de processo seletivo promovido, na hipótese em que o número de interessados for inferior ao número de vagas, em conformidade com normas estabelecidas pelo Poder Público em que aqueles estejam designados.");
            question.setComentario("Errado\n A remoção é o deslocamento do servidor, a pedido ou de ofício, no âmbito do mesmo quadro, com ou sem mudança de sede. A remoção a pedido, para outra localidade, independentemente do interesse da Administração ocorre, dentre outras hipóteses, em virtude de processo seletivo promovido, na hipótese em que o número de interessados for superior ao número de vagas, de acordo com normas preestabelecidas pelo órgão ou entidade em que aqueles estejam lotados, Lei nº 8112/90, art. 36, parágrafo único, inciso III, alínea c.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(519L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Antonio, analista judiciário de um Tribunal Regional do Trabalho, tendo preenchido as condições legais, receberá auxílio- moradia. Entretanto, dentre esses requisitos, deve saber que a referida vantagem no caso de falecimento, exoneração ou aquisição de imóvel, esse servidor público perderá, de imediato, o auxílio-moradia, mas receberá indenização equivalente a dois meses.");
            question.setComentario("Errado\n O auxílio-moradia consiste no ressarcimento das despesas comprovadamente realizadas pelo servidor com aluguel de moradia ou com meio de hospedagem administrado por empresa hoteleira, no prazo de um mês após a comprovação da despesa pelo servidor. No caso de falecimento, exoneração, colocação de imóvel funcional à disposição do servidor ou aquisição de imóvel, o auxílio-moradia continuará sendo pago por um mês, Lei nº 8112/90, art. 60-E.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(520L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Antonio, analista judiciário de um Tribunal Regional do Trabalho, tendo preenchido as condições legais, receberá auxílio- moradia. Entretanto, dentre esses requisitos, deve saber que a referida vantagem tem valor limitado a trinta por cento do valor do cargo em comissão ocupado pelo servidor e, em qualquer hipótese, não poderá ser superior ao auxílio-moradia recebido pelo respectivo Presidente do Tribunal.");
            question.setComentario("Errado\n O valor mensal do auxílio-moradia é limitado a 25% (vinte e cinco por cento) do valor do cargo em comissão ocupado pelo servidor e, em qualquer hipótese, não poderá ser superior ao auxíliomoradia recebido por Ministro de Estado, Lei nº 8112/90, art. 60-D.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(521L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Antonio, analista judiciário de um Tribunal Regional do Trabalho, tendo preenchido as condições legais, receberá auxílio- moradia. Entretanto, dentre esses requisitos, deve saber que a referida vantagem não será concedida por prazo superior a oito anos dentro de cada período de doze anos, ainda que o servidor mude de cargo ou de Município de exercício do cargo.");
            question.setComentario("Correto\n O auxílio-moradia não será concedido por prazo superior a 8 (oito) anos dentro de cada período de 12 (doze) anos, Lei nº 8112/90, art. 60-C.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(522L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Antonio, analista judiciário de um Tribunal Regional do Trabalho, tendo preenchido as condições legais, receberá auxílio- moradia. Entretanto, dentre esses requisitos, deve saber que a referida vantagem será concedida por prazo de até três anos quando exercer cargo em comissão do Grupo-Direção e Assessoramento Superiores - DAS, níveis 3, 4 e 5, de Natureza Especial, vedada qualquer prorrogação.");
            question.setComentario("Errado\n O auxílio-moradia será concedido ao servidor que tenha se mudado do local de residência para ocupar cargo em comissão ou função de confiança do Grupo-Direção e Assessoramento Superiores - DAS, níveis 4, 5 e 6, de Natureza Especial, de Ministro de Estado ou equivalentes, Lei nº 8112/90, art. 60-B, inciso V.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(523L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Antonio, analista judiciário de um Tribunal Regional do Trabalho, tendo preenchido as condições legais, receberá auxílio- moradia. Entretanto, dentre esses requisitos, deve saber que a referida vantagem tem valor limitado a vinte e cinco por cento da retribuição do cargo ocupado pelo mencionado servidor, mas em hipótese especial e temporária pode ser superior ao auxíliomoradia recebido pela Presidência do Tribunal.");
            question.setComentario("Errado\n O valor mensal do auxílio-moradia é limitado a 25% (vinte e cinco por cento) do valor do cargo em comissão, função comissionada ou cargo de Ministro de Estado ocupado. O valor do auxílio-moradia não poderá superar 25% (vinte e cinco por cento) da remuneração de Ministro de Estado. Lei nº 8112/90, art. 60-D, § 1º.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(524L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Alcebíades, servidor do Tribunal Regional do Trabalho, 4ª Região, vem acumulando, ilegalmente, seu cargo de analista judiciário com emprego em sociedade de economia mista federal, enquanto Ana Maria, também analista judiciário, vem exercendo atividades incompatíveis com o exercício do cargo e com o respectivo horário de trabalho. Nesses casos, esses servidores públicos estarão sujeitos, respectivamente, às penas de exoneração de ofício do cargo ou emprego e de demissão.");
            question.setComentario("Errado\n Exoneração não é penalidade. Nesses casos, esses servidores públicos estarão sujeitos, respectivamente, às penas de demissão e suspensão, podendo esta ser convertida em multa. A Lei nº 8112/90 em seu art. 117, inciso XVIII dispõe que é proibido ao servidor exercer quaisquer atividades que sejam incompatíveis com o exercício do cargo ou função e com o horário de trabalho. Já o art. 130, § 2º da referida Lei afirma que quando houver conveniência para o serviço, a penalidade de suspensão poderá ser convertida em multa, na base de 50% (cinqüenta por cento) por dia de vencimento ou remuneração, ficando o servidor obrigado a permanecer em serviço.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(525L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Para os fins da Lei nº 8.112/90, o servidor público federal investido em cargo em comissão de órgão ou entidade diversa da de sua lotação, receberá a remuneração do órgão cedente, quando a cessão for exclusivamente, para órgão ou entidade do Distrito Federal.");
            question.setComentario("Errado\n O servidor poderá ser cedido para ter exercício em outro órgão ou entidade dos Poderes da União, dos Estados, ou do Distrito Federal e dos Municípios, nas seguintes hipóteses: para exercício de cargo em comissão ou função de confiança e em casos previstos em leis específicas. Na hipótese do cargo em comissão ou função de confiança, sendo a cessão para órgãos ou entidades dos Estados, do Distrito Federal ou dos Municípios, o ônus da remuneração será do órgão ou entidade cessionária, mantido o ônus para o cedente nos demais casos. Lei nº 8112/90, art. 93, inciso I, § 1º.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(526L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("É vedado o exercício de atividade remunerada durante o período da licença por motivo de doença em pessoa da família.");
            question.setComentario("Correto\n Conceder-se-á ao servidor licença, dentre outras, por motivo de doença em pessoa da família. Durante o período do gozo da referida licença, fica vedado o exercício de atividade remunerada, Lei nº 8112/90, art. 81, inciso I, § 1º.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(527L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A licença para atividade política exige que o servidor candidato a cargo eletivo na localidade onde desempenha suas funções e que exerça cargo de direção, chefia, assessoramento, arrecadação ou fiscalização, dele seja afastado, a partir do quinto dia seguinte ao do registro de sua candidatura perante a Justiça Eleitoral, até o quinto dia seguinte ao do pleito.");
            question.setComentario("Errado\n O servidor candidato a cargo eletivo na localidade onde desempenha suas funções e que exerça cargo de direção,chefia, assessoramento, arrecadação ou fiscalização, dele será afastado, a partir do dia imediato ao do registro de sua candidatura perante a Justiça Eleitoral, até o décimo dia seguinte ao do pleito, Lei nº 8112/90, art. 86, § 1º.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(528L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Para os fins da licença para capacitação, após cada quinquênio de efetivo exercício, o servidor poderá, no interesse da Administração, afastar-se do exercício do cargo efetivo, com a respectiva remuneração, por até três meses, para participar de curso de capacitação profissional.");
            question.setComentario("Correto\n A Lei nº 8112/90, em seu art. 87 dispõe que após cada qüinqüênio de efetivo exercício, o servidor poderá, no interesse da Administração, afastar-se do exercício do cargo efetivo, com a respectiva remuneração, por até três meses, para participar de curso de capacitação profissional.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(529L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Sobre as férias dos servidores públicos civis federais, prevista na Lei n° 8.112/1990, é correto afirmar que o servidor fará jus a trinta dias de férias, que não podem, em qualquer hipótese, ser acumuladas com outro período.");
            question.setComentario("Errado\n O servidor fará jus a trinta dias de férias, que podem ser acumuladas, até o máximo de dois períodos, no caso de necessidade do serviço, ressalvadas as hipóteses em que haja legislação específica, Lei nº 8112/90, art. 77, caput.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(530L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Sobre as férias dos servidores públicos civis federais, prevista na Lei n° 8.112/1990, é correto afirmar que as férias poderão ser parceladas em até três etapas, desde que assim requeridas pelo servidor, e no interesse da Administração Pública.");
            question.setComentario("Correto\n O servidor fará jus a trinta dias de férias, que podem ser acumuladas, até o máximo de dois períodos, no caso de necessidade do serviço, ressalvadas as hipóteses em que haja legislação específica, Lei nº 8112/90, art. 77, caput.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(531L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Sobre as férias dos servidores públicos civis federais, prevista na Lei n° 8.112/1990, é correto afirmar que o pagamento da remuneração das férias será efetuado até um dia antes do início do respectivo período, observando-se os demais preceitos estabelecidos em lei.");
            question.setComentario("Errado\n O pagamento da remuneração das férias será efetuado até 2 (dois) dias antes do início do respectivo período, Lei nº 8112/90, art. 78, caput.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(532L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Sobre as férias dos servidores públicos civis federais, prevista na Lei n° 8.112/1990, é correto afirmar que é facultado ao servidor público levar à conta de férias qualquer falta ao serviço.");
            question.setComentario("Errado\n É vedado levar à conta de férias qualquer falta ao serviço, ou seja, não é possível faltar dois dias e depois tirar somente 28 dias de férias, para compensar as faltas, Lei nº 8112/90, art. 77, § 3º.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(533L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Sobre as férias dos servidores públicos civis federais, prevista na Lei n° 8.112/1990, é correto afirmar que a indenização relativa ao período de férias do servidor exonerado será calculada com base na remuneração do mês posterior àquele em que for publicado o ato exoneratório.");
            question.setComentario("Errado\n O servidor exonerado do cargo efetivo, ou em comissão, perceberá indenização relativa ao período das férias a que tiver direito e ao incompleto, na proporção de um doze avos por mês de efetivo exercício, ou fração superior a quatorze dias. A indenização será calculada com base na remuneração do mês em que for publicado o ato exoneratório, Lei nº 8112/90, art. 78, §§ 3º e 4º.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(534L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Ao servidor público é permitido atuar, como procurador ou intermediário, junto a repartições públicas, para tratar de benefícios previdenciários ou assistenciais de cônjuge ou companheiro.");
            question.setComentario("Correto\n Advocacia administrativa é o patrocínio de interesse privado perante a Administração Pública, valendo-se da qualidade de funcionário, essa ação é tipificada como crime no art. 321, CP. É, por outras palavras, o uso do cargo para intermediar vantagens para outrem perante a Administração. Contudo, ficou ressalvada a possibilidade de atuação, como procurador ou intermediário, quando se tratar de benefícios previdenciários ou assistenciais de parentes até o segundo grau,e de cônjuge ou companheiro.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(535L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("O servidor que acumular licitamente dois cargos efetivos, quando investido em cargo de provimento em comissão, ficará afastado de ambos os cargos efetivos, ainda que houver compatibilidade de horário e local com o exercício de um deles.");
            question.setComentario("Errado\n O servidor vinculado ao regime desta Lei, que acumular licitamente dois cargos efetivos, quando investido em cargo de provimento em comissão, ficará afastado de ambos os cargos efetivos, salvo na hipótese em que houver compatibilidade de horário e local com o exercício de um deles, declarada pelas autoridades máximas dos órgãos ou entidades envolvidos, Lei nº 8112/90, art. 120.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(536L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("A penalidade administrativa de suspensão será aplicada em caso de reincidência das faltas punidas com advertência e de violação das demais proibições que não tipifiquem infração sujeita a penalidade de demissão, não podendo exceder sessenta dias.");
            question.setComentario("Errado\n A suspensão será aplicada em caso de reincidência das faltas punidas com advertência e de violação das demais proibições que não tipifiquem infração sujeita a penalidade de demissão, não podendo exceder de 90 (noventa) dias, Lei nº 8112/90, art. 130, caput.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(537L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("NÃO é considerado preceito para o deslocamento de cargo de provimento efetivo, ocupado ou vago, no âmbito do quadro geral de pessoal, para outro órgão ou entidade do mesmo Poder, o interesse do servidor público e a diferença de vencimentos.");
            question.setComentario("Correto\n Redistribuição é o deslocamento de cargo de provimento efetivo, ocupado ou vago no âmbito do quadro geral de pessoal, para outro órgão ou entidade do mesmo Poder, com prévia apreciação do órgão central do SIPEC, observados os seguintes preceitos: interesse da administração, equivalência de vencimentos, manutenção da essência das atribuições do cargo, vinculação entre os graus de responsabilidade e complexidade das atividades, mesmo nível de escolaridade, especialidade ou habilitação profissional, compatibilidade entre as atribuições do cargo e as finalidades institucionais do órgão ou entidade, Lei nº 8112/90, art. 37.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(538L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Paulo, ao exercer o direito de petição deve saber que, o prazo da prescrição será sempre contado da data do fato ou do ato impugnado, independentemente de publicação, por ser de ordem pública.");
            question.setComentario("Errado\n O prazo de prescrição será contado da data da publicação do ato impugnado ou da data da ciência pelo interessado, quando o ato não for publicado, Lei nº 8112/90, art. 110, parágrafo único.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(539L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Paulo, ao exercer o direito de petição deve saber que, para o exercício desse direito é assegurada vista do processo em qualquer local, desde que ao servidor pessoalmente.");
            question.setComentario("Errado\n Para o exercício do direito de petição, é assegurada vista do processo ou documento, na repartição, ao servidor ou a procurador por ele constituído, Lei nº 8112/90, art. 113.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(540L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Paulo, ao exercer o direito de petição deve saber que, o pedido de reconsideração e o recurso, em qualquer situação, por terem efeito suspensivo não interrompem a prescrição.");
            question.setComentario("Errado\n O pedido de reconsideração e o recurso, quando cabíveis, interrompem a prescrição, Lei nº 8112/90, art. 111.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(541L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Paulo, ao exercer o direito de petição deve saber que, o recurso, salvo a revisão, será cabível nas hipóteses de indeferimento ou deferimento do pedido de reconsideração.");
            question.setComentario("Errado\n Caberá recurso do indeferimento do pedido de reconsideração e das decisões sobre os recursos sucessivamente interpostos, Lei nº 8112/90, art. 107, incisos I e II.");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(542L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Paulo, ao exercer o direito de petição deve saber que, caberá recurso das decisões sobre os recursos sucessivamente interpostos.");
            question.setComentario("Correto\n Caberá recurso do indeferimento do pedido de reconsideração e das decisões sobre os recursos sucessivamente interpostos, Lei nº 8112/90, art. 107, incisos I e II.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(543L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("Dentre outras proibições previstas ao servidor público federal, consta a de atuar, como procurador, junto a repartições públicas, salvo quando se tratar de benefícios assistenciais de parentes até segundo grau.");
            question.setComentario("Correto\n Ao servidor é proibido atuar, como procurador ou intermediário, junto a repartições públicas, salvo quando se tratar de benefícios previdenciários ou assistenciais de parentes até o segundo grau, e de cônjuge ou companheiro, Lei nº 8112/90, art. 117, inciso XI.");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(544L);
            question.setTema("Direito Administrativo");
            question.setEnunciado("No que diz respeito ao vencimento e à remuneração, é certo que, o desconto incidente sobre remuneração ou provento restringir-se-á aos casosde imposição legal de natureza administrativa.");
            question.setComentario("Errado\n Salvo por imposição legal, ou mandado judicial, nenhum desconto incidirá sobre a remuneração ou provento, Lei nº 8112/90, art. 45, caput.");
            question.setGabarito(R.id.e);
            lquestion.add(question);
        }
        return lquestion;
    }
}
