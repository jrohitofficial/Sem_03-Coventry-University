from django.urls import path
from item import views
urlpatterns = [
    path("", views.index),
    path("/create", views.create),
    path("/save", views.save)
]
