<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dashbord Secretaire</title>
    <link rel="stylesheet" href="assets/css/secretaire.css">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" rel="stylesheet">

</head>
<body>
    <section class="sidebar">
        <a href="#" class="logo">
            <i class="fab fa-slack"></i>
            <span class="text">RDVmedical</span>
        </a>
        <div class="options">
            <i class="fas fa-bars menu-btn"></i>
        </div>

        <ul class="side-menu top">
            
            <li class="active">
                <a href="#" class="nav-link">
                    <i class="fas fa-border-all"></i>
                    <span class="text">Historiques RDV</span>
                </a>
            </li>
            <li>
                <a href="#" class="nav-link">
                    <i class="fas fa-border-all"></i>
                    <span class="text">RDV avenir</span>
                </a>
            </li>
            <li>
                <a href="#" class="nav-link">
                    <i class="fas fa-border-all"></i>
                    <span class="text">Nouveau Personnel</span>
                </a>
            </li>
            <li>
                <a href="#" class="nav-link">
                    <i class="fas fa-border-all"></i>
                    <span class="text">Mettre a jour un Personnel</span>
                </a>
            </li>
            <li>
                <a href="#" class="nav-link">
                    <i class="fas fa-border-all"></i>
                    <span class="text">Supprimer un Personnel</span>
                    
                </a>
            </li>
            <li>
                <a href="#" class="nav-link">
                    <i class="fas fa-border-all"></i>
                    <span class="text">Ajouter un departement</span>
                    
                </a>
            <li>
                <a href="#" class="nav-link">
                    <i class="fas fa-border-all"></i>
                    <span class="text">Mettre a jour un departement</span>
                    
                </a>
          <li>
                <a href="#" class="nav-link">
                    <i class="fas fa-border-all"></i>
                    <span class="text">Supprimer un departement</span>
                    
                </a>
            </li>
            </li>
            </li>
        </ul>

        <ul class="side-menu">
            <!--
            <li>
                <a href="#">
                    <i class="fas fa-cog"></i>
                    <span class="text">Plus ...</span>
                </a>
            </li>
            <li>
                <a href="#" class="logout">
                    <i class="fas fa-right-from-bracket"></i>
                    <span class="text">Deconnexion</span>
                </a>
            </li>
            -->
        </ul>
    </section>
    
    <section class="sidebarTwo">

    </section>

    <section class="content">
        <nav>
            

            <form action="#">
                <div form-input>
                    
                    <button class="search-btn">
                        
                    </button>
                </div>
            </form>
        
            <input type="checkbox" hidden id="switch-mode" />
            <label for="switch-mode" class="switch-mode"></label>

            

            <a href="#" class="profile">
                <img src="user.png" alt="" />
            </a>
        </nav>

        <main>
            <div class="head-title">
                <a href="#" class="download-btn">
                    <i class="fas fa-border-all"></i>
                    <span class="text"> EGBOHOU William</span>
                </a>
            </div>
            <div class="table-data">
                <div class="order">
                    <div class="head">
                        <h3>DASHBOARD</h3>
                        <div id="data-container">
                            <!-- Les données seront insérées ici -->
                        </div>
                
                        
                    </div>
                </div>
            </div>
        </main>

    </section>

    <script src="assets/js/secretaire.js"></script>
</body>
</html>
