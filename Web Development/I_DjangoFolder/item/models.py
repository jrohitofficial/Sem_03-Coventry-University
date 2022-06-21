from django.db import models

# Create your models here.

class Item(models.Model):
    id = models.AutoField(auto_created=True, primary_key=True)
    itemName = models.CharField(max_length=255)


    class meta:
        db_table="item"