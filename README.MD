<h1>Héritage en JPA</h1>
<p>Dans ce projet, nous avons utilisé Spring Data JPA avec l'interface JpaRepository pour bénéficier des méthodes CRUD. La base de données en mémoire H2 est utilisée pour le stockage des données.</p>

<h2>Premier commit 1 :</h2>
<p>Dans ce premier commit, nous avons appliqué la stratégie SINGLE_TABLE avec les annotations suivantes :</p>

<ul>
<li>@Inheritance(strategy = InheritanceType.SINGLE_TABLE) pour définir l'héritage.</li>
<li>@DiscriminatorColumn(name = "TYPE") pour ajouter une colonne qui différencie les objets.</li>
<li>@DiscriminatorValue("PERSONNE") sur la classe mère</li>
<li>@DiscriminatorValue("PROF"), @DiscriminatorValue("ETU") pour identifier chaque sous-classe.</li>
</ul>
<h2>Deuxième commit 2 :</h2> 
<p>Dans ce deuxième commit, nous avons appliqué la stratégie TABLE_PER_CLASS, où chaque sous-classe possède sa propre table contenant toutes les colonnes de la classe mère.</p> 
<ul> 
<li>Nous avons utilisé l'annotation suivante sur la classe mère pour définir cette stratégie : @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)</li> 
<li>De plus, nous avons rendu la classe Personne abstraite pour éviter la création d'une table inutile : public abstract class Personne { ... }</li> 
</ul>

<h2>Troisième commit 3 :</h2>
<p>Dans ce troisième commit, nous avons appliqué la stratégie JOINED, où chaque sous-classe possède sa propre table, mais les données communes sont stockées dans la table de la classe mère.</p>
<ul>
<li>Nous avons utilisé l'annotation suivante sur la classe mère pour définir cette stratégie : @Inheritance(strategy = InheritanceType.JOINED)</li>
<li>Nous avons également ajouté @PrimaryKeyJoinColumn pour lier les clés primaires entre les tables : @PrimaryKeyJoinColumn(name = "id")</li>
<li>Enfin, la classe Personne reste abstraite pour éviter la création d'instances directes.</li>
</ul>

