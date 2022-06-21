from Flask import Flask


# To initialize. Create an object
app = Flask(__name__)

@app.route('/')
@app.route('/home')  # Same function for different web pages.

def index():
    return "Something"

