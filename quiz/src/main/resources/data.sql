INSERT INTO tb_quiz (titulo, img_url) VALUES ('Qual dos Vingadores é você?', 'https://github.com/FernandaUQ/Quiz/blob/main/images/avengers.jpg');

INSERT INTO tb_pergunta (corpo, id_quiz) VALUES ('Quem é você em uma festa de amigos?', 1);
INSERT INTO tb_pergunta (corpo, id_quiz) VALUES ('Em uma decisão difícil, com seus amigos, você:', 1);
INSERT INTO tb_pergunta (corpo, id_quiz) VALUES ('Sua maior habilidade no meio da crise:', 1);
INSERT INTO tb_pergunta (corpo, id_quiz) VALUES ('Qual dessas frases se aplica mais a você?', 1);
INSERT INTO tb_pergunta (corpo, id_quiz) VALUES ('Como você faz para que os outros realizem uma tarefa?', 1);
INSERT INTO tb_pergunta (corpo, id_quiz) VALUES ('Um colega seu está fazendo algo errado para prejudicar alguém. Você:', 1);
INSERT INTO tb_pergunta (corpo, id_quiz) VALUES ('Qual desses adjetivos as outras pessoas usariam pra te descrever melhor?', 1);
INSERT INTO tb_pergunta (corpo, id_quiz) VALUES ('Com qual personagem dos Simpsons você mais se identifica?', 1);

INSERT INTO tb_alternativa (descricao, pontuacao, id_pergunta) VALUES ('A pessoa que controla a música e agita a festa.',4 , 1);
INSERT INTO tb_alternativa (descricao, pontuacao, id_pergunta) VALUES ('Alguém entre os que estão dançando.', 2, 1);
INSERT INTO tb_alternativa (descricao, pontuacao, id_pergunta) VALUES ('Está sempre perto da mesa de comida.', 3, 1);
INSERT INTO tb_alternativa (descricao, pontuacao, id_pergunta) VALUES ('Está em casa, longe da festa.', 1, 1);

INSERT INTO tb_alternativa (descricao, pontuacao, id_pergunta) VALUES ('Faz o que é certo, acima de tudo.', 4, 2);
INSERT INTO tb_alternativa (descricao, pontuacao, id_pergunta) VALUES ('Decide em conjunto e faz o que todos acharem melhor.', 3, 2);
INSERT INTO tb_alternativa (descricao, pontuacao, id_pergunta) VALUES ('Calcula as alternativas e mostra pra todo mundo onde há menos danos.', 2, 2);
INSERT INTO tb_alternativa (descricao, pontuacao, id_pergunta) VALUES ('Espera alguém decidir e vai na onda.', 1, 2);

INSERT INTO tb_alternativa (descricao, pontuacao, id_pergunta) VALUES ('Força.', 3, 3);
INSERT INTO tb_alternativa (descricao, pontuacao, id_pergunta) VALUES ('Lealdade.', 4, 3);
INSERT INTO tb_alternativa (descricao, pontuacao, id_pergunta) VALUES ('Pensamento lógico.', 1, 3);
INSERT INTO tb_alternativa (descricao, pontuacao, id_pergunta) VALUES ('Abordagem criativa.', 2, 3);

INSERT INTO tb_alternativa (descricao, pontuacao, id_pergunta) VALUES ('"Se eu tivesse oito horas para derrubar uma árvore, passaria seis afiando meu machado" (Abraham Lincoln)', 1, 4);
INSERT INTO tb_alternativa (descricao, pontuacao, id_pergunta) VALUES ('"Mil vidas eu tivesse, mil vidas eu daria pela libertação da minha pátria" (Tiradentes)', 4, 4);
INSERT INTO tb_alternativa (descricao, pontuacao, id_pergunta) VALUES ('"Lutar pelo amor é bom, mas alcançá-lo sem luta é melhor." (William Shakespeare)', 2, 4);
INSERT INTO tb_alternativa (descricao, pontuacao, id_pergunta) VALUES ('"O verdadeiro homem mede a sua força quando se defronta com o obstáculo." (Antoine de Saint-Exupéry)', 3, 4);

