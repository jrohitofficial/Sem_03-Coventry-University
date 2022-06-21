from project.app import app


def test_index():
    tester = app.test_client()

    response = tester.get('/', content_type='html/text')

    assert response.status_code == 200
    assert response.data == b"Hello World"





def test_home():
    tester = app.test_client()

    response = tester.get('/home', content_type='html/text')

    assert response.status_code == 200
    assert response.data == b"Hello World"




def test_greet():
    tester = app.test_client()

    response = tester.get('/greet/Ram', content_type='html/text')

    assert response.status_code == 200
    assert response.data == b"Welcome, Ram"


