package jflexp.generated_sources;

import java_cup.runtime.*;
import java.io.*;
import jflexp.Parse;

%%

%class lexer

%public
%unicode
%cup
%line
%column

%{
    Parse file = new Parse();
    
    private static int m = 40;

    public static int getM(){
        return m;
    }

    public static void setM(int n){
        m = n;
    }

    public static void nextM(){
        m += 10;
    }
public static void decM(){
        m -= 10;
    }

    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }
    
    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }

%}


LineTerminator  = \r  |  \n  |  \r\n
NoChar          = [\t\f] | " "


%state COMMENT
%state YYINITIAL
%state TOOLNO
%state GOTO
%state SPINDL
%state FEDRAT
%state LAST_POINT
%state INDIRV
%state LINE
%state CIRCLE
%state COOLNT
%state CUTCOM
%state CUTTER
%state LOADTL
%state SWITCH
%state REWIND
%state INTOL
%state OUTTOL

%%

<YYINITIAL> {
	"$$" | "PARTNO" | "RAPID" | "END"      {yybegin(COMMENT);}
        "GOTO"                          {yybegin(GOTO); return symbol(sym.GOTO);}
        "TOOLNO"                        {yybegin(TOOLNO); return symbol(sym.TOOLNO);}	
        "SPINDL"                        {yybegin(SPINDL); return symbol(sym.SPINDL);}
        "FEDRAT"                        {yybegin(FEDRAT); return symbol(sym.FEDRAT);}
        "INDIRV"                        {yybegin(INDIRV); return symbol(sym.INDIRV);}
        "COOLNT"                        {yybegin(COOLNT); return symbol(sym.COOLNT);}
        "CUTCOM"                        {yybegin(CUTCOM); return symbol(sym.CUTCOM);}
        "CUTTER"                        {yybegin(CUTTER); return symbol(sym.CUTTER);}
        "LOADTL"                        {yybegin(LOADTL); return symbol(sym.LOADTL);}
        "SWITCH"                        {yybegin(SWITCH); return symbol(sym.SWITCH);}
        "REWIND"                        {yybegin(REWIND); return symbol(sym.REWIND);}
        "INTOL"                         {yybegin(INTOL);  return symbol(sym.INTOL);}
        "OUTTOL"                        {yybegin(OUTTOL); return symbol(sym.OUTTOL);}
        "AUTOPS"                        {}
	{NoChar}			{}
       	{LineTerminator}                {}
}

<COMMENT> {
	.*                               {}
	{LineTerminator}                {yybegin(YYINITIAL);}
}

<GOTO>  {
        "/"                             {return symbol(sym.SLASH);}
        ","                             {return symbol(sym.COMMA);}
        [-+]?[0-9]*[.][0-9]*            {return symbol(sym.NUMBER, new String(yytext()));}
	{NoChar}			{}
	{LineTerminator}                {yybegin(YYINITIAL);}
}

<TOOLNO> {
        "/"                             {return symbol(sym.SLASH);}
        [0-9]+                          {return symbol(sym.NUMBER, new String(yytext()));}
	{NoChar}			{}
        "TURN"                          {return symbol(sym.TURN);}
        ","                             {return symbol(sym.COMMA);}
	{LineTerminator}                {yybegin(YYINITIAL);}
}

<SPINDL>  {
        "/"                             {return symbol(sym.SLASH);}
        [0-9]*                          {return symbol(sym.NUMBER, new String(yytext()));}
        [-+]?[0-9]*[.][0-9]*            {return symbol(sym.NUMBER, new String(yytext()));}
        "OFF"                           {return symbol(sym.NUMBER, new String("0"));}
        ","                             {}
        "RPM"                           {}
	{NoChar}			{}
	{LineTerminator}                {yybegin(YYINITIAL);}
}

<FEDRAT> {
        "/"                             {return symbol(sym.SLASH);}
        [-+]?[0-9]*[.][0-9]*            {return symbol(sym.NUMBER, new String(yytext()));}
	{NoChar}			{}
        ","                             {return symbol(sym.COMMA);}
        "MMPR"                          {return symbol(sym.MMPR);}
	{LineTerminator}                {yybegin(YYINITIAL);}
}