INSERT INTO tb_alternativa (descricao, pontuacao, id_pergunta) VALUES ('Cria um passo a passo para a realização da tarefa.', 1, 5);
INSERT INTO tb_alternativa (descricao, pontuacao, id_pergunta) VALUES ('Explica a tarefa e apresenta os motivos pelos quais deveriam fazer.', 2, 5);
INSERT INTO tb_alternativa (descricao, pontuacao, id_pergunta) VALUES ('Dá ordem de forma bem firme e direta.', 3, 5);
INSERT INTO tb_alternativa (descricao, pontuacao, id_pergunta) VALUES ('Faz primeiro e chama a seguirem o seu exemplo.', 4, 5);

INSERT INTO tb_alternativa (descricao, pontuacao, id_pergunta) VALUES ('Monta um plano para expôr o que o colega está fazendo de errado.', 2, 6);
INSERT INTO tb_alternativa (descricao, pontuacao, id_pergunta) VALUES ('Apronta algo para que ele se dê mal.', 1, 6);
INSERT INTO tb_alternativa (descricao, pontuacao, id_pergunta) VALUES ('Conta para alguém que é autoridade sobre ele.', 4, 6);
INSERT INTO tb_alternativa (descricao, pontuacao, id_pergunta) VALUES ('Confronta ele para tirar satisfações.', 3, 6);

INSERT INTO tb_alternativa (descricao, pontuacao, id_pergunta) VALUES ('Forte.', 3, 7);
INSERT INTO tb_alternativa (descricao, pontuacao, id_pergunta) VALUES ('Inteligente.', 1, 7);
INSERT INTO tb_alternativa (descricao, pontuacao, id_pergunta) VALUES ('Sem medo.', 2, 7);
INSERT INTO tb_alternativa (descricao, pontuacao, id_pergunta) VALUES ('Habilidoso/a.', 4, 7);

INSERT INTO tb_alternativa (descricao, pontuacao, id_pergunta) VALUES ('Homer.', 2, 8);
INSERT INTO tb_alternativa (descricao, pontuacao, id_pergunta) VALUES ('Marge.', 1, 8);
INSERT INTO tb_alternativa (descricao, pontuacao, id_pergunta) VALUES ('Bart.', 3, 8);
INSERT INTO tb_alternativa (descricao, pontuacao, id_pergunta) VALUES ('Lisa.', 4, 8);

INSERT INTO tb_resultado (img_url, nota_min, nota_max, personagem, id_quiz) VALUES ('https://github.com/FernandaUQ/Quiz/blob/main/images/homem-aranha.jpg', 8, 10, 'Homem-Aranha',1);
INSERT INTO tb_resultado (img_url, nota_min, nota_max, personagem, id_quiz) VALUES ('https://github.com/FernandaUQ/Quiz/blob/main/images/doutor-estranho.jpg', 11, 13, 'Doutor Estranho',1);
INSERT INTO tb_resultado (img_url, nota_min, nota_max, personagem, id_quiz) VALUES ('https://github.com/FernandaUQ/Quiz/blob/main/images/feiticeira-escarlate.jpg', 14, 16, 'Feiticeira Escarlate',1);
INSERT INTO tb_resultado (img_url, nota_min, nota_max, personagem, id_quiz) VALUES ('https://github.com/FernandaUQ/Quiz/blob/main/images/thor.jpg', 17, 19, 'Thor',1);
INSERT INTO tb_resultado (img_url, nota_min, nota_max, personagem, id_quiz) VALUES ('https://github.com/FernandaUQ/Quiz/blob/main/images/hulk.jpg', 20, 22, 'Hulk',1);
INSERT INTO tb_resultado (img_url, nota_min, nota_max, personagem, id_quiz) VALUES ('https://github.com/FernandaUQ/Quiz/blob/main/images/viuva-negra.jpg', 23, 25, 'Viúva Negra',1);
INSERT INTO tb_resultado (img_url, nota_min, nota_max, personagem, id_quiz) VALUES ('https://github.com/FernandaUQ/Quiz/blob/main/images/homem-de-ferro.jpg', 26, 28, 'Homem de Ferro',1);
INSERT INTO tb_resultado (img_url, nota_min, nota_max, personagem, id_quiz) VALUES ('https://github.com/FernandaUQ/Quiz/blob/main/images/capitao-america.jpg', 29, 32, 'Capitão América',1);