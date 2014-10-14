from fabric.api import *
from fabric.context_managers import *

def clean():
    """
    Cleanup .pyc *~ files and build related directories
    """
    local("rm -rf dist build build dist *.egg-info cover")
    local("find . \( ! -regex '.*/\..*/..*' \) -type f -name '*.class' -exec rm '{}' +")
    local("find . \( ! -regex '.*/\..*/..*' \) -type f -name '*~' -exec rm '{}' +")

