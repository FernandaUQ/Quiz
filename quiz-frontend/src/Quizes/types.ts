import { type } from "os"

export type Quiz = {
    id: number;
    titulo: string;
    imgUrl: string;
    perguntas: Pergunta[];
}

export type Pergunta = {
    id: number;
    corpo: string;
    alternativas: Alternativa[];
}

export type Alternativa = {
    id: number;
    descricao: string;
    pontuacao: number;
    selected: boolean;
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
