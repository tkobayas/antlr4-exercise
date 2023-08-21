grammar Interpreter;

options { tokenVocab=InterpreterLexer; }

start  :
     expression  EOF
  ;

expression
   :
   |   INT
   |   expression (DRL_PLUS | MINUS) expression
   ;


