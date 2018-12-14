package com.preparaxcursos.direitocomentado.ListViews;

import com.preparaxcursos.direitocomentado.Models.Question;
import com.preparaxcursos.direitocomentado.R;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Moises on 04/04/17.
 */

public class LPPenal {

    private static List<Question> lquestion = new ArrayList<>();

    public static List<Question> getLquestion() {
        if (lquestion.isEmpty()) {
            Question question = new Question();
            question.setId(1L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("O direito processual\n" +
                    "brasileiro adota o sistema do isolamento dos atos processuais,\n" +
                    "de maneira que, se uma lei processual penal passa a vigorar\n" +
                    "estando o processo em curso, ela será imediatamente aplicada,\n" +
                    "sem prejuízo dos atos já realizados sob a vigência da lei anterior.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.e);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("A lei penal e a lei processual\n" +
                    "penal observam o princípio da territorialidade absoluta em razão\n" +
                    "de a prestação jurisdicional ser uma função soberana do Estado,\n" +
                    "que só pode ser exercida nos limites do território nacional.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Será constitucional e,\n" +
                    "portanto, não violará o princípio da publicidade dispositivo de\n" +
                    "regimento interno do tribunal que preveja sessão secreta para o\n" +
                    "julgamento de autoridade com foro de prerrogativa de função.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("A garantia do juiz natural e a\n" +
                    "vedação constitucional dos tribunais de exceção afastam do\n" +
                    "ordenamento jurídico brasileiro o instituto do foro especial ou\n" +
                    "privilegiado.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("A lei processual penal não se submete ao\n" +
                    "princípio da retroatividade in mellius, devendo ter incidência\n" +
                    "imediata sobre todos os processos em andamento,\n" +
                    "independentemente de o crime haver sido cometido antes ou\n" +
                    "depois de sua vigência ou de a inovação ser benéfica ou\n" +
                    "prejudicial.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("O princípio da\n" +
                    "indisponibilidade foi mitigado com o advento dos juizados\n" +
                    "especiais criminais, diante da possibilidade de se efetuar\n" +
                    "transação em matéria penal.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("O princípio da\n" +
                    "legalidade veda o uso da analogia “in malam partem” e a criação\n" +
                    "de crimes e penas pelos costumes.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Não fere o direito ao\n" +
                    "contraditório o fato de uma só das partes ser informada acerca\n" +
                    "de novo documento juntado aos autos.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("A legislação brasileira\n" +
                    "alberga o princípio da verdade real de forma relativa, tanto que\n" +
                    "não é permitida a rescisão de uma absolvição já transitada em\n" +
                    "julgado quando surjam provas concludentes contra o agente.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Buscando\n" +
                    "concretizar os preceitos previstos na Convenção Americana de\n" +
                    "Direitos Humanos, a Emenda Constitucional nº 45/2004\n" +
                    "introduziu na CF uma nova modalidade de recurso inominado,\n" +
                    "de modo a conferir eficácia ao duplo grau de jurisdição.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Não viola as\n" +
                    "garantias do juiz natural, da ampla defesa e do devido processo\n" +
                    "legal a atração por continência ou conexão do processo do\n" +
                    "corréu ao foro por prerrogativa de função de um dos\n" +
                    "denunciados.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("A lei processual penal admite\n" +
                    "interpretação extensiva e o suplemento dos princípios gerais de\n" +
                    "direito, por expressa disposição legal.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("A lei processual penal tem\n" +
                    "aplicação imediata, devendo os atos praticados sob a vigência de\n" +
                    "lei anterior revogada ser renovados e praticados sob a égide da\n" +
                    "nova lei, sob pena de nulidade absoluta.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("A lei processual penal não\n" +
                    "admite aplicação analógica, em obediência ao princípio da\n" +
                    "legalidade estrita ou tipicidade expressa.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("O juiz não pode vetar o\n" +
                    "direito de vista do processo fora da secretaria, mesmo em caso\n" +
                    "de diversidade de réus e necessidade de juntada freqüente de\n" +
                    "documentos de interesse de todas as partes, sob pena de\n" +
                    "violação do princípio da ampla defesa, segundo o STJ.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("O acusado tem direito ao\n" +
                    "contraditório e à plenitude de defesa, sendo que esta última se\n" +
                    "restringe ao direito à defesa técnica.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("O comportamento do réu\n" +
                    "durante o processo, na tentativa de defender-se, presta-se a\n" +
                    "agravar-lhe a pena, pois a CF não consagra o princípio do “nemo\n" +
                    "tenetur se detegere”.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Ocorrendo a hipótese de “novatio legis in\n" +
                    "mellius” em relação a determinado crime praticado por uma\n" +
                    "pessoa definitivamente condenado pelo fato, caberá ao juízo da\n" +
                    "execução, e não ao juízo da condenação, a aplicação da lei mais\n" +
                    "benigna.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("A lei processual penal não se submete ao\n" +
                    "princípio da retroatividade “in mellius”, devendo ter incidência\n" +
                    "imediata sobre todos os processos em andamento,\n" +
                    "independentemente de o crime haver sido cometido antes ou\n" +
                    "depois de sua vigência ou de a inovação ser mais benéfica ou\n" +
                    "prejudicial.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("O princípio da “par\n" +
                    "conditio” significa que o juiz forma sua convicção pela livre\n" +
                    "apreciação da prova produzida em contraditório judicial, sendolhe\n" +
                    "vedado fundamentar sua decisão exclusivamente nos\n" +
                    "elementos informativos colhidos na investigação, ressalvadas as\n" +
                    "provas cautelares, não repetíveis e antecipadas.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Pelo princípio da\n" +
                    "iniciativa das partes, cabe à parte provocar a prestação\n" +
                    "jurisdicional, sendo vedado ao juiz agir de ofício, especialmente\n" +
                    "quanto a questões probatórias.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Impera no processo penal o\n" +
                    "princípio da verdade real e não da verdade formal, próprio do\n" +
                    "processo civil, em que, se o réu não se defender, presumem-se\n" +
                    "verdadeiros os fatos alegados pelo autor.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Pelo princípio da\n" +
                    "iniciativa das partes, cabe à parte provocar a prestação\n" +
                    "jurisdicional, sendo vedado ao juiz agir de ofício, especialmente\n" +
                    "quanto a questões probatórias.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("No processo penal,\n" +
                    "vige o sistema da íntima convicção do magistrado, exceto nas\n" +
                    "decisões dos jurados no tribunal do júri, que é regido pelo\n" +
                    "sistema da livre convicção.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("No direito processual\n" +
                    "penal, não vigora o princípio da identidade física do juiz, previsto\n" +
                    "na lei processual civil.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Os princípios\n" +
                    "constitucionais aplicáveis ao processo penal incluem a\n" +
                    "publicidade, a verdade real, a identidade física do juiz, o favor rei\n" +
                    "e a indisponibilidade.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("O acusado tem direito ao\n" +
                    "contraditório e à plenitude de defesa, sendo que esta última se\n" +
                    "restringe ao direito à defesa técnica.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("O comportamento do réu durante o\n" +
                    "processo, na tentativa de defender-se, presta-se a agravar-lhe a\n" +
                    "pena, pois a CF não consagra o princípio “Nemo tenetur se\n" +
                    "detegere”.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Com a aplicação imediata da\n" +
                    "lei processual penal, os atos realizados sob a vigência da lei\n" +
                    "anterior perdem sua validade.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("A lei processual penal não\n" +
                    "admite interpretação extensiva.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Acerca do princípio da\n" +
                    "inocência, o réu tem o dever de provar sua inocência e cabe ao\n" +
                    "acusador apresentar indícios de autoria e materialidade.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Os atos processuais\n" +
                    "realizados sob a vigência de lei processual anterior são\n" +
                    "considerados válidos, mesmo após a revogação da lei.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("As normas processuais têm\n" +
                    "aplicação imediata, ainda que o fato que deu origem ao processo\n" +
                    "seja anterior à entrada em vigor dessas normas.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("O dispositivo constitucional\n" +
                    "que estabelece que a lei não retroagirá, salvo para beneficiar o\n" +
                    "réu, aplica-se à lei penal e à lei processual penal.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Lei penal que substitua outra\n" +
                    "e que favoreça o agente aplica-se aos fatos anteriores à sua\n" +
                    "entrada em vigor, ainda que decididos por sentença\n" +
                    "condenatória transitada em julgado.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("A adoção do princípio do “non\n" +
                    "bis in idem” pelo ordenamento jurídico penal complementa os\n" +
                    "direitos e garantias individuais previstos na Constituição, cuja\n" +
                    "interpretação sistemática leva à conclusão de que o direito à\n" +
                    "liberdade, com base em coisa julgada material, prevalece sobre o\n" +
                    "dever estatal de acusar.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Aos crimes militares não se\n" +
                    "aplica o princípio da insignificância.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("O direito de audiência, de um\n" +
                    "lado, e o direito de presença do réu, de outro, traduzem\n" +
                    "prerrogativas jurídicas essenciais que derivam da garantia\n" +
                    "constitucional do “due processo of law”.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("O estatuto constitucional do\n" +
                    "direito de defesa é um complexo de princípios e de normas que\n" +
                    "amparam os acusados em sede de persecução criminal, exceto\n" +
                    "os réus processados por suposta prática de crimes hediondos ou\n" +
                    "de delitos a estes equiparados.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("A fundamentação das\n" +
                    "decisões do Poder Judiciário, tal como resulta da Constituição\n" +
                    "Federal, é condição absoluta de sua validade e, portanto,\n" +
                    "pressuposto da sua eficácia, substanciando-se na definição\n" +
                    "suficiente dos fatos e do direito que a sustentam, de modo a\n" +
                    "certificar a realização da hipótese de incidência da norma e os\n" +
                    "efeitos dela resultantes.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Em homenagem\n" +
                    "ao princípio da presunção de inocência, constitucionalmente\n" +
                    "previsto, para que ocorra regressão, isto é, passagem de regime\n" +
                    "menos severo ao mais rigoroso, fundada na prática de novo crime, exige a Lei de Execuções Penais a condenação com\n" +
                    "trânsito em julgado.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("O comportamento adotado\n" +
                    "pelo réu durante o processo, na tentativa de defender-se, não se\n" +
                    "presta a agravar-lhe a pena.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("O silêncio do acusado,\n" +
                    "durante o processo, não pode ser interpretado em seu desfavor.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Não pode o indiciado ou\n" +
                    "acusado ser compelido a fornecer padrões gráficos de próprio\n" +
                    "punho para exames periciais.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Não há\n" +
                    "contraditório no inquérito policial, procedimento eminentemente\n" +
                    "inquisitório, de forma que o defensor, ainda que no interesse do\n" +
                    "representado, não tem direito a acesso amplo aos elementos de\n" +
                    "prova já documentados nos autos e que digam respeito ao direito\n" +
                    "de defesa; poderá ele, sobre tais documentos, exercer o\n" +
                    "contraditório diferido.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("No processo acusatório, a acusação\n" +
                    "encontra-se em posição hierarquicamente superior à defesa, e o\n" +
                    "juiz pode dar início ao processo por sua própria vontade.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("A CF assegura o\n" +
                    "sistema inquisitivo misto no processo penal.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Segundo o STJ, a\n" +
                    "recusa da autoridade policial em cumprir requisição judicial\n" +
                    "relativa a cumprimento de diligências configura o crime de\n" +
                    "desobediência.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Embora o inquérito policial tenha natureza\n" +
                    "de procedimento informativo, e não de ato de jurisdição, os\n" +
                    "vícios nele existentes podem contaminar a ação penal\n" +
                    "subseqüente, com base na teoria norte-americana dos frutos da\n" +
                    "árvore envenenada, ou “fruits of the poisonouss tree”.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("O arquivamento do inquérito policial não\n" +
                    "gera preclusão, sendo uma decisão tomada “rebus sic\n" +
                    "stantibus”; todavia, uma vez arquivado o inquérito a pedido do\n" +
                    "promotor de justiça, somente com novas provas pode ser\n" +
                    "iniciada a ação penal.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("O IP é um procedimento\n" +
                    "sigiloso, não se estendendo o sigilo ao advogado, que poderá ter\n" +
                    "amplo acesso aos elementos de prova que já estiverem\n" +
                    "documentados nos autos e se refiram ao exercício do direito de\n" +
                    "defesa.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("De acordo com a Lei de\n" +
                    "Falências, cabe ao juiz responsável pelo processo falimentar\n" +
                    "presidir o inquérito de apuração dos crimes falimentares e, após\n" +
                    "a conclusão, remetê-lo ao MP para, se for o caso, este oferecer a\n" +
                    "denúncia.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("A oitiva do indiciado durante\n" +
                    "o IP deve observar o mesmo procedimento do interrogatório\n" +
                    "judicial, sendo-lhe assegurado o direito ao silêncio e a\n" +
                    "assistência de advogado, que poderá fazer perguntas durante a\n" +
                    "inquirição e acompanhar a oitiva das testemunhas.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("A prova pericial, apesar de\n" +
                    "colhida durante o IP, é prova técnica e se submete ao\n" +
                    "contraditório diferido, razão pela qual tem valor probatório\n" +
                    "absoluto e não pode ser desconsiderada pelo juiz no momento da\n" +
                    "sentença.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Caso as informações obtidas\n" +
                    "por outros meios sejam suficientes para sustentar a inicial\n" +
                    "acusatória, o inquérito policial torna-se dispensável.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Nas hipóteses de ação penal\n" +
                    "pública, condicionada ou incondicionada, a autoridade policial\n" +
                    "deverá instaurar, de ofício, o inquérito, sem que seja necessária\n" +
                    "a provocação ou a representação.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Não obstante o\n" +
                    "princípio da indisponibilidade do processo, que vigora até\n" +
                    "mesmo na fase do inquérito policial, uma vez ajuizada a ação\n" +
                    "penal pública incondicionada, o MP tem livre arbítrio para dela\n" +
                    "desistir.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("A outorga constitucional\n" +
                    "de funções de polícia judiciária à instituição policial não impede\n" +
                    "nem exclui a possibilidade de o Ministério Público, que é o\n" +
                    "“dominus litis”, determinar a abertura de inquéritos policiais,\n" +
                    "requisitar esclarecimentos e diligências investigatórias, estar\n" +
                    "presente e acompanhar, junto a órgãos e agentes policiais,\n" +
                    "quaisquer atos de investigação penal, mesmo aqueles sob regime\n" +
                    "de sigilo, sem prejuízo de outras medidas que lhe pareçam\n" +
                    "indispensáveis à formação da sua “opinio delicti”.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Se um indivíduo, ao se desentender com\n" +
                    "sua esposa, desferir contra ela inúmeros golpes, agredindo-a\n" +
                    "fisicamente, causando lesões graves, as autoridades policiais,\n" +
                    "considerando tratar-se de flagrante delito, poderão penetrar na\n" +
                    "casa desse indivíduo, ainda que à noite e sem determinação\n" +
                    "judicial, e prendê-lo.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Com relação ao inquérito\n" +
                    "policial, é presidido pela autoridade policial, da chamada polícia\n" +
                    "judiciária, pois atua em face do fato criminoso já ocorrido.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Impede-se desarquivamento\n" +
                    "do inquérito policial com vistas a prosseguir as investigações nas\n" +
                    "hipóteses de decisões judiciais, reconhecendo a atipicidade do\n" +
                    "fato ou a presença de alguma excludente de ilicitude.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("O término do inquérito\n" +
                    "policial é caracterizado pela elaboração de um relatório e por sua\n" +
                    "juntada pela autoridade policial responsável, que não pode,\n" +
                    "nesse relatório, indicar testemunhas que não tiverem sido\n" +
                    "inquiridas.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("No inquérito policial, o\n" +
                    "ofendido, ou seu representante legal, e o indiciado poderão\n" +
                    "requerer qualquer diligência, que será realizada, ou não, a juízo\n" +
                    "da autoridade.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("O inquérito policial tem\n" +
                    "natureza judicial, visto que é um procedimento inquisitório\n" +
                    "conduzido pela polícia judiciária, com a finalidade de reunir\n" +
                    "elementos e informações necessárias à elucidação do crime.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Depois de ordenado o\n" +
                    "arquivamento do inquérito pela autoridade judiciária, por falta\n" +
                    "de base para a denúncia, a autoridade policial não poderá\n" +
                    "proceder a novas pesquisas se de outras provas tiver notícia,\n" +
                    "salvo com expressa autorização judicial.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("A polícia judiciária tem\n" +
                    "total autonomia em relação ao MP.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            //67
            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("O caráter sigiloso do\n" +
                    "inquérito policial pode ser estendido até mesmo ao MP e ao\n" +
                    "Poder Judiciário.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("A decisão judicial não\n" +
                    "se pode fundamentar, no inquérito policial, mesmo que não\n" +
                    "exclusivamente.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("O inquérito policial\n" +
                    "não é indispensável.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("A autoridade policial\n" +
                    "não pode indeferir um pedido de realização de prova feito pelo\n" +
                    "indiciado ou ofendido.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Não há\n" +
                    "contraditório no inquérito policial, procedimento eminentemente\n" +
                    "inquisitório, de forma que o defensor, ainda que no interesse do\n" +
                    "representado, não tem direito a acesso amplo aos elementos de\n" +
                    "prova já documentados nos autos e que digam respeito ao direito\n" +
                    "de defesa; poderá ele, sobre tais documentos, exercer o\n" +
                    "contraditório diferido.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Acerca do tráfico\n" +
                    "ilícito de substâncias entorpecentes, a infiltração de agentes de\n" +
                    "polícia em tarefas de investigação pode ser realizada em\n" +
                    "qualquer fase da persecução criminal, dependendo, no entanto,\n" +
                    "de autorização judicial e oitiva do MP.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Acerca do tráfico\n" +
                    "ilícito de substâncias entorpecentes, não há, na legislação\n" +
                    "específica, disposição expressa a respeito da pena de multa,\n" +
                    "devendo o juiz aplicar, subsidiariamente, os dispositivos do CPP\n" +
                    "acerca do tema.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("A outorga\n" +
                    "constitucional de funções de polícia judiciária à instituição\n" +
                    "policial não impede nem exclui a possibilidade de o Ministério\n" +
                    "Público, que é o “dominus litis”, determinar a abertura de\n" +
                    "inquéritos policiais, requisitar esclarecimentos e diligências investigatórias, estar presente e acompanhar, junto a órgãos e\n" +
                    "agentes policiais, quaisquer atos de investigação penal, mesmo\n" +
                    "aqueles sob regime de sigilo, sem prejuízo de outras medidas\n" +
                    "que lhe pareçam indispensáveis à formação da sua “opinio\n" +
                    "delicti”.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Não há crime quando\n" +
                    "a preparação do flagrante pela polícia torna impossível a sua\n" +
                    "consumação.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Não se admite a\n" +
                    "acareação entre o acusado e a pessoa ofendida, considerando-se\n" +
                    "que o acusado tem o direito constitucional ao silêncio, e o\n" +
                    "ofendido não será compromissado.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Por inviabilizar a responsabilização criminal, não se admite a\n" +
                    "“notitia criminis” anônima.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Um marido traído assassinou sua\n" +
                    "esposa. Encerrado o inquérito policial para a apuração do fato,\n" +
                    "os autos foram encaminhados ao Ministério Público, e o\n" +
                    "promotor de justiça responsável requereu o arquivamento do\n" +
                    "procedimento por entender que o indiciado agiu em legítima\n" +
                    "defesa. Nessa situação, caso o juiz discorde da opinião do titular\n" +
                    "da ação penal, deve receber a denúncia de ofício e dar\n" +
                    "seguimento à ação penal.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Tendo o titular da ação penal outros\n" +
                    "elementos, em mãos, necessários ao oferecimento da denúncia\n" +
                    "ou queixa, o inquérito é perfeitamente dispensável.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Segundo o Código de Processo Penal\n" +
                    "(CPP), o inquérito policial deve terminar no prazo de 10 dias, se o\n" +
                    "indiciado estiver preso, e em 30 dias, acaso esteja solto.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Mesmo em face do\n" +
                    "princípio da obrigatoriedade, vigente no ordenamento processual\n" +
                    "penal, a autoridade policial não tem o dever de instaurar\n" +
                    "inquérito policial quando é informada da ocorrência de crime\n" +
                    "que se apure mediante ação penal pública.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("A incomunicabilidade do preso é vedada\n" +
                    "na vigência de estado de defesa.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("A inviolabilidade do domicílio não\n" +
                    "obsta a entrada da autoridade policial, durante a noite, em caso\n" +
                    "de flagrante delito.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("O MP, caso entenda serem\n" +
                    "necessárias novas diligências, por considerá-las imprescindíveis\n" +
                    "ao oferecimento da denúncia, poderá requerer a devolução do\n" +
                    "inquérito à autoridade policial.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("A autoridade policial, caso\n" +
                    "entenda não estarem presentes indícios de autoria de\n" +
                    "determinado crime, poderá mandar arquivar autos de inquérito.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Quando, no curso das\n" +
                    "investigações, surgir indício da prática de infração penal por\n" +
                    "parte de membro da magistratura, após a conclusão do\n" +
                    "inquérito, a denúncia deve ser remetida ao tribunal ou órgão\n" +
                    "especial competente para o julgamento.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Como o inquérito\n" +
                    "policial é procedimento administrativo, deverá a autoridade\n" +
                    "policial garantir o contraditório e a ampla defesa, com os meios e\n" +
                    "recursos a ela inerentes, sob pena de haver nulidade na ação\n" +
                    "penal subseqüente.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Joaquim, indiciado em\n" +
                    "inquérito policial, em seu interrogatório na esfera policial, foi\n" +
                    "constrangido ilegalmente a indicar uma testemunha presencial\n" +
                    "do crime de que era acusado. A testemunha foi regularmente\n" +
                    "ouvida e em seu depoimento apontou Joaquim como autor do\n" +
                    "delito. Nessa situação, o depoimento da testemunha, apesar de\n" +
                    "lícito em si mesmo, é considerado ilícito por derivação, uma vez\n" +
                    "que foi produzido a partir de uma prova ilícita.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("A autoridade policial poderá\n" +
                    "mandar arquivar os autos de inquérito policial, se verificar que\n" +
                    "há causa de exclusão de ilicitude que acoberte a ação do\n" +
                    "indiciado.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Considerando a seguinte\n" +
                    "situação hipotética. João, penalmente responsável, foi preso em\n" +
                    "flagrante pela prática de roubo, tendo a autoridade policial\n" +
                    "relatado e encaminhado os autos de inquérito ao Poder\n" +
                    "Judiciário no prazo de 08 dias. Recebido o inquérito pelo\n" +
                    "Ministério Público, seu representante determinou a devolução à\n" +
                    "delegacia de origem, requisitando a realização de novas\n" +
                    "diligências. Nessa situação, João permanecerá preso e à\n" +
                    "disposição da justiça até a conclusão das novas diligências.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("O inquérito, procedimento\n" +
                    "persecutório de caráter administrativo instaurado pela\n" +
                    "autoridade policial, tem como destinatário imediato o Ministério\n" +
                    "Público, titular único e exclusivo da ação penal.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Se a ação penal for de iniciativa privada, o\n" +
                    "inquérito será instaurado a requerimento da vítima ou de seu\n" +
                    "representante legal.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("O juiz não pode aplicar, ainda que\n" +
                    "provisoriamente, medida de segurança no curso do inquérito\n" +
                    "policial.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("O inquérito pode ser arquivado, de ofício,\n" +
                    "pelo juiz, por membro do Ministério Público ou pelo delegado de\n" +
                    "polícia, desde que fique comprovado que o indiciado agiu\n" +
                    "acobertado por causa excludente de antijuridicidade ou da\n" +
                    "culpabilidade.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Uma vez relatado o inquérito policial, o\n" +
                    "Ministério Público não poderá requerer a devolução dos autos à\n" +
                    "autoridade policial, ainda que entenda serem necessárias novas\n" +
                    "diligências, imprescindíveis ao oferecimento da denúncia.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("O inquérito policial realizado\n" +
                    "por delegacia incompetente em razão de sua circunscrição\n" +
                    "territorial é nulo de pleno direito.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Nos crimes de ação pública, o\n" +
                    "inquérito policial será iniciado de ofício, mediante requisição da\n" +
                    "autoridade judiciária ou do Ministério Público, ou a\n" +
                    "requerimento do ofendido ou de quem tiver qualidade para\n" +
                    "representá-lo.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Considere que, visando\n" +
                    "apurar a possível existência de crime e sua autoria sobre\n" +
                    "determinado fato veiculado na imprensa local, a autoridade\n" +
                    "policial de determinada delegacia tenha instaurado inquérito\n" +
                    "policial. Ao término da apuração dos fatos, conclui-se pela\n" +
                    "inexistência de infração penal. Nessa situação, caberá à\n" +
                    "autoridade policial relatar o procedimento e proceder à remessa\n" +
                    "dos autos ao Poder Judiciário, pois lhe é vedado o arquivamento\n" +
                    "de inquérito policial.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Para verificar a\n" +
                    "possibilidade de a infração ter sido praticada de determinado\n" +
                    "modo, a autoridade policial poderá proceder à reprodução\n" +
                    "simulada dos fatos, da qual o indiciado ou suspeito não poderá\n" +
                    "se negar a participar.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Uma vez ordenado o\n" +
                    "arquivamento do inquérito policial pela autoridade judiciária,\n" +
                    "por falta de base para a denúncia, a autoridade policial não\n" +
                    "poderá proceder a novas pesquisas sem autorização judicial para\n" +
                    "tanto.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("As partes poderão, no\n" +
                    "curso do inquérito policial, opor exceção de suspeição da\n" +
                    "autoridade policial, nas mesmas situações previstas no Código\n" +
                    "de Processo Penal em relação ao juiz.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Como o inquérito policial\n" +
                    "é peça dispensável ao oferecimento da denúncia, o MP pode,\n" +
                    "mesmo sem o inquérito, oferecer denúncia, desde que entenda\n" +
                    "que há indícios mínimos de autoria e de materialidade de fatos supostamente criminosos. Todavia, uma vez instaurado o\n" +
                    "inquérito, o MP não pode oferecer a denúncia sem o relatório\n" +
                    "final da autoridade policial.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Dados obtidos em\n" +
                    "interceptação de comunicações telefônicas e em escutas\n" +
                    "ambientais judicialmente autorizadas para produção de prova\n" +
                    "em inquérito policial podem ser usados, em procedimento\n" +
                    "administrativo disciplinar, contra servidores cujos supostos\n" +
                    "ilícitos tenham despontado à colheita dessa prova.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Nos crimes de tráfico\n" +
                    "de entorpecentes, é admitida a prisão provisória, desde que\n" +
                    "verificada ser imprescindível para as investigações do inquérito\n" +
                    "policial.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("O inquérito policial,\n" +
                    "uma vez instaurado, deve ser concluído no prazo de dez dias, se\n" +
                    "o réu estiver preso, ou de trinta dias, se responder solto,\n" +
                    "podendo esse prazo ser prorrogado, em caso de necessidade,\n" +
                    "pela própria autoridade que presidir o inquérito, quando se\n" +
                    "tratar de casos de alta complexidade ou houver pluralidade de\n" +
                    "indicados.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("O inquérito policial\n" +
                    "será nulo, não havendo possibilidade de que o MP, com base nas\n" +
                    "informações nele contidas, ofereça a denúncia, se a autoridade\n" +
                    "policial tiver atuado fora dos limites da sua circunscrição.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Se o órgão do Ministério Público, em vez\n" +
                    "de apresentar a denúncia, requerer o arquivamento do inquérito\n" +
                    "policial, o juiz, no caso de considerar improcedentes as razões\n" +
                    "invocadas, fará remessa do inquérito ou peças de informação ao\n" +
                    "procurador-geral, que designará, obrigatoriamente, outro órgão\n" +
                    "do Ministério Público para oferecer a denúncia.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("A autoridade policial, em nenhuma\n" +
                    "situação, pode mandar arquivar os autos de inquérito policial.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Determinado o\n" +
                    "arquivamento do inquérito policial em face de requerimento do\n" +
                    "MP, o ofendido não será impedido de intentar ação civil “ex\n" +
                    "delicto”.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Sendo o inquérito policial um\n" +
                    "procedimento realizado pela polícia judiciária cujo destinatário é\n" +
                    "o juiz, são aplicáveis em sua elaboração e tramitação todos os\n" +
                    "princípios processuais inerentes à instrução criminal, entre os\n" +
                    "quais o contraditório e a ampla defesa.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("A autoridade policial de\n" +
                    "determinado município, por força de auto de prisão em flagrante,\n" +
                    "instaurou inquérito policial contra Joaquim, que foi indiciado pela prática de estelionato. Nessa situação, o prazo para a\n" +
                    "conclusão do inquérito policial, estando Joaquim preso, será de\n" +
                    "10 dias, contados a partir do dia em que se executou a ordem.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("O inquérito policial é\n" +
                    "procedimento administrativo público, não podendo a autoridade\n" +
                    "policial a ele conferir sigilo sem que haja prévia determinação\n" +
                    "judicial de segredo de justiça.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("O preso tem direito à\n" +
                    "identificação dos responsáveis pelo seu interrogatório policial.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Entre as providências\n" +
                    "que a autoridade policial deverá tomar logo que tiver\n" +
                    "conhecimento da prática da infração penal, encontra-se a\n" +
                    "reprodução simulada dos fatos, que somente deverá ser\n" +
                    "efetivada se não contrariar a moralidade ou a ordem pública.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Surgindo, durante o\n" +
                    "inquérito policial, dúvida fundada sobre a integridade mental do\n" +
                    "indiciado, a autoridade policial ordenará, de ofício, que este seja\n" +
                    "submetido a exame médico-legal.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("O IP deve ser\n" +
                    "concluído em cinco dias, se o réu estiver preso em flagrante, ou\n" +
                    "em quinze dias, se estiver solto, podendo, neste último caso, ser\n" +
                    "concedido novo prazo pela autoridade judicial.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Se o órgão do\n" +
                    "Ministério Público, ao invés de apresentar a denúncia, requerer\n" +
                    "o arquivamento do inquérito policial, o juiz, mesmo no caso de\n" +
                    "considerar improcedentes as razões invocadas, deverá arquivar\n" +
                    "os autos e expor fundamentadamente as razões de sua\n" +
                    "convicção.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Utilizando uma chave\n" +
                    "de fenda, Ana riscou toda a lataria do veículo de Geraldo, fato\n" +
                    "que foi presenciado por Felisberto. Nessa situação, se Felisberto\n" +
                    "levar esse fato ao conhecimento da autoridade policial\n" +
                    "competente, esta deverá imediatamente instaurar o inquérito\n" +
                    "policial.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("No curso do inquérito\n" +
                    "policial, a autoridade competente, logo que tiver conhecimento\n" +
                    "da prática da infração penal, deverá tomar uma séria de\n" +
                    "providências elencadas pelo Código de Processo Penal (CPP), as\n" +
                    "quais incluem a colheita de todas as provas que servirem para o\n" +
                    "esclarecimento do fato e suas circunstâncias. Referida\n" +
                    "autoridade não poderá, todavia, realizar acareações, já que esse\n" +
                    "tipo de prova é ato privativo do juiz, que tem como pressuposto a\n" +
                    "presença do contraditório.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Em crime de ação penal\n" +
                    "pública condicionada, a autoridade competente poderá iniciar o\n" +
                    "inquérito policial de ofício. Todavia, se, no prazo decadencial de\n" +
                    "seis meses, o ofendido ou seu representante legal não\n" +
                    "formularem a representação, o inquérito será arquivado.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("A identificação\n" +
                    "criminal de pessoas envolvidas com a ação praticada por\n" +
                    "organizações criminosas não será realizada se já houver\n" +
                    "identificação civil.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Se a autoridade\n" +
                    "policial estiver diante da realização do crime praticado por\n" +
                    "organização criminosa, pode retardar a realização da prisão, sob\n" +
                    "o fundamento de aguardar o momento oportuno para tanto,\n" +
                    "colhendo-se mais provas e informações.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Independentemente\n" +
                    "de autorização judicial, o agente policial pode ingressar, como se\n" +
                    "fosse um autêntico membro, em organizações criminosas de\n" +
                    "qualquer tipo, a fim de colher dados e provas para o combate ao\n" +
                    "crime organizado.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Sendo o crime de ação\n" +
                    "penal pública incondicionada, se o promotor de justiça com\n" +
                    "atribuições para tanto requisitar a instauração do IP, a\n" +
                    "autoridade policial pode deixar de instaurá-lo, se entender\n" +
                    "descabida a investigação, ante a presença de causa excludente\n" +
                    "de antijuridicidade.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("O IP possui a\n" +
                    "característica da indisponibilidade, que significa que, uma vez\n" +
                    "instaurado, não pode a autoridade policial, por sua própria\n" +
                    "iniciativa, promover seu arquivamento, exceto nos crimes de\n" +
                    "ação penal privada.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("No IP instaurado por\n" +
                    "requisição do ministro da Justiça, objetivando a expulsão de\n" +
                    "estrangeiro, o contraditório é obrigatório.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("É possível que o\n" +
                    "magistrado, em busca da verdade real, determine diligências em\n" +
                    "IP, mesmo na situação de crime de ação penal pública\n" +
                    "incondicionada em que membro do MP já tenha pugnado pelo\n" +
                    "arquivamento dos autos.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Não é possível que\n" +
                    "autoridade policial, de ofício, investigue e indicie pessoa com foro\n" +
                    "especial, sem a devida supervisão de magistrado naturalmente\n" +
                    "competente para julgar tal detentor de prerrogativa funcional.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("De acordo com a opinião\n" +
                    "sumulada do STJ, a participação de membro do MP na fase investigatória criminal acarreta o seu impedimento ou suspeição\n" +
                    "para o oferecimento da denúncia.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("O IP é a única\n" +
                    "forma de início da persecução penal.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Em todas as espécies\n" +
                    "de ação penal, o IP deve ser instaurado de ofício pela autoridade\n" +
                    "policial, isto é, independentemente de provocação, pois tem a\n" +
                    "característica da oficiosidade.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("A requisição do MP\n" +
                    "para instauração do IP tem a natureza de ordem, razão pela qual\n" +
                    "não pode ser descumprida pela autoridade policial, ainda que,\n" +
                    "no entender desta, seja descabida a investigação.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("A autoridade policial\n" +
                    "poderá promover o arquivamento do IP, desde que comprovado\n" +
                    "cabalmente que o indiciado agiu acobertado por uma excludente\n" +
                    "da ilicitude ou da culpabilidade.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Com relação ao inquérito\n" +
                    "policial, trata-se de procedimento escrito, inquisitivo, sigiloso,\n" +
                    "informativo e disponível.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("A interceptação telefônica\n" +
                    "poderá ser determinada pela autoridade policial, no curso da\n" +
                    "investigação, de forma motivada e observados os requisitos\n" +
                    "legais.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("A instauração de inquérito é\n" +
                    "dispensável caso a acusação possua elementos suficientes para\n" +
                    "a propositura da ação penal.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Pode-se opor suspeição às\n" +
                    "autoridades policiais nos atos do inquérito.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Do plexo de direitos dos quais\n" +
                    "é titular o indiciado, interessado primário no procedimento\n" +
                    "administrativo do IP, é corolário e instrumento a prerrogativa do\n" +
                    "advogado de acesso aos autos respectivos, explicitamente\n" +
                    "outorgada pelo Estatuto da Advocacia, da qual, porém,\n" +
                    "excluíram-se os Ips que correm em sigilo.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Não é direito fundamental do\n" +
                    "indiciado, no curso do IP, fazer-se assistir por advogado.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Todo IP é modalidade de\n" +
                    "investigação que tem seu regime jurídico traçado a partir da\n" +
                    "Constituição Federal, mecanismo que é das atividades\n" +
                    "genuinamente estatais de segurança pública.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("A decisão\n" +
                    "judicial que determinar o arquivamento do inquérito policial é, em regra, irrecorrível, embora caiba recurso de ofício no caso de\n" +
                    "crime contra a economia popular.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Segundo o\n" +
                    "Código de Processo Penal, é cabível a incomunicabilidade do\n" +
                    "indiciado, que dependerá sempre de despacho nos autos e\n" +
                    "somente será permitida quando o interesse da sociedade ou a\n" +
                    "conveniência da investigação o exigir.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

            question = new Question();
            question.setId(2L);
            question.setTema("Direito Processual Penal");
            question.setEnunciado("Durante a\n" +
                    "ocorrência de flagrante delito, é possível o ingresso da\n" +
                    "autoridade policial em residência que seja local da prática do\n" +
                    "delito, independentemente de autorização judicial.");
            question.setComentario("Comentario");
            question.setGabarito(R.id.c);
            lquestion.add(question);

           //Parei na 143
        }
        return lquestion;
    }
}