<INDIRV> {
        "$"                             {}
        "/"                             {return symbol(sym.SLASH);}
        {NoChar}                        {}
        [-+]?[0-9]*[.][0-9]*            {return symbol(sym.NUMBER, new String(yytext()));}
        ","                             {return symbol(sym.COMMA);}
        {LineTerminator}                {yybegin(CIRCLE);}
}

<CIRCLE> {
        "$"                             {}
        "TLON"                          {return symbol(sym.TLON);}
        "GOFWD"                         {return symbol(sym.GOFWD);}
        ","                             {return symbol(sym.COMMA);}
        "/"                             {return symbol(sym.SLASH);}
        "("                             {return symbol(sym.LPAREN);}
        "CIRCLE"                        {return symbol(sym.CIRCLE);}
        [-+]?[0-9]*[.][0-9]*            {return symbol(sym.NUMBER, new String(yytext()));}
        {NoChar}                        {}
        {LineTerminator}                {yybegin(LINE);}
}

<LINE> {
        "$"                             {}
        [-+]?[0-9]*[.][0-9]*            {return symbol(sym.NUMBER, new String(yytext()));}
        "("                             {return symbol(sym.LPAREN);}
        ")"                             {return symbol(sym.RPAREN);}
        ","                             {return symbol(sym.COMMA);}
        "ON"                            {return symbol(sym.ON);}
        "LINE"                          {return symbol(sym.LINE);}
        "/"                             {return symbol(sym.SLASH);}
        {NoChar}                        {}
        {LineTerminator}                {yybegin(LAST_POINT);}
}

<LAST_POINT> {
        "$"                             {}
        [-+]?[0-9]*[.][0-9]*            {return symbol(sym.NUMBER, new String(yytext()));}
        ","                             {return symbol(sym.COMMA);}
        ")"                             {return symbol(sym.RPAREN);}
        {NoChar}                        {}
        {LineTerminator}                {yybegin(YYINITIAL);}
}

<COOLNT>    {
        "/"                             {return symbol(sym.SLASH);}
        "ON"                            {return symbol(sym.ON);}
        {NoChar}                        {}
        {LineTerminator}                {yybegin(YYINITIAL);}
}

<CUTCOM>    {
        "/"                             {return symbol(sym.SLASH);}
        "OFF"                           {return symbol(sym.OFF);}
        "ON"                           {return symbol(sym.ON);}
        {NoChar}                        {}
        {LineTerminator}                {yybegin(YYINITIAL);}
}

<CUTTER>    {
        "/"                             {return symbol(sym.SLASH);}
        [-+]?[0-9]*[.][0-9]*            {return symbol(sym.NUMBER, new String(yytext()));}
        {NoChar}                        {}
        {LineTerminator}                {yybegin(YYINITIAL);}
}

<SWITCH>    {
        "/"                             {return symbol(sym.SLASH);}
        [0-9]+                          {return symbol(sym.NUMBER);}
        {NoChar}                        {}
        {LineTerminator}                {yybegin(YYINITIAL);}
}

<REWIND> {
        "/"                             {return symbol(sym.SLASH);}
        [0-9]+                          {return symbol(sym.NUMBER);}
        {NoChar}                        {}
        {LineTerminator}                {yybegin(YYINITIAL);}
}

<LOADTL> {
        "/"                             {return symbol(sym.SLASH);}
        [0-9]+                          {return symbol(sym.NUMBER);}
        {NoChar}                        {}
        {LineTerminator}                {yybegin(YYINITIAL);}
}

<INTOL>{
        "/"                             {return symbol(sym.SLASH);}
        [-+]?[0-9]*[.][0-9]*            {return symbol(sym.NUMBER, new String(yytext()));}
        {NoChar}                        {}
        {LineTerminator}                {yybegin(YYINITIAL);}
}

<OUTTOL>{
        "/"                             {return symbol(sym.SLASH);}
        [-+]?[0-9]*[.][0-9]*            {return symbol(sym.NUMBER, new String(yytext()));}
        {NoChar}                        {}
        {LineTerminator}                {yybegin(YYINITIAL);}
}