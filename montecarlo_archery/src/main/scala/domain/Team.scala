package domain

enum TeamName(val name: String):
  case TeamA extends TeamName("TeamA")
  case TeamB extends TeamName("TeamB")
