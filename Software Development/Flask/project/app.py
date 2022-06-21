from flask import Flask


# To initialize. Create an object
app = Flask(__name__)

@app.route('/')
@app.route('/home')  # Same function for different web pages.


def index():
    return "Something"



@app.route('/greet/<name>')
def greet(name):  # name from the get method
    return f"Welcome, {name}" 