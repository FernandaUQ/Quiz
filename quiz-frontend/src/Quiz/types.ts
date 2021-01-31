import { type } from "os"

export type Quiz = {
    id: number;
    titulo: string;
    imgUrl: string;
    pergunta: [];
    resultado: [];
}

export type Pergunta = {
    id: number;
    corpo: string;
    alternativa: [];
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