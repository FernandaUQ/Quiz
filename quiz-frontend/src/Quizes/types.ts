import { type } from "os"

export type Quiz = {
    id: number;
    titulo: string;
    imgUrl: string;
    perguntas: [];
    resultados: [];
}

export type Pergunta = {
    id: number;
    corpo: string;
    alternativas: [];
}

export type Alternativa = {
    id: number;
    descricao: string;
    pontuacao: number;
}

export type Resultado = {
    id: number;
    personagem: string;
    imgUrl: number;
    notaMin: number;
    notaMax: number;
}

type QuizId = {
    id: number;
}
