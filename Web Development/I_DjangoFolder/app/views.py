from django.shortcuts import render

# Create your views here.


def index(request):
    print(request)
    data = {
        "brand": "Ford",
        "model": "Mustang",
        "year": 1964
    }
    return render(request, 'index.html', {'datas': data})


def about(request):
    return render(request, 'about.html')


def gallery(request):
    return render(request, 'gallery.html')